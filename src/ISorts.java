import java.util.ArrayList;

/**
 * Interface for all sorts to be implemented and profiled
 */
public interface ISorts {
    /**
     * Applies 'gnome sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after gnome sort
     */
    public void gnomeSort();

    /**
     * Applies 'merge sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'merge sort'
     */
    public void mergeSort();

    /**
     * Applies 'quick sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'merge sort'
     */
    public void quickSort();

    /**
     * Applies 'radix sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'radix sort'
     */
    public void radixSort();

    /**
     * Applies 'recursive bubble sort' to the data specified in the Sorts Constructor
     * @return Sorted vector after 'recursive bubble sort'
     */
    public void recursiveBubbleSort(ArrayList<Student> arr, int n);

}
