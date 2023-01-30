import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;


    @RunWith(MockitoJUnitRunner.class)
    public class CatTest {
        @Mock
        Predator predator;

        @Test
        public void getSoundReturnCorrectValue() {
            Cat cat = new Cat(new Feline());
            String expectedSound = "Мяу";
            String actualSound = cat.getSound();
            Assert.assertEquals(expectedSound, actualSound);
        }

        @Test
        public void getFoodReturnCorrectValue() throws Exception {
            Cat cat = new Cat(new Feline());
            List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
            Mockito.when(predator.eatMeat()).thenReturn(expectedFood);
            List<String> actualFood = cat.getFood();
            Assert.assertEquals(expectedFood, actualFood);
        }

}
