/*
  Write a Java program that asks the user the length of an array then takes that many 
  integer numbers as elements for the array as input. Then the program asks the user 
  to enter the target value. The program should add exactly two elements of the array 
  to find the target value and their corresponding indices. The program should print the 
  combination of elements that add up to give the target value and its corresponding index.
  If the target value does not exist, print “Target value not found”. 
  [Only consider the first pair if multiple pairs exist.]
*/

import java.util.Scanner;

public class hw4 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please enter the length of array: ");
    int len = sc.nextInt();
    
    int[] array = new int[len];
    
    System.out.println("Please enter the elements of the array:");
    for (int i = 0; i < len; i++) {
      array[i] = sc.nextInt();
    }
    
    System.out.print("Please enter the target value: ");
    int targetValue = sc.nextInt();
    
    for (int i = 0; i < len - 1; i++) {
      for (int j = i + 1; j < len; j++) {
        if (array[i] + array[j] == targetValue) {
          System.out.println("Elements need to be added: " + array[i] + " " + array[j]);
          System.out.println("Index of the elements: " + i + " and " + j);
          return;
        }
      }
    }
    
    System.out.println("Target value not found");

  }
}
