package mainapp;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;
	import jdbc.JDBCUtil;


	public class SelectApp {

			public static void main(String[] args) throws SQLException {
				// TODO Auto-generated method stub
				Connection connection =null;
				PreparedStatement pstmt =null;
				 ResultSet resultSet=null;
			
				
				   Scanner sc=new Scanner(System.in);
				  
	               int id=sc.nextInt();
	           
				  try
				   { 
					 connection=JDBCUtil.getJDBCConnection();
					 if(connection!=null)
					 {
						 String sqlSelectQuery="select id,name,age from stud where id=?";
						  pstmt =connection.prepareStatement(sqlSelectQuery);
						  if(pstmt!=null)
						  {
							  
							  pstmt.setInt(1,id);
							  
							   resultSet=pstmt.executeQuery();
						  }    
						  if(resultSet!=null)
						  {
							  while(resultSet.next())
							  {
								  Integer idd=resultSet.getInt(1);
								  String name=resultSet.getString(2);
								  Integer age=resultSet.getInt(3);
								  System.out.println(idd+"\t"+name+"\t"+age);
								  
							  }
						  }
						  else
						  {
							  System.out.print("Record not found for id:::"+id);
						  }
				  
				   }
				   }
				 catch(SQLException se)
				 {
					se.printStackTrace(); 
				 }
				 finally
				 {
					JDBCUtil.closeConnection(connection, pstmt,resultSet);
					if(sc!=null)
					{
						sc.close();
					}
						
				 }
				 
				 
			}

		}

