import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestLionKittensFood {

    @Mock
    Feline feline;

    @Test
    public void testKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(123456789);
        Assert.assertEquals(feline.getKittens(), lion.getKittens());
    }

    @Test
    public void testFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
        Assert.assertEquals(feline.getFood("Хищник"), lion.getFood());
    }
}
