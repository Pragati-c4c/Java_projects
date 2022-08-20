import java.util.Scanner;

public class Special_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     String s=sc.nextLine();
	     int c=0;
	     for(int i=0;i<s.length();i++)
	     {
	    	String s1= "ab"+2;
	    	 System.out.println(s1);
	    	 if (!Character.isDigit(s.charAt(i))
	                 && !Character.isLetter(s.charAt(i))
	                 && !Character.isWhitespace(s.charAt(i))) {
	                 
	                 c++;
	             }
	     }
	     System.out.print(c);
	    
	}

}
