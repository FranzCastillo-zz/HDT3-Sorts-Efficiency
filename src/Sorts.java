import java.util.ArrayList;

/**
 * The implementation of the sorts to be profiled
 */
public class Sorts implements ISorts {

  @Override
  public <Student> void gnomeSort(ArrayList<Student> arr, int n) {
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
  public void mergeSort() {

  }

  @Override
  public void quickSort() {

  }

  @Override
  public void radixSort() {

  }

  @Override
  public <Student> void recursiveBubbleSort(ArrayList<Student> arr, int n) {
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
