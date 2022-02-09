/**
 * Model Class for the Student object
 */
public class Student implements IStudent, Comparable{
    private String name;
    private int code;

    /**
     * Builder of Student object, storing its name and code.
     * @param name The name of the student
     * @param code The code that identifies the student
     */
    public Student(String name, int code){
        this.name = name;
        this.code = code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCode() {
        return code;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
