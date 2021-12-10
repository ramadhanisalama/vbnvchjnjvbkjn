import java.util.Scanner;

public class Operations {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("First number: ");
       double num1 = input.nextDouble();
       System.out.println("Second number: ");
       double num2 = input.nextDouble();
       double sum = num1 + num2;
       System.out.println("sum is : " +sum);
       double mult = num1*num2;
       System.out.println("Product is : " + mult);
       double diff = num1 - num2;
       System.out.println("The difference is: " + diff);
       double div = num1 / num2;
       System.out.println("The division is: " + div);
   } 
}
