/*
  You are given two arrays of the same length. The first array contains the marks of the 
  students and the second array contains the name of the students. 
  You need to sort the marks array in ascending order while maintaining the corresponding
  names of the students in the names array aligned with their respective marks.
  Use the Bubble sort technique to solve this problem. 
  [Your code should work for any given arrays]
*/

public class hw6 {
    public static void main(String[] args) {
      int[] marks = { 85, 90, 75, 44, 99 };
      String[] names = { "Bob", "Alice", "Max", "Marry", "Rosy" };
      
      int n = marks.length;
      for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
          if (marks[j] > marks[j + 1]) {
            
            int tempMark = marks[j];
            marks[j] = marks[j + 1];
            marks[j + 1] = tempMark;
            
            String tempName = names[j];
            names[j] = names[j + 1];
            names[j + 1] = tempName;
          }
        }
      }
      
      System.out.println("Sorted Array:");
      for (int i = 0; i < marks.length; i++) {
        System.out.print(marks[i] + " ");
      }
      System.out.println();
      
      for (int i = 0; i < names.length; i++) {
        System.out.print(names[i] + " ");
      }
    }
  }
  
  