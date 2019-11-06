import xyz.fokion.ContextRegistry
import xyz.fokion.builder.Builder


def call(String url , int port) {
    ContextRegistry.registerDefaultContext(this)
    def scanner = new Builder(url).setPort(port).build()
    scanner.analysis()
    scanner.commit()
}
