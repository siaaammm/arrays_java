/*
Write a Java program that will take N integer numbers from the user 
and create an array of length N. Take another number from the user 
and print the index of the number where it is found first. If not found then print ‘Element not found’. 
Note: Think about how to apply the concept of flag and break in this task.
*/

import java.util.Scanner;
public class eva2 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("N: ");
    int N = sc.nextInt();
    int[] numbers = new int[N];
    
    for (int i = 0; i < N; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = sc.nextInt();
    }
    
    System.out.print("Enter the number to search: ");
    int searchNumber = sc.nextInt(); // searchNumber=55
    
    for (int i = 0; i < N; i++) {
      if (numbers[i] == searchNumber) {
        System.out.println(searchNumber + " is at index " + i);
        break;
      } else {
      System.out.println("Element not found");
      break;
      }
    }
    
    sc.close ();
  }
}
