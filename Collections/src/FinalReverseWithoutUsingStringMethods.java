import java.util.Scanner;

public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		// Reference: https://www.softwaretestinghelp.com/java-coding-interview-programs/
        // Q #1) Write a Java Program to reverse a string without using String inbuilt function.
        String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);
       
       // Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse().
       // Method1
       String str3 = "Sneha Maheshwari";
       char chars[] = str3.toCharArray();  // converted to character array and printed in reverse order
       for(int i= chars.length-1; i>=0; i--) {
           System.out.print(chars[i]);
        }
       
       // Method2
       String str4;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter your String");
       str4 = in.nextLine();
       System.out.println(str4);
       String[] token = str4.split("");    //used split method to print in reverse order
       for(int i=token.length-1; i>=0; i--)
       {
           System.out.print(token[i] + "");
       }
       
       // Method3
       String original, reverse = "";
       System.out.println("Enter the string to be reversed");
       Scanner in2 = new Scanner(System.in);
       original = in2.nextLine();
       int length = original.length();
       for(int i=length-1; i>=0; i--) {
           reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
       }
       System.out.println(reverse);
        
       // Q #3) Write a Java Program to swap two numbers with using the third variable
       int x, y, temp;
       System.out.println("Enter x and y only numbers");
       Scanner in3 = new Scanner(System.in);
       x = in3.nextInt();
       y = in3.nextInt();
       System.out.println("Before Swapping " + x +" "+ y);
       temp = x;
       x = y;
       y = temp;
       System.out.println("After Swapping " + x +" "+ y);
       
       // Q #4) Write a Java Program to swap two numbers without using the third variable.
       int xyz, pqr;
       System.out.println("Enter x and y only in number");
       Scanner in4 = new Scanner(System.in);
   
       xyz = in4.nextInt();
       pqr = in4.nextInt();
   
       System.out.println("Before Swapping\nx = "+xyz+"\ny = "+pqr);
   
       xyz = xyz + pqr;
       pqr = xyz - pqr;
       xyz = xyz - pqr;
   
       System.out.println("After Swapping without third variable\nx = "+xyz+"\ny = "+pqr);
       
   }
}
