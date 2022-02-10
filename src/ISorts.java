import java.util.ArrayList;

/**
 * Interface for all sorts to be implemented and profiled
 */
public interface ISorts {
  /**
   * Applies 'gnome sort' to the data specified in the Sorts Constructor
   * 
   * @param <Student>
   * 
   * @return Sorted vector after gnome sort
   */
  public void gnomeSort(ArrayList<Student> arr, int n);

  /**
   * Applies 'merge sort' to the data specified in the Sorts Constructor
   * 
   * @return Sorted vector after 'merge sort'
   */
  public void mergeSort(ArrayList<Student> arr, int l, int m, int r);

  /**
   * 
   * 
   * @return Sorted vector after 'merge sort'
   */
  public void realMergeSort(ArrayList<Student> arr, int l, int r);

  /**
   * Applies 'quick sort' to the data specified in the Sorts Constructor
   * 
   * @return Sorted vector after 'merge sort'
   */
  public void quickSort();

  /**
   * Applies 'radix sort' to the data specified in the Sorts Constructor
   * 
   * @return Sorted vector after 'radix sort'
   */
  public void radixSort(ArrayList<Student> arr, int n);

  /**
   * Applies 'getMax' to the data specified in the Sorts Constructor
   * 
   * @return maximun value in arr
   */
  public int getMax(ArrayList<Student> arr, int n);

  /**
   * Applies 'countSort' to the data specified in the Sorts Constructor
   * 
   * @return digit represented by exp
   */
  public void countSort(ArrayList<Student> arr, int n, int e);

  /**
   * Applies 'recursive bubble sort' to the data specified in the Sorts
   * Constructor
   * 
   * @param <Student>
   * 
   * @return Sorted vector after 'recursive bubble sort'
   */
  public void recursiveBubbleSort(ArrayList<Student> arr, int n);

}
