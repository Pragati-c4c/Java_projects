import java.util.Scanner;

public class Reverse_sent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] st2=s.split(" ");
		 StringBuffer sb=new StringBuffer();
       
			
       for(String sb1 : st2){
           for(int i=sb1.length()-1;i>=0;i--){
               sb.append(sb1.charAt(i));
           }
           sb.append(" ");
	          
	         
			} 
	
		
		
		sb.deleteCharAt(sb.length()-1);
      
		System.out.print(sb);
		
		
		
	}

}

//String[] strs = new StringBuilder(s).reverse().toString().split("\\s");
//Collections.reverse(Arrays.asList(strs));
//return String.join(" ", strs);
