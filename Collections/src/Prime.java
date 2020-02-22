import java.util.Scanner;

public class Prime {

	// Q #7) Write a Java Program to find whether a number is prime or not.
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        int temp, num;
        boolean isPrime = true;
        System.out.println("Please enter any number and press enter:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i<= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + " is prime number");
            else
                System.out.println(num + " is not a prime number");
             
         
    }
}
