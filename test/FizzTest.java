import static org.junit.Assert.*;
import org.junit.Test;
import fizzBuzz.*
public class FizzTest {

    @Test
    public void FizzBuzzStepCaseThree() {
        assertEquals("Fizz", Fizz.Go(3));
        assertEquals("Buzz", Fizz.Go(5));
        assertEquals("8", Fizz.Go(8));
    }

    @Test
    public void FizzBuzzStepCaseAll() {
        Fizz f = new Fizz();
        assertEquals("1", f.GoAll(25).get(0));
        assertEquals("Fizz", f.GoAll(25).get(2));
        assertEquals("4", f.GoAll(25).get(3));
        assertEquals("Buzz", f.GoAll(25).get(4));
        assertEquals("FizzBuzz", f.GoAll(25).get(14));
    }
}
