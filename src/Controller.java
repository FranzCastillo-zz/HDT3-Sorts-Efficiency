import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;

/**
 * This is the Controller of the MVC implementation for the Sorts profiling
 */
public class Controller {
    private Sorts sorts;
    private Vista v;
    private Vector<Student> data;

    /**
     * Constructor for the Controller
     */
    public Controller(){
        v = new Vista();
        data = new Vector<>();
    }

    /**
     * Driver program, this is the core of the project.
     */
    public void execute(){
        v.start();
        // TO CHECK IF THE FILE DOESN'T EXIST
        if(!readFile()) {
            createUnsortedFile(v.askInt(10, 3000));
        }
        // TO THIS POINT THE FILE MUST EXIST AND BE ALREADY READ
        sorts = new Sorts(data);
        /*sorts.recursiveBubbleSort();
        // OVERWRITES THE FILE WITH THE SORTED DATA
        createSortedFile();*/
    }

    /** Tries to read the file 'data.txt' on the same path.
     * @return boolean TRUE if the file was successfully read, FALSE if not
     */
    private boolean readFile(){
        try{
            File file = new File("src\\data.txt");
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] temp = line.split(",");
                // CREATES A NEW STUDENT WITH THE FORMAT ON THE FILE (e.g. cas,21562)
                data.add(new Student(temp[0], Integer.parseInt(temp[1]) ) );
            }
            fileReader.close();
            v.readSuccessfully();
            return true;
        }catch(FileNotFoundException e){
            v.fileNotFound();
            return false;
        }
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
        String[] names = {"Castillo", "Centes", "Quezada", "Cerna", "Casasola", "Reyes"}; //THE RANDOM NAMES ASSIGNED TO STUDENTS

        int studentCount = 0;
        String temp = "";
        while(studentCount++ <= n){
            temp += names[getRandomInt(0, names.length)]; //GETS A RANDOM NAME
            temp += ",";
            temp += getRandomInt(0,22000);
            temp+= "\n";
            // TEMP FORMAT BY HERE: name,code\n
        }
        try {
            FileWriter fileWriter = new FileWriter("src\\data.txt");
            fileWriter.write(temp);
            fileWriter.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    /**
     * Converts the sorted data from the vector to a file called 'data.txt'
     * Note: It must be sorted before calling this method.
     */
    private void createSortedFile(){
        try{
            String temp = "";
            for (Student student:
                    data) {
                temp += student.getName();
                temp += ",";
                temp += student.getCode();
                temp += "\n";
            }
            FileWriter fileWriter = new FileWriter("src\\data.txt");
            fileWriter.write(temp);
            fileWriter.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
