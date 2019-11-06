import xyz.fokion.ContextRegistry
import xyz.fokion.builder.Builder
import xyz.fokion.builder.DummyScanner

def call(String url) {
    ContextRegistry.registerDefaultContext(this)
    def scanner = new Builder(url).setPort(1234).build()
    scanner.analysis()
    scanner.commit()
}
