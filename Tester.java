import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Tester{
  public static void main(String args[]){
    System.out.println("Bubble Sort Tests:");

    int [] array1 = new int[]{5,1,12,-5,16};
    System.out.println(Arrays.toString(array1));
    Sorts.bubbleSort(array1);
    System.out.println(Arrays.toString(array1));
    System.out.println("**************************");

    int [] array2 = new int[]{2,3,4,5,1};
    System.out.println(Arrays.toString(array2));
    Sorts.bubbleSort(array2);
    System.out.println(Arrays.toString(array2));
    System.out.println("**************************");

    int [] array3 = new int[]{6,1,2,3,4,5};
    System.out.println(Arrays.toString(array3));
    Sorts.bubbleSort(array3);
    System.out.println(Arrays.toString(array3));
    System.out.println("**************************");

    int [] array4 = new int[]{1,2,3,4,5,6,7,8,9};
    System.out.println(Arrays.toString(array4));
    Sorts.bubbleSort(array4);
    System.out.println(Arrays.toString(array4));
    System.out.println("**************************");

    int [] array5 = new int[]{9,9,1,1,2,2,3,4,5,5};
    System.out.println(Arrays.toString(array5));
    Sorts.bubbleSort(array5);
    System.out.println(Arrays.toString(array5));
    System.out.println("**************************");

    int [] array6 = new int[]{9,8,7,6,5,4,3,2,1};
    System.out.println(Arrays.toString(array6));
    Sorts.bubbleSort(array6);
    System.out.println(Arrays.toString(array6));
    System.out.println("**************************");

    int [] array7 = new int[]{0,0,0,0,0,0,0,0,0,0,0};
    System.out.println(Arrays.toString(array7));
    Sorts.bubbleSort(array7);
    System.out.println(Arrays.toString(array7));
    System.out.println("**************************");

    int [] empty = new int[]{};
    System.out.println(Arrays.toString(empty));
    Sorts.bubbleSort(empty);
    System.out.println(Arrays.toString(empty));
    System.out.println("**************************");

    Random rngSeed = new Random();
    int seed = rngSeed.nextInt();
    System.out.print("seed: ");
    System.out.println(seed);
    System.out.println("**************************");
    Random rng = new Random(seed);
    int [] randomArray = new int [25];
    for(int i =  0; i < 25; i++ ){
      randomArray[i] = (rng.nextInt() % 100);
    }
    int[] randomKey = randomArray.clone();
    System.out.println(Arrays.toString(randomKey));
    Arrays.sort(randomKey);
    System.out.println(Arrays.toString(randomKey));
    System.out.println("**************************");
    System.out.println(Arrays.toString(randomArray));
    Sorts.bubbleSort(randomArray);
    System.out.println(Arrays.toString(randomArray));
    System.out.println(Arrays.equals(randomKey, randomArray));
    System.out.println("**************************");

    System.out.println("\nSelection Sort Tests:");
    int [] array8 = new int[]{64, 25, 12, 22, 11};
    Sorts.selectionSort(array8);
    System.out.println(Arrays.toString(array8));
    System.out.println("**************************");

    System.out.println("\nInsertion Sort Tests:");
    int [] array9 = new int[]{4,3,2,10,12,1,5,6};
    Sorts.insertionSort(array9);
    System.out.println(Arrays.toString(array9));
  }
}
