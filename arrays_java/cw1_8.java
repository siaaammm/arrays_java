/*
  Write a Java program that will take N integer numbers from the user 
  and create an array of length N.  
  a. Print the elements of the array with their indices. 
  b. Take another integer input from the user, resize the array by length 1, 
  and add the new integer value to the array. Print the resized array.
*/

import java.util.Scanner;
public class cw1_8 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of N: "); 
    int N = sc.nextInt(); 
    int [] arr1 = new int [N]; 
    
    for (int i = 0; i <= arr1.length-1; i++) {    
      System.out.print("enter number: ");     
      arr1 [ i ] = sc.nextInt();     
    } 
    
    System.out.println("The elements of the array are: ");
    
    for (int i = 0; i <= arr1.length-1; i++) {  
      System.out.println( i + " : " + arr1 [i]);
    }
    
    System.out.print("enter another number: ");
    
    int[] arr2 = new int [N + 1];
    arr2[N] = sc.nextInt(); 
    
    for (int i = 0; i < arr2.length - 1; i++) { 
      arr2[i] = arr1[i];
    }
    
    System.out.println("After resizing the array: ");
    
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
    
    sc.close ();   
    
  } 
}
