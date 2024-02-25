import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    Feline feline;

    @Test
    public void testFamily(){
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testKittens(){
        feline.getKittens();
        Mockito.when(feline.getKittens()).thenReturn(1234567890);
        Assert.assertEquals(feline.getKittens(),feline.getKittens());
    }

    @Test
    public void testEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");
        Assert.assertEquals(feline.getFood("Хищник"), feline.eatMeat());
    }
}
