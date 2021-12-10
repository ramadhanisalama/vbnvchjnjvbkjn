
public class Odd{
    public static void main(String[]args){
        int n = 1000;
        System.out.println("Enter the  odd number");
        for (int i = 1 ; i <= n ; i ++){
            if ( i % 2 != 0){
                System.out.println( i + " ");
            }
        }
    }
}