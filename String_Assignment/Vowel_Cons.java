import java.util.Scanner;

public class Vowel_Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     String s=sc.nextLine();
	     int v=0;
	     int c=0;
	    for(char i:s.toCharArray())
	    {
	    	 if(i=='A'||i=='a'||i=='E'||i=='e'||i=='I'||i=='i'||i=='0'||i=='o'||i=='U'||i=='u')
	    	 {
	    		 v++;
	    	 }
	    	 else {
	    		 c++;
	    	 }
	    }
	    System.out.print("Vowels " +v +" Consonants "+ c);
	    
	}
}