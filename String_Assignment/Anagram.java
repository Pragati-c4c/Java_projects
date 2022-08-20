import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String s2=sc.nextLine();
       int k[]=new int[256];
       int c=0;
       if(s1.length()!=s2.length())
    	   System.out.print("Not Anagram");
       else
       {
    	   for(int i=0;i<s1.length();i++)
    	   {
    		   k[(int)s1.charAt(i)]++;
    	   }
    	   for(int i=0;i<s2.length();i++)
    	   {
    		   k[(int)s1.charAt(i)]--;
    	   }
    	   for(int i=0;i<k.length;i++)
    	   {
    		   if(k[i]!=0)
    			   System.out.print("Not Anagram"); 
    		   
    		  
    	   }
    	   System.out.print("Anagram");

    	  
       }
	}

}
