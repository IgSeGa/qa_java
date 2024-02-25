import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestCat {

    Cat cat = new Cat(new Feline());

    @Test
    public void testSound(){
        Assert.assertEquals(cat.getSound(), "Мяу");
    }

    @Test
    public void testFood() throws Exception {
        Assert.assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}
