package xyz.fokion

import xyz.fokion.builder.DummyScanner

def call(String url , int port) {
    ContextRegistry.registerDefaultContext(this)
    def scanner = new DummyScanner.Builder(url).setPort(port).build()
    scanner.analysis()
    scanner.commit()
}
