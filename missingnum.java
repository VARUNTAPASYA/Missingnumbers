import java.util.Scanner;
public class missingnum {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a,numbers[];
     a=sc.nextInt();  
     numbers=new int[a];
      System.out.print("Input numbers: ");
      for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i]=sc.nextInt());

      }
      System.out.println();
      System.out.print("Missing numbers: ");
      for (int i = 0; i < numbers.length - 1; i++) {
        for (int j = numbers[i] + 1; j < numbers[i + 1]; j++) {
          System.out.print(j + " ");
        }
      }
    }
  }
  
