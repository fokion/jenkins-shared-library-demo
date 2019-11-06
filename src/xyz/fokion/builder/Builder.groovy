package xyz.fokion.builder

import com.cloudbees.groovy.cps.NonCPS


class Builder {
    private String url
    private int port
  
    Builder(String url) {
        this.url = url
    }
    @NonCPS
    Builder setPort(int port) {
        this.port = port
        return this
    }
    @NonCPS
    def getPort() {
        return port
    }
    @NonCPS
    def getUrl() {
        return url
    }
    @NonCPS
    DummyScanner build() {
        return new DummyScanner(this)
    }
}