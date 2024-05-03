/*
  You are given an integer array with duplicate values. 
  Write a Java program to update the array by replacing the duplicate values of the array 
  with zero. Then print the updated array. [Your code should work for any given integer array]
*/

public class cw2_8 {
  public static void main(String[] args) {

    int array[] = { 9, -5, 7, 9, -5, 5, 7 };
    
    System.out.println("Before removing the duplicates:");
    
    for (int i = 0; i <= array.length - 1; i++) {
      System.out.print(array[i] + " "); 
    }

    for (int i = 0; i <= array.length - 1; i++) { 
      for (int j = i + 1; j <= array.length - 1; j++) { 
        if (array[i] == array[j]) { 
          array[j] = 0; 
        }
      }
    }

    System.out.println();
    System.out.println("After removing the duplicates with: ");

    for (int i = 0; i <= array.length - 1; i++) {
      System.out.print(array[i] + " ");
    }

  }
}
