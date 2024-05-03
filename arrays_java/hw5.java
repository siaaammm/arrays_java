/*
  Take an integer N input from the user and create an array of length N 
  by taking the elements as user input. Then, print the array. 
  Next, sort the array in descending order using Selection Sort technique. 
  Lastly, print the sorted array.
*/

import java.util.Scanner;
public class hw5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the length of the array: ");
    int N = sc.nextInt(); 
    
    int[] arr = new int[N];
    
    for (int i = 0; i < N; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Original Array:");
    for (int i = 0; i < N; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    
    
    for (int i = 0; i < arr.length - 1; i++) { 
      int max_index = i; 
      for (int j = i + 1; j < arr.length; j++) { 
        if (arr[ j ] > arr[max_index]) { 
          max_index = j; 
        }
      }
      int temp = arr[max_index];
      arr[max_index] = arr[i];
      arr[i] = temp;
    }
    
    System.out.println("Sorted Array in Ascending Order: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
