package Day9;
import java.sql.*;

public class FetchTable {
	
	public static void main(String[] args) throws Exception{
		String url="jdbc:postgresql://localhost:5432/test";
		String uname="postgres";
		String pass="123456";
		String query="Select * from person"; //selecting whole table
		
		Class.forName("org.postgresql.Driver");
		Connection c= DriverManager.getConnection(url,uname,pass);
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(query); 
		rs.next();
		System.out.println("id : first_name : last_name  :  email");
		System.out.println();
		
		String userData = "";
		//while loop for jump onto the next element available
		while(rs.next()) {
		userData = rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4);
//		rs.next();
		System.out.println(userData); //print columns
		}
		
		st.close();
		c.close();
		
		
	}

}
