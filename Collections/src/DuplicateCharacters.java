
public class DuplicateCharacters {
	
	//Q #15) Write a Java Program to find the duplicate characters in a string.
	public static void main(String[] args) {
	 String str = new String("Sneha Maheshwari");
     int count = 0;
     char[] chars = str.toCharArray();
     System.out.println("Duplicate characters are:");
     for (int i=0; i<str.length();i++) {
                 for(int j=i+1; j<str.length();j++) {
                            if (chars[i] == chars[j]) {
                                       System.out.println(chars[j]);
                                       count++;
                                       break;
                             }
                  }
      }
     System.out.println(count);
	}
}
