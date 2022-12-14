package mainapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import jdbc.JDBCUtil;


public class UpdateApp {
	
			public static void main(String[] args) throws SQLException {
				// TODO Auto-generated method stub
				Connection connection =null;
				PreparedStatement pstmt =null;
			
				
				   Scanner sc=new Scanner(System.in);
				 
	               int id=sc.nextInt();
	               
				  try
				   { 
					 connection=JDBCUtil.getJDBCConnection();
					 if(connection!=null)
					 {
						 String sqlSelectQuery="update stud set age=24 where id=?";
						  pstmt =connection.prepareStatement(sqlSelectQuery);
						  if(pstmt!=null)
						  {
							  
							  pstmt.setInt(1,id);
							  
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



