import java.util.Scanner;
public class Nages{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your name");
        String name = input.nextLine();
        System.out.print("Enter your age");
        String age =  input.nextLine();
        System.out.println("Welcome:" + name + " you are **** "+ age +      "years old****");
        
        

    }
}