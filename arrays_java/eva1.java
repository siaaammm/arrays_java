/*
  Take an integer N input from the user and create an integer array of N numbers 
  by taking inputs from the user. Then, print the array. Next, modify the array by changing 
  the positive numbers by 1 and the negative numbers by 0. 
  If the element is zero, then it will be unchanged. Lastly, print the modified array
*/

import java.util.Scanner;
public class eva1 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] array = new int[size];
    System.out.println("N: " + size);
    
    System.out.println("Enter the elements of the array:");
    
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt(); 
    }
    
    System.out.println("Original array:");
    
    for (int i = 0; i < size; i++) {
      System.out.print(array[i] + " "); 
    }
    
    System.out.println();
    
    for (int i = 0; i < size; i++) { 
      if (array[i] > 0) {
        array[i] = 1; 
      } else if (array[i] < 0) { 
        array[i] = 0; 
      }
    }
    
    System.out.println("After modifying:");
    
    for (int i = 0; i < size; i++) {
      System.out.print(array[i] + " "); // 1 1 0 1
    }
    
    sc.close ();
    
  }
}
