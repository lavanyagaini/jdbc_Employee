package e1_jdbc_HM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class employee_delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.load and register
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//2.establish the connection
				
				String url="jdbc:mysql://localhost:3306/employeedb";
				String user="root";
				String pwd="Lavanya@01";
				Connection connection=DriverManager.getConnection(url, user, pwd);
				
				//3.create the statement
				
				Statement statement=connection.createStatement();
				
				//4.execute the statement
				
				String query="update employee set name='gainimallesh'  where id=1";
				statement.execute(query);
				
				//close
				connection.close();
				
				System.out.println("deleted");
				
				
	}

}
