import java.util.ArrayList;

/**
 * Interface for all sorts to be implemented and profiled
 */
public interface ISorts {
  /**
   * Applies 'gnome sort' to the data specified in the Sorts Constructor
   * 
   * @param ArrayList<Student>
   * @param int n
   * 
   * @return Sorted vector after gnome sort
   */
  public void gnomeSort(ArrayList<Student> arr, int n);

  /**
   * part of the realMergeSort process
   * @param ArrayList<Student> arr
   * @param int l
   * @param int m
   * @param int r
   * @return Sorted vector after 'merge sort'for realMergeSort to use
   */
  public void mergeSort(ArrayList<Student> arr, int l, int m, int r);

  /**
   * Applies "realMergeSort" to the data specified in the Sorts Constructor
   * @param int l
   * @param int r
   * @return Sorted vector after 'realMerge sort'
   */
  public void realMergeSort(ArrayList<Student> arr, int l, int r);

  /**
   * Applies 'quick sort' to the data specified in the Sorts Constructor
   * @param ArrayList<Student> arr
   * @param int low
   * @param int high
   * 
   * @return Sorted vector after 'quick sort'
   */
  public void quickSort(ArrayList<Student> arr, int low, int high);
  
  /**
   * Part of the quickSort process
   * 
   * @param ArrayList<Student> arr
   * @param int i
   * @param int j
   * 
   * @return Sorted vector after 'merge sort'
   */
  public void swap(ArrayList<Student> arr, int i, int j);
  
  /**
   * Part of the quickSort process
   * 
   * @param ArrayList<Student> arr
   * @param int low
   * @param int high
   * 
   * @return Sorted vector after 'partition" for quickSort to use
   */
  public int partition(ArrayList<Student> arr, int low, int high);
  
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
