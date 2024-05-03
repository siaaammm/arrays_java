/*
  You are given an integer array. You need to create a new array that will contain 
  only the unique elements of the given array. Finally, print the new array.
*/

public class hw2 {
  
    public static void main(String[] args) {
      int[] array1 = {23,100,23,56,100};
      
      System.out.println("Input array: ");
      
      for (int i = 0; i < array1.length; i++) {
        System.out.print(array1[i] + " ");
      }
      
      
      System.out.println();
      
      int[] array2 = new int[array1.length];
      int count = 0;
      
      for (int i = 0; i < array1.length; i++) {
        int currentElement = array1[i]; 
        int j;
        for (j = 0; j < count; j++) { 
          if (array2[ j ] == currentElement) { 
            break;
          }
        }
        
        if (j == count) { 
          array2[count] = currentElement; 
          count++; 
        }
      }
      
      System.out.println("New array: ");
      
      for (int i = 0; i < count; i++) {
        System.out.print(array2[i] + " ");
      }
  
    }
  }
  
  