package xyz.fokion.builder

import xyz.fokion.ContextRegistry
import xyz.fokion.IStepExecutor

class DummyScanner implements Serializable , IScanner {
    private  String url
    private  int port

    private Scanner(Builder builder){
        url = builder.getUrl()
        port = builder.getPort()
    }

    @Override
    public void analysis() {
        IStepExecutor executor = getExecutor();
        int responseStatus = executor.sh("echo ${url}")
        if (responseStatus != 0) {
            executor.error("Some error on commit")
        }
    }

    @Override
    public void commit() {
        IStepExecutor executor = getExecutor()
        int responseStatus = executor.sh("echo ${port}")
        if (responseStatus != 0) {
            executor.error("Some error on commit")
        }
    }

    private IStepExecutor getExecutor(){
        return  ContextRegistry.getContext().getStepExecutor()
    }

    static class Builder{
        private String url
        private int port
        Builder(String url){
            this.url = url
        }
        def setPort(int port){
            this.port = port
            return this
        }

        def getPort() {
            return port
        }

        def getUrl() {
            return url
        }

        def build() {
            return new DummyScanner(this)
        }
    }
}
