package Day9;


//Class.forName()

public class ForName {
	
	public static void main(String[] args) throws Exception{

		
		Class.forName("Pqr"); //it is the static block of driver class which loads driver
		
//		DriverManager.registerDriver(driver);
//		Connection c= 

}
}
	
class Pqr{
		static {
			System.out.println("in static");
		}
		{
			System.out.println("in instance");
		}
	}
