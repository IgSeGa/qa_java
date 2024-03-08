import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;


public class TestLionException {

    @Mock
    Feline feline;
    @Test
    public void testLionManeException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Транслев", feline);
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - Самец или Самка", exception.getMessage());
    }
}
