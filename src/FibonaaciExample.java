import java.util.Scanner;

public class FibonaaciExample {
    private static long fibonacci(long number){
        if((number==0) || (number ==1))
            return number;
        else return fibonacci(number-1)+ fibonacci(number-2);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter last limit of fibonacci series ");
        long number = scanner.nextInt();
        for(int i=0;i<= number;i++)
            System.out.println(fibonacci(i));
    }
}
