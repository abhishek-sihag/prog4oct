package Day9;

import java.sql.*;

public class InsertIntoTable {
	public static void main(String[] args) throws Exception{
	String url="jdbc:postgresql://localhost:5432/test";
	String uname="postgres";
	String pass="123456";
	
	int id= 15;                           //1
	String first_name = "Aruni";         //2
	String last_name = "Singha";         //3
	String email = "cdriver15t@sitemeter.com"; //4
	String gender = "Female";    //5
	String date_of_birth = "2020-10-10";      //6
	String country = "India";                //7
	//one method
	String query="insert into person values ("+ id +", '"+ first_name +"', '"+last_name+"', '"+email+"', '"+gender+"', '"+date_of_birth+"', '"+country+"')";
	
	//alternate
//	String query="insert into person values (?,?,?,?,?,?,?)";
	
	Class.forName("org.postgresql.Driver");
	Connection c= DriverManager.getConnection(url,uname,pass);
	
	// use for one method
	Statement st = c.createStatement();
	int count = st.executeUpdate(query); //update the table
	

	//use for alternate
//	PreparedStatement ps=  c.prepareStatement(query);
//	ps.setInt(1, id);
//	ps.setString(2, first_name);
//	ps.setString(3, last_name);
//	ps.setString(4, email);
//	ps.setString(5, gender);
//	ps.setString(6, date_of_birth);  // need a method to change date to String format because it's a date format in SQL
//	ps.setString(7, country);
//	int count = ps.executeUpdate(); // never use query into execution into prepareStatement case
	
	
	System.out.println(count+" row/s affected");
	
	st.close();
//	ps.close();
	c.close();

}
}