import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     String s=sc.nextLine();
	     char[] st=s.toCharArray();
         for(int i=0;i<st.length-1;i++)
         {
        	 for(int j=i+1;j<st.length;j++)
        	 {
        		if(st[i]>st[j]) 
        		{
        			
        			char c=st[i];
        			st[i]=st[j];
        			st[j]=c;
        			
        		}
        	 }
         }
         System.out.print(st);
	}

}
