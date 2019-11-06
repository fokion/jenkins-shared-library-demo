package xyz.fokion;

import org.junit.Test;
import xyz.fokion.builder.Builder;
import xyz.fokion.builder.DummyScanner;

import static org.mockito.Mockito.verify;

public class DummyScannerTest extends BaseTest {
    @Test
    public void build_callsShStep() {
        DummyScanner scanner = new Builder("localhost").setPort(1234).build();
        scanner.analysis();
        verify(executor).sh("echo localhost");
    }
}
