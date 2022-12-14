
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;
import java.util.Scanner;


import jdbc.JDBCUtil;

public class InsertSQLDate {

		public static void main(String[] args) throws SQLException, ParseException {
			// TODO Auto-generated method stub
			Connection connection =null;
		   PreparedStatement pstmt =null;
		
			
			
			   Scanner sc=new Scanner(System.in);
			   String name=sc.next();
			   String address=sc.next();
			   String gender=sc.next();
			   String DOB=sc.next();
			   String DOJ=sc.next();
			   String DOM=sc.next();   //YYYY-MM-DD
			   
               String query="insert into employee(name,address,gender,DOB,DOJ,DOM) values (?,?,?,?,?,?)";
              
               SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
               java.util.Date udate=sdf.parse(DOB);
               long l=udate.getTime();
               java.sql.Date sqlDate=new java.sql.Date(l);
               
               SimpleDateFormat sdf1= new SimpleDateFormat("dd-MM-yyyy");
               java.util.Date udate1=sdf1.parse(DOJ);
               long l1=udate1.getTime();
               java.sql.Date sqlDate1=new java.sql.Date(l1);
               
               java.sql.Date sqlDate2=java.sql.Date.valueOf(DOM);
               
               
           
			  try
			   { 
				 connection=JDBCUtil.getJDBCConnection();
				 if(connection!=null)
				 {
					
					  pstmt =connection.prepareStatement(query);
					  if(pstmt!=null)
					  {
						 
						pstmt.setString(1, name);
						pstmt.setString(2, address);
						pstmt.setString(3, gender);
						pstmt.setDate(4, sqlDate);
						pstmt.setDate(5, sqlDate1);
						pstmt.setDate(6, sqlDate2);
					
						  int Noofrow=pstmt.executeUpdate();
						  System.out.println(Noofrow);
						  
					  }
				 }
			  
			   }
			 catch(SQLException se)
			 {
				se.printStackTrace(); 
			 }
			 finally
			 {
				JDBCUtil.closeConnection(connection, null, null);
				if(sc!=null)
				{
					sc.close();
				}
					
			 }
			 
			 
		}

	}
