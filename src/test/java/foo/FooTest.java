package foo;

import java.io.InputStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FooTest {
    @Test
    public void testDoIt() {
        Foo foo = new Foo();
        InputStream is = foo.doIt("/foo.properties");
        assertNotNull(is);
    }
}
