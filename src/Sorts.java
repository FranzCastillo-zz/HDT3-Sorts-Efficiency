import java.util.ArrayList;

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
    // Find sizes of two subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;

    /* Create temp arrays */
    Student L[] = new Student[n1];
    Student R[] = new Student[n2];

    /*Copy data to temp arrays*/
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
        if (L[i].compareTo(R[j]) == -1)
        {
            arr.set(k,L[i]);
            i++;
        }
        else {
            arr.set(k,R[j]);
            j++;
        }
        k++;
    }

    /* Copy remaining elements of L[] if any */
    while (i < n1) {
        arr.set(k,L[i]);
        i++;
        k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2) {
        arr.set(k,R[j]);
        j++;
        k++;
    }
  }


  public void realMergeSort(ArrayList<Student> arr, int l, int r){
       if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            realMergeSort(arr, l, m);
            realMergeSort(arr, m + 1, r);
  
            // Merge the sorted halves
            mergeSort(arr, l, m, r);
        }
  }
  
  @Override
  public void quickSort() {

  }

  @Override
  public void radixSort() {

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
