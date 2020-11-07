import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestMetod1 {

    private int[] in;
    private int[] out;
    private Metods metod1;

    public TestMetod1(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 4, 5, 4, 5, 3, 0}, new int[]{5, 3, 0}},
                {new int[]{5, 3, 7, 5, 6, 4, 3, 1}, new int[]{3, 1}}
        });
    }

    @Before
    public void startTest() {
        metod1 = new Metods();
    }

    @Test
    public void testAfterFour() {
        Assert.assertArrayEquals(out, Metods.afterFour(in));
    }

    @Test(expected = RuntimeException.class)
    public void testAfterFourEx() {
        Metods.afterFour(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }

}
