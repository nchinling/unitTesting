package unittesting.unit.testing;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void twoPlusTwoEqualsFour(){
		var calculator = new SimpleCalculator();
		assertEquals(10, calculator.add(4,6));
	
	}

	@Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(59));
    }

	@Test
    void ninetyNineShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(99));
    }

}
