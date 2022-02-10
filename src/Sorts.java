import java.util.ArrayList;
import java.util.Arrays;

/**
 * The implementation of the sorts to be profiled
 */
public class Sorts implements ISorts {

  @Override
  public void gnomeSort(ArrayList<Student> arr, int n) {
    // SOURCE CODE BY GeeksForGeeks:
    // https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
    // BASE CASE
    int cont = 0;

    while (cont < n) {
      if (cont == 0)
        cont++;
      if (arr.get(cont).compareTo(arr.get(cont - 1)) == 1)
        cont++;
      else {
        Student temp = null;
        temp = arr.get(cont);
        arr.set(cont, arr.get(cont - 1));
        arr.set(cont - 1, temp);
        cont--;
      }
    }
  }

  @Override
  public void mergeSort(ArrayList<Student> arr, int l, int m, int r) {
    //SOURCE CODE BY: https://www.geeksforgeeks.org/merge-sort/
    // Find sizes of two subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;

    /* Create temp arrays */
    Student L[] = new Student[n1];
    Student R[] = new Student[n2];

    /* Copy data to temp arrays */
    for (int i = 0; i < n1; ++i)
      L[i] = arr.get(l + i);

    for (int j = 0; j < n2; ++j)
      R[j] = arr.get(m + 1 + j);

    /* Merge the temp arrays */

    // Initial indexes of first and second subarrays
    int i = 0, j = 0;

    // Initial index of merged subarray array
    int k = l;
    while (i < n1 && j < n2) {
      if (L[i].compareTo(R[j]) == -1) {
        arr.set(k, L[i]);
        i++;
      } else {
        arr.set(k, R[j]);
        j++;
      }
      k++;
    }

    /* Copy remaining elements of L[] if any */
    while (i < n1) {
      arr.set(k, L[i]);
      i++;
      k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2) {
      arr.set(k, R[j]);
      j++;
      k++;
    }
  }

  @Override
  public void realMergeSort(ArrayList<Student> arr, int l, int r) {
    if (l < r) {
      //SOURCE CODE BY: https://www.geeksforgeeks.org/merge-sort/
      // Find the middle point
      int m = l + (r - l) / 2;

      // Sort first and second halves
      realMergeSort(arr, l, m);
      realMergeSort(arr, m + 1, r);

      // Merge the sorted halves
      mergeSort(arr, l, m, r);
    }
  }

  public void swap(ArrayList<Student> arr, int i, int j){
      //SOURCE CODE BY: https://www.geeksforgeeks.org/quick-sort/?ref=lbp

      Student temp = arr.get(i);
      arr.set(i,arr.get(j));
      arr.set(j,temp);
  }

  public int partition(ArrayList<Student> arr, int low, int high){
      //SOURCE CODE BY: https://www.geeksforgeeks.org/quick-sort/?ref=lbp

      // pivot
      Student pivot = arr.get(high);
         
      // Index of smaller element and
      // indicates the right position
      // of pivot found so far
      int i = (low - 1);
     
      for(int j = low; j <= high - 1; j++)
      {
             
      // If current element is smaller
      // than the pivot
      if (arr.get(j).compareTo(pivot) == 1)
      {
        // Increment index of
        // smaller element
        i++;
        swap(arr, i, j);
      }
      }
      swap(arr, i + 1, high);
      return (i + 1);
  }
  
  @Override
  public void quickSort(ArrayList<Student> arr, int low, int high) {
      //SOURCE CODE BY: https://www.geeksforgeeks.org/quick-sort/?ref=lbp
      if (low < high)
      {
             
        // pi is partitioning index, arr[p]
        // is now at right place
        int pi = partition(arr, low, high);
 
        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
      }
  }

  @Override
  public int getMax(ArrayList<Student> arr, int n) {
    // SOURCE CODE BY GeeksForGeeks:
    // https://www.geeksforgeeks.org/radix-sort/

    Student mx = arr.get(0);
    for (int i=1; i < n; i++)
      if (arr.get(i).compareTo(mx) == 1)
        mx = arr.get(i);
    return mx.getCode();
  }

  @Override
  public void countSort(ArrayList<Student> arr, int n, int exp) {
    // SOURCE CODE BY GeeksForGeeks:
    // https://www.geeksforgeeks.org/radix-sort/
    Student output[] = new Student[n]; // output array
    int i;
    int count[] = new int[10];
    Arrays.fill(count, 0);

    // Store count of occurrences in count[]
    for (i = 0; i < n; i++)
      count[(arr.get(i).getCode() / exp) % 10]++;

    // Change count[i] so that count[i] now contains
    // actual position of this digit in output[]
    for (i = 1; i < 10; i++)
      count[i] += count[i - 1];

    // Build the output array
    for (i = n - 1; i >= 0; i--) {
      output[count[(arr.get(i).getCode() / exp) % 10] - 1] = arr.get(i);
      count[(arr.get(i).getCode() / exp) % 10]--;
    }

    // Copy the output array to arr[], so that arr[] now
    // contains sorted numbers according to current digit
    for (i = 0; i < n; i++)
      arr.set(i, output[i]);
  }

  @Override
  public void radixSort(ArrayList<Student> arr, int n) {
    // SOURCE CODE BY GeeksForGeeks:
    // https://www.geeksforgeeks.org/radix-sort/
    int m = getMax(arr, n);
    // Do counting sort for every digit. Note that
    // instead of passing digit number, exp is passed.
    // exp is 10^i where i is current digit number
    for (int exp = 1; m / exp > 0; exp *= 10)
      countSort(arr, n, exp);
  }

  @Override
  public void recursiveBubbleSort(ArrayList<Student> arr, int n) {
    // SOURCE CODE BY GeeksForGeeks:
    // https://www.geeksforgeeks.org/recursive-bubble-sort/
    // BASE CASE
    if (n <= 1) {
      return;
    }

    for (int i = 0; i < n - 1; i++) { // TO FIND THE LARGEST ELEMENT IN THE ARRAYLIST
      if (arr.get(i).compareTo(arr.get(i + 1)) == 1) { // IF THE NEXT ONE IS BIGGER
        Student temp = arr.get(i);
        arr.set(i, arr.get(i + 1));
        arr.set(i + 1, temp);
      }
    }
    // THE BIGGEST ELEMENT IS FIXED
    recursiveBubbleSort(arr, n - 1);
  }
}
