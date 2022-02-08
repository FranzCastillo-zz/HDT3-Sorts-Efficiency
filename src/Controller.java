import java.util.Vector;

/**
 * This is the Controller of the MVC implementation for the Sorts profiling
 */
public class Controller {
    private Sorts sorts;
    private Vista v;
    private Vector<Student> data;

    /**
     * Driver program, this is the core of the project.
     */
    public void execute(){

    }

    /**
     * Generate a random integer in range of the specified values
     * @param lowerLimit lower limit of the range
     * @param upperLimit upper limit of the range
     * @return a random integer in range of the specified values
     */
    private int getRandomInt(int lowerLimit, int upperLimit){
        return (int) ((Math.random() * (upperLimit - lowerLimit)) + lowerLimit);
    }

    /**
     * Creates a file called 'data.txt' with randomly generated student info.
     * @param n The amount of students to generate
     */
    private void createUnsortedFile(int n){

    }

    /**
     * Converts the sorted data from the vector to a file called 'sortedData.txt'
     * Note: It must be sorted before calling this method.
     */
    private void createSortedFile(){

    }
}
