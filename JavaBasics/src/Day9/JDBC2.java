package Day9;
//Step1: to import the java.sql.* package
import java.sql.*;

public class JDBC2 {
	
	public static void main(String[] args) {
		
		
		Connection con = null;
		try {
			//Step2: load the driver
			//Step3: register the driver
			Class.forName("org.postgresql.Driver");
			
			//Step4: Establish the connection
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","123456");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Step5: Create the statement
		Statement st = null;
		try {
			//Step6: Execute the Query
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Step7: Process the result
		ResultSet rs = null;
		try {
			rs = st.executeQuery("Select * from car");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			while(rs.next()) {
			System.out.println( rs.getInt(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Step7: close
		try {
			con.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
