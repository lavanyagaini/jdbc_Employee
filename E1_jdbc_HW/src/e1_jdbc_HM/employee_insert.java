package e1_jdbc_HM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class employee_insert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.establish the connection
		String url="jdbc:mysql://localhost:3306/employeedb";
		String user="root";
		String pwd="Lavanya@01";
		Connection connection=DriverManager.getConnection(url, user, pwd);
		
		//3.create statement
		
		Statement statement=connection.createStatement();
		
		//4.execute the statement
		
		String query="insert into employee values(5,'lucky','hr',65000,35,'30-august-2012')";
		statement.execute(query);
		
		//5.close
		connection.close();
		
		System.out.println("successfull");


	}

}
