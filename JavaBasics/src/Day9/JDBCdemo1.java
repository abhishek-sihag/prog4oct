package Day9;
import java.sql.*;

public class JDBCdemo1 {
	
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:postgresql://localhost:5432/test";
		String username="postgres";
		String pass="123456";
		String query="Select first_name from person where id = 6";
		
		Class.forName("org.postgresql.Driver");
		Connection c= DriverManager.getConnection(url,username,pass);
		//created statement 
		Statement st= c.createStatement();
		//execute query
		ResultSet rs= st.executeQuery(query);
		
		rs.next(); //to fetch next element
		String name= rs.getString("first_name");
		
		System.out.println(name);
		
		st.close();
		c.close();
		
		
	}

}
