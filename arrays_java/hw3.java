/*
Write a Java program that will take input of two arrays and elements from the user 
and check whether the second array is a subset of the first array. 
A subset is a set that contains only elements found in the original set.
*/

import java.util.Scanner;
public class hw3 {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the length of array 1: ");
    int len1 = sc.nextInt();
    int[] arr1 = new int[len1];
    
    System.out.println("Please enter the elements of arr1:");
    for (int i = 0; i < len1; i++) { 
      arr1[i] = sc.nextInt();
    }
    
    System.out.print("Please enter the length of array 2: ");
    int len2 = sc.nextInt();
    int[] arr2 = new int[len2];
    
    System.out.println("Please enter the elements of arr2:");
    for (int i = 0; i < len2; i++) {
      arr2[i] = sc.nextInt();
    }
    
    int count = 0; 
    for (int i = 0; i < len2; i++) { 
      for (int j = 0; j < len1; j++) {
        if (arr2[i] == arr1[j]) {
          count++;
        }
      }
    }
    
    if (count == len2) {
      System.out.println("Array 2 is a subset of Array 1.");
    } else {
      System.out.println("Array 2 is not a subset of Array 1.");
    }
    
    sc.close();
  }
}
