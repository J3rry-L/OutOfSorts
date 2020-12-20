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
    int [] array9 = new int[]{1,2,3,4,5,6,7,8,9,10};
    Sorts.selectionSort(array9);
    System.out.println(Arrays.toString(array9));
    System.out.println("**************************");
    int [] array10 = new int[]{10,9,8,7,6,5,4,3,2,1,0,-1};
    Sorts.selectionSort(array10);
    System.out.println(Arrays.toString(array10));
    System.out.println("**************************");
    Sorts.selectionSort(empty);
    System.out.println(Arrays.toString(empty));
    System.out.println("**************************");
    int [] randomArray2 = new int [25];
    for(int i =  0; i < 25; i++ ){
      randomArray2[i] = (rng.nextInt() % 100);
    }
    int[] randomKey2 = randomArray2.clone();
    System.out.println(Arrays.toString(randomKey2));
    Arrays.sort(randomKey2);
    System.out.println(Arrays.toString(randomKey2));
    System.out.println("**************************");
    System.out.println(Arrays.toString(randomArray2));
    Sorts.selectionSort(randomArray2);
    System.out.println(Arrays.toString(randomArray2));
    System.out.println(Arrays.equals(randomKey2, randomArray2));
    System.out.println("**************************");

    System.out.println("\nInsertion Sort Tests:");
    int [] array11 = new int[]{4,3,2,10,12,1,5,6};
    Sorts.insertionSort(array11);
    System.out.println(Arrays.toString(array11));
    System.out.println("**************************");
    int [] array12 = new int[]{1,2,3,4,5,6,7,8,9,10};
    Sorts.insertionSort(array12);
    System.out.println(Arrays.toString(array12));
    System.out.println("**************************");
    int [] array13 = new int[]{10,9,8,7,6,5,4,3,2,1,0,-1};
    Sorts.insertionSort(array13);
    System.out.println(Arrays.toString(array13));
    System.out.println("**************************");
    Sorts.insertionSort(empty);
    System.out.println(Arrays.toString(empty));
    System.out.println("**************************");
    int [] randomArray3 = new int [25];
    for(int i =  0; i < 25; i++ ){
      randomArray3[i] = (rng.nextInt() % 100);
    }
    int[] randomKey3 = randomArray3.clone();
    System.out.println(Arrays.toString(randomKey3));
    Arrays.sort(randomKey3);
    System.out.println(Arrays.toString(randomKey3));
    System.out.println("**************************");
    System.out.println(Arrays.toString(randomArray3));
    Sorts.insertionSort(randomArray3);
    System.out.println(Arrays.toString(randomArray3));
    System.out.println(Arrays.equals(randomKey3, randomArray3));
    System.out.println("**************************");
  }
}

/*
Expected output:

Bubble Sort Tests:
[5, 1, 12, -5, 16]
[-5, 1, 5, 12, 16]
**************************
[2, 3, 4, 5, 1]
[1, 2, 3, 4, 5]
**************************
[6, 1, 2, 3, 4, 5]
[1, 2, 3, 4, 5, 6]
**************************
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[1, 2, 3, 4, 5, 6, 7, 8, 9]
**************************
[9, 9, 1, 1, 2, 2, 3, 4, 5, 5]
[1, 1, 2, 2, 3, 4, 5, 5, 9, 9]
**************************
[9, 8, 7, 6, 5, 4, 3, 2, 1]
[1, 2, 3, 4, 5, 6, 7, 8, 9]
**************************
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
**************************
[]
[]
**************************
seed: 359660819
**************************
[33, 95, -95, 25, -6, 67, 39, 18, -64, 68, 9, -75, 56, 95, -93, -10, 42, -31, 57, 72, -57, -5, 74, 55, 87]
[-95, -93, -75, -64, -57, -31, -10, -6, -5, 9, 18, 25, 33, 39, 42, 55, 56, 57, 67, 68, 72, 74, 87, 95, 95]
**************************
[33, 95, -95, 25, -6, 67, 39, 18, -64, 68, 9, -75, 56, 95, -93, -10, 42, -31, 57, 72, -57, -5, 74, 55, 87]
[-95, -93, -75, -64, -57, -31, -10, -6, -5, 9, 18, 25, 33, 39, 42, 55, 56, 57, 67, 68, 72, 74, 87, 95, 95]
true
**************************

Selection Sort Tests:
[11, 12, 22, 25, 64]
**************************
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
**************************
[-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
**************************
[]
**************************
[-84, 64, -87, 67, -15, 78, -11, 70, 73, -16, -63, 12, 85, -62, -98, -66, 93, 41, 20, 92, -92, -35, 86, 45, -82]
[-98, -92, -87, -84, -82, -66, -63, -62, -35, -16, -15, -11, 12, 20, 41, 45, 64, 67, 70, 73, 78, 85, 86, 92, 93]
**************************
[-84, 64, -87, 67, -15, 78, -11, 70, 73, -16, -63, 12, 85, -62, -98, -66, 93, 41, 20, 92, -92, -35, 86, 45, -82]
[-98, -92, -87, -84, -82, -66, -63, -62, -35, -16, -15, -11, 12, 20, 41, 45, 64, 67, 70, 73, 78, 85, 86, 92, 93]
true
**************************

Insertion Sort Tests:
[1, 2, 3, 4, 5, 6, 10, 12]
**************************
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
**************************
[-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
**************************
[]
**************************
[87, -2, 21, 29, 82, 54, 96, -27, -25, 11, 25, 51, 38, 38, 4, 3, 98, -77, 49, 28, -3, 84, -87, -71, 85]
[-87, -77, -71, -27, -25, -3, -2, 3, 4, 11, 21, 25, 28, 29, 38, 38, 49, 51, 54, 82, 84, 85, 87, 96, 98]
**************************
[87, -2, 21, 29, 82, 54, 96, -27, -25, 11, 25, 51, 38, 38, 4, 3, 98, -77, 49, 28, -3, 84, -87, -71, 85]
[-87, -77, -71, -27, -25, -3, -2, 3, 4, 11, 21, 25, 28, 29, 38, 38, 49, 51, 54, 82, 84, 85, 87, 96, 98]
true
**************************
*/
