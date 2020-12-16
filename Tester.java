import java.util.ArrayList;
import java.util.Arrays;
public class Tester{
  public static void main(String args[]){
    int [] array1 = new int[]{5,1,12,-5,16};
    System.out.println(Arrays.toString(array1));
    Sorts.bubbleSort(array1);
    int [] array2 = new int[]{2,3,4,5,1};
    System.out.println(Arrays.toString(array2));
    Sorts.bubbleSort(array2);
    int [] array3 = new int[]{6,1,2,3,4,5};
    System.out.println(Arrays.toString(array3));
    Sorts.bubbleSort(array3);
  }
}
