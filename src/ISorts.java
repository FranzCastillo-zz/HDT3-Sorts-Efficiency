import java.util.ArrayList;

/**
 * Interface for all sorts to be implemented and profiled
 */
public interface ISorts {
    /**
     * Applies 'gnome sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after gnome sort
     */
    public ArrayList<Student> gnomeSort();

    /**
     * Applies 'merge sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'merge sort'
     */
    public ArrayList<Student> mergeSort();

    /**
     * Applies 'quick sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'merge sort'
     */
    public ArrayList<Student> quickSort();

    /**
     * Applies 'radix sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'radix sort'
     */
    public ArrayList<Student> radixSort();

    /**
     * Applies 'recursive bubble sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'recursive bubble sort'
     */
    public ArrayList<Student> recursiveBubbleSort(ArrayList<Student> arr, int n);
}
