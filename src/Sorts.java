import java.util.Vector;

/**
 * The implementation of the sorts to be profiled
 */
public class Sorts implements ISorts{
    private Vector<Student> data;

    /**
     * Constructor for the Sorts object
     * @param data the data vector to be sorted
     */
    public Sorts(Vector<Student> data){
        this.data = data;
    }

    @Override
    public Vector<Student> gnomeSort() {
        return null;
    }

    @Override
    public Vector<Student> mergeSort() {
        return null;
    }

    @Override
    public Vector<Student> quickSort() {
        return null;
    }

    @Override
    public Vector<Student> radixSort() {
        return null;
    }

    @Override
    public Vector<Student> recursiveBubbleSort() {
        // SOURCE CODE BY GeeksForGeeks: https://www.geeksforgeeks.org/recursive-bubble-sort/
        return null;
    }
}
