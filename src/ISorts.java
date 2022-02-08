import java.util.Vector;

/**
 * Interface for all sorts to be implemented and profiled
 */
public interface ISorts {
    /**
     * Applies 'gnome sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after gnome sort
     */
    public Vector<Student> gnomeSort();

    /**
     * Applies 'merge sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'merge sort'
     */
    public Vector<Student> mergeSort();

    /**
     * Applies 'quick sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'merge sort'
     */
    public Vector<Student> quickSort();

    /**
     * Applies 'radix sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'radix sort'
     */
    public Vector<Student> radixSort();

    /**
     * Applies 'recursive bubble sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'recursive bubble sort'
     */
    public Vector<Student> RecursiveBubbleSort();
}
