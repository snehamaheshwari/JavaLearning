
public class RemoveWhiteSpaces {

	//Q #18) Write a Java Program to remove all white spaces from a string with using replace().
	public static void main(String[] args)
    {
        String str1 = "Sneha Maheshwari        is a QualityAna    list";
  
        //1. Using replaceAll() Method
  
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);
        
        
      // Q #19) Write a Java Program to remove all white spaces from a string without using replace().
        
        char[] chars = str1.toCharArray();
  
        StringBuffer sb = new StringBuffer();
  
        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb);    
  
           }
}

