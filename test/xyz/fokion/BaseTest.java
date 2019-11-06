package xyz.fokion;

import org.junit.Before;

import static org.mockito.Mockito.*;

public class BaseTest {
    protected IContext context;
    protected IStepExecutor executor;

    @Before
    public void setup() {
        context = mock(IContext.class);
        executor = mock(IStepExecutor.class);

        when(context.getStepExecutor()).thenReturn(executor);

        ContextRegistry.registerContext(context);
    }
}
