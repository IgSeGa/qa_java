import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

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
        Assert.assertEquals(feline.getKittens(), feline.getKittens());
    }

    @Test
    public void testEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");
        Assert.assertEquals(feline.getFood("Хищник"), feline.eatMeat());
    }
}
