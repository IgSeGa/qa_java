import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestCat {

    Cat cat = new Cat(new Feline());

    @Test
    public void testSound(){
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testFood() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
