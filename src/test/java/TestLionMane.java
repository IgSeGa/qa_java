import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class TestLionMane {

    @Mock
    Feline feline;
    private final String sex;
    private final boolean result;

    public TestLionMane(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void testLionMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(result, lion.doesHaveMane());
    }

}
