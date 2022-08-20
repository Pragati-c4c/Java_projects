import java.util.*;
public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String st2="";
		for(int i=st.length()-1;i>=0;i--)
		{
			st2+=st.charAt(i);
			
		}
		System.out.println(st2);
      
	}

}
