import org.example.Main;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class test {

 @Test
    public void testAdd() {
        Main main = new Main();
        assertEquals(5, main.add(4, 7), "2 + 3 devrait être égal à 5");
    }


    }



