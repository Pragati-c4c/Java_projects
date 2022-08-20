import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
		   s=s.toLowerCase();
		 int ct=0;
		 int arr[]=new int[26];
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)!=' ')
			 {
				 char c=s.charAt(i);

				 arr[c-'a']++;
			 }
			 
			 
		 }
		 for(int i=0;i<s.length();i++) 
		 {
			 char c=s.charAt(i);

			 if( c!=' '&& arr[c-'a']>=1 )
			 {
				
				 ct++;
				 
				arr[s.charAt(i)-'a']=0;
			 }
		 }
		 if(ct==26)
		 {
			 System.out.print("panagram");
		 }
		 else
			 System.out.print("not panagram");
		
		 
	}

}
