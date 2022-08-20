import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String sentence=sc.nextLine();
		   sentence=sentence.toLowerCase();
		   int ct=0;
		   if(sentence.length()<26)
	        {
	           
	            System.out.print("not panagram");
	           
	        }
		else
		{ 
	           for(int i=97;i<=122;i++)
	        {
	          char c= (char)i;
	            if(sentence.indexOf(c)==-1)
	            {
	                    
	                    
	               ct++;
	                
	            }
	           
	        }
	        if(ct>0)
	        	 System.out.print("not panagram");
	        else
	        	 System.out.print("panagram");
			 
	        
		   }
	    }
	}
	


