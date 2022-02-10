import java.util.ArrayList;

import org.junit.runners.model.Statement;

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
  public <Student> void gnomeSort(ArrayList<Student> arr, int n);

  /**
   * Applies 'merge sort' to the data specified in the Sorts Constructor
   * 
   * @return Sorted vector after 'merge sort'
   */
  public void mergeSort();

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
  public void radixSort();

  /**
   * Applies 'recursive bubble sort' to the data specified in the Sorts
   * Constructor
   * 
   * @param <Student>
   * 
   * @return Sorted vector after 'recursive bubble sort'
   */
  public <Student> void recursiveBubbleSort(ArrayList<Student> arr, int n);

}
