import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FbTest {

	@Test
	public void FizzBuzzStepCaseThree(){
		assertEquals("Fizz", FizzBuzzMain.Go(3));
		assertEquals("Buzz", FizzBuzzMain.Go(5));
		assertEquals("8", FizzBuzzMain.Go(8));
	}

	@Test
	public void FizzBuzzStepCaseAll(){
		FizzBuzzMain f=new FizzBuzzMain();
		assertEquals("1", f.GoAll(25).get(0));
		assertEquals("Fizz", f.GoAll(25).get(2));
		assertEquals("4", f.GoAll(25).get(3));
		assertEquals("Buzz", f.GoAll(25).get(4));
		assertEquals("FizzBuzz", f.GoAll(25).get(14));
	}
	
	


}
