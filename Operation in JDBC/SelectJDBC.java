import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectJDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection =null;
		Statement statement =null;
		ResultSet resultSet=null;
		
		 String url="jdbc:mysql://localhost:3306/class";
		   String username="root";
		   String password="@12345";
		 try
		   { 
			 connection=DriverManager.getConnection(url, username, password);
			 if(connection!=null)
			 {
				  statement =connection.createStatement();
				  if(statement!=null)
				  {
					  String sqlSelectQuery="select * from stud";
					  resultSet=statement.executeQuery(sqlSelectQuery);
					  if(resultSet!=null)
					  {
						  while(resultSet.next())
						  {
							  Integer id=resultSet.getInt(1);
							  String name=resultSet.getString(2);
							  Integer age=resultSet.getInt(3);
							  System.out.println(id+"\t"+name+"\t"+age);
							  
						  }
					  }
				  }
			 }
		  
		   }
		 catch(SQLException se)
		 {
			se.printStackTrace(); 
		 }
		 finally
		 {
			 if(resultSet!=null)
			 {
				 resultSet.close();
			 }
			 if(statement!=null)
				{ statement.close();}
			 
			 if(connection!=null)
			 { connection.close();}
					
		 }
		 
		 
	}

}
