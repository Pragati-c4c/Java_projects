package mainapp;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import jdbc.JDBCUtil;


public class InsertApp {

		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			Connection connection =null;
			PreparedStatement pstmt =null;
		
			
			
			   Scanner sc=new Scanner(System.in);
			   String name=sc.next();
               int age=sc.nextInt();
           
			  try
			   { 
				 connection=JDBCUtil.getJDBCConnection();
				 if(connection!=null)
				 {
					 String sqlSelectQuery="insert into stud (name,age) values (?,?)";
					  pstmt =connection.prepareStatement(sqlSelectQuery);
					  if(pstmt!=null)
					  {
						  pstmt.setString(1, name);
						  pstmt.setInt(2, age);
						  
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
				JDBCUtil.closeConnection(connection, pstmt, null);
				if(sc!=null)
				{
					sc.close();
				}
					
			 }
			 
			 
		}

	}
