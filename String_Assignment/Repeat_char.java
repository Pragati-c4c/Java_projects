import java.util.Scanner;

public class Repeat_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
	    // char[] s=st.toCharArray();
	    
	     
	    int arr[]=new int[128];
	  //  int c=0;
	    for(int i=0;i<s.length();i++)
	    {
	    	
	    	arr[s.charAt(i)-'a']++;
	    	
	    }
	    for(int i=0;i<s.length();i++)
	    {
	    	int c=s.charAt(i)-'a';
	    	if(arr[c]!=0)
	    	{
	    		System.out.print(s.charAt(i));
	    		System.out.print(arr[s.charAt(i)-'a']+" ");
	    		arr[s.charAt(i)-'a']=0;
	    	}
	    }

	}

}
