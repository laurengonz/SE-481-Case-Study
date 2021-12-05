import org.junit.*;

public class HelloWorldTest {
    @Test
    public void testMain() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testFail() {
        Assert.assertEquals(1, 2);
    }

    @Test
    public void testFail2() {
        Assert.assertEquals(1, 3);
    }
}
