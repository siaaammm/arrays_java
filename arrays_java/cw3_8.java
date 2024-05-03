/* 
  Write a Java program that asks the user for the length of an array 
  and then creates an integer array of that length by taking inputs from the user. Then, 
  a. Reverse the array by creating a new array of the same length and print it. (Out-of Place) 
  b. Reverse the array without creating any new arrays and print it. (In-Place) 
*/


import java.util.Scanner;

public class cw3_8 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int N = sc.nextInt();
    int[] array1 = new int[N];
    
    for (int i = 0; i <= array1.length - 1; i++) {
      System.out.print("Enter a number: ");
      array1[i] = sc.nextInt();
    }
    
    int[] array2 = new int[N];
    int j = 0;
    for (int i = N - 1; i >= 0; i--) {
      array2[j] = array1[i]; 
      j++;
    }
    
    System.out.println("Reversed using a new array: ");
    for (int i = 0; i < array2.length; i++) {
      System.out.print(array2[i] + " ");
    }
    
    System.out.println();
    System.out.println("Reversed the original array: ");
    for (int i = N - 1; i >= 0; i--) {
      System.out.print(array1[i] + " ");
    }
    
    sc.close();
  }
}
