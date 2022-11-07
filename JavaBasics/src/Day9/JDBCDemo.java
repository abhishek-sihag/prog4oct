package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
	
	public static void main(String[] args) {
		Connection c= null;
		
		try {
			//Load & Register Driver
			Class.forName("org.postgresql.Driver");
		    c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "123456");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass().getName()+" "+ e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		try {
			//close connection
			c.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
