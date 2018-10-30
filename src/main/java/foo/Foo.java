package foo;

import java.io.InputStream;

public class Foo {
    public InputStream doIt(String resourceName) {
        return Foo.class.getResourceAsStream(resourceName);
    }
}
