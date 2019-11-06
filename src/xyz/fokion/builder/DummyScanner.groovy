package xyz.fokion.builder

import xyz.fokion.ContextRegistry
import xyz.fokion.IStepExecutor

class DummyScanner implements Serializable , IScanner {
    private  String url
    private  int port

    DummyScanner(Builder builder){
        url = builder.getUrl()
        port = builder.getPort()
    }

    @Override
    void analysis() {
        IStepExecutor executor = ContextRegistry.getContext().getStepExecutor();
        int responseStatus = executor.sh("echo ${url}")
        if (responseStatus != 0) {
            executor.error("Some error on commit")
        }
    }

    @Override
    void commit() {
        IStepExecutor executor = ContextRegistry.getContext().getStepExecutor()
        int responseStatus = executor.sh("echo ${port}")
        if (responseStatus != 0) {
            executor.error("Some error on commit")
        }
    }
}
