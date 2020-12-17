import java.util.ArrayList;
import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean sorted = false;
    while (!sorted){
      sorted = true;
      int temp;
      for (int i = 0; i < data.length - 1; i++){
        if (data[i] > data[i+1]){
          sorted = false;
          temp = data[i+1];
          data[i+1] = data[i];
          data[i] = temp;
          //System.out.println(Arrays.toString(data));
        }
        //System.out.println(Arrays.toString(data));
      }
    }
  }

  public static void selectionSort(int[] data){
    int minIndex;
    int temp;
    for (int i = 0; i < data.length; i++){
      minIndex = i;
      for (int j = i; j < data.length; j++){
        if(data[j] < data[minIndex]){
          minIndex = j;
        }
      }
      temp = data[i];
      data[i] = data[minIndex];
      data[minIndex] = temp;
      System.out.println(Arrays.toString(data));
    }
  }
}
