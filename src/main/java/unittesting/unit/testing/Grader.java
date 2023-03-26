package unittesting.unit.testing;

public class Grader {
    
    public char determineLetterGrade(int numberGrade){

        if (numberGrade < 0){
            throw new IllegalArgumentException("Number Grade cannot be negative");
        }
        else if (numberGrade < 60){
            return 'F';
        }

        else if (numberGrade < 70){
            return 'D';
        }
        else if (numberGrade < 80){
            return 'C';
        }

        else {
            return 'A';
        }


    
    }
}
