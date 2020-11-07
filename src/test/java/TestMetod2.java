
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;


@RunWith(Parameterized.class)
public class TestMetod2 {

    private int[] in;
    private boolean out;
    private Metods metod2;

    public TestMetod2(int[] in, boolean out) {
        this.in = in;
        this.out = out;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 4, 4, 4, 1, 4, 1}, true},
                {new int[]{8, 8, 7, 7, 7, 3, 5, 1}, false},
                {new int[]{1, 4, 8, 7}, false}
        });
    }

    @Before
    public void startTest() {
        metod2 = new Metods();
    }

    @Test
    public void testOneAndFour() {
        Assert.assertEquals(Metods.oneAndFour(in), out);
    }

}
