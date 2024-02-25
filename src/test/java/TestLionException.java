import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class TestLionException {

    @Test
    public void testLionManeException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Транслев");
            lion.doesHaveMane();
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - Самец или Самка", exception.getMessage());
    }
}
