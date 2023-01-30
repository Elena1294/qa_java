import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    @Test
    public void getFamilyReturnCorrectValue() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void eatMeatReturnCorrectValue() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getKittenReturnCorrectValue() {
        Feline feline = new Feline();
        int expectedKittenCount = 1;
        int actualKittenCount = feline.getKittens();
        Assert.assertEquals(expectedKittenCount, actualKittenCount);
    }

    @Test
    public void getKittensReturnCorrectValue() {
        Feline feline = new Feline();
        int expectedKittensCount = 2;
        int actualKittensCount = feline.getKittens(2);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
