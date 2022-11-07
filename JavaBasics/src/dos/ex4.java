package dos;


import java.util.*;
;

class CompanyJobRepository {
	static String getJobPrediction(int age, String highestQualification) throws NotEligibleException{
		if(age<19){
			throw new NotEligibleException("You are underage for any job");
		}else if(age>=21 && highestQualification.equals("B.E")){
			return "We have openings for junior developer";
		}else if(age>=26 && (highestQualification.equals("M.S") || highestQualification.equals("PhD"))){
			return "We have openings for senior developer";
		}else if(age>=19 && (!(highestQualification.equals("B.E") && highestQualification.equals("M.S") && highestQualification.equals("PhD")))){
			throw new NotEligibleException("We do not have any job that matches your qualifications");
		}else {
			return "Sorry we have no openings for now";
		}
	}
}

public class ex4 {
	public static String searchForJob(int age, String highestQualification) throws NotEligibleException{
		if(age>=200 || age<=0){
		throw new NotEligibleException("The age entered is not typical for a human being");
		}else{
			String p= CompanyJobRepository.getJobPrediction(age, highestQualification);
			return p;
		}
	}
	public static void main(String args[] )  {
		try{
			Scanner sc= new Scanner(System.in);
			int age = sc.nextInt();
			sc.nextLine();
			String high=sc.nextLine();
			System.out.println(searchForJob(age, high));
		}catch(NotEligibleException e) {
			System.out.println(e.getMessage());
		}
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}
class NotEligibleException extends Exception {
	public NotEligibleException(String msg){
		super(msg);
	}
}
