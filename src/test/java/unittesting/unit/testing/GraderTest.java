package unittesting.unit.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class GraderTest {
    
    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(59));
    }
}
