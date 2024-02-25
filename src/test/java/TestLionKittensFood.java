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
    public void testKittens(){
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(123456789);
        Assert.assertEquals(lion.getKittens(), feline.getKittens());
    }

    @Test
    public void testFood() throws Exception {
        Lion lion = new Lion(feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
        Assert.assertEquals(lion.getFood(), feline.getFood("Хищник"));
    }
}
