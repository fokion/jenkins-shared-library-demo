package xyz.fokion.builder

class Builder {
    private String url
    private int port

    Builder(String url) {
        this.url = url
    }

    Builder setPort(int port) {
        this.port = port
        return this
    }

    def getPort() {
        return port
    }

    def getUrl() {
        return url
    }

    DummyScanner build() {
        return new DummyScanner(this)
    }
}