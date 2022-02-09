import java.util.ArrayList;

/**
 * The implementation of the sorts to be profiled
 */
public class Sorts implements ISorts{

    @Override
    public void gnomeSort() {

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
    public void recursiveBubbleSort(ArrayList<Student> arr, int n) {
        // SOURCE CODE BY GeeksForGeeks: https://www.geeksforgeeks.org/recursive-bubble-sort/
        // BASE CASE
        if(n <= 1){
            return;
        }

        for(int i = 0; i < n-1; i++){ //TO FIND THE LARGEST ELEMENT IN THE ARRAYLIST
            if(arr.get(i).compareTo(arr.get(i+1)) == 1){ // IF THE NEXT ONE IS BIGGER
                Student temp = arr.get(i);
                arr.set(i, arr.get(i+1));
                arr.set(i+1, temp);
            }
        }
        // THE BIGGEST ELEMENT IS FIXED
        recursiveBubbleSort(arr, n-1);
    }
}
