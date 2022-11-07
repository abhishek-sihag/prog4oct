package dos;


import java.util.*;

import java.util.stream.Collectors;
class Candidate{
  private String name;
  private int id;
  private int age;
  private String gender;
  private String department;
  private int yearOfJoining;
  private double salary;

  public Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary){
    this.id=id;
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.department=department;
    this.yearOfJoining=yearOfJoining;
    this.salary=salary;
  }
  
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getGender(){
    return gender;
  }
  public String getDepartment(){
    return department;
  }
  public int getYearOfJoining(){
    return yearOfJoining;
  }
  public double getSalary(){
    return salary;
  }
  public void setId(int id){
    this.id=id;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public void setGender(String gender){
    this.gender=gender;
  }
  public void setDepartment(String department){
    this.department=department;
  }
  public void setYearOfJoining(int yearOfJoining){
    this.yearOfJoining=yearOfJoining;
  }
  public void setSalary(double salary){
    this.salary=salary;
  }

  //Write Your Code Here..
     @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
}

class Implementation{
  public static Map<String, Long> getCount(List<Candidate> list){
    Map<String, Long> map;
    map= list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.counting()));
    return map;
  }
  public static Map<String, Double> getAverageAge(List<Candidate> list){
    Map<String, Double> map;
    map= list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.averagingInt(Candidate::getAge)));
    return map;
  }
  public static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list){
    Map<String, Long> map;
    map= list.stream().collect(Collectors.groupingBy(Candidate::getDepartment, Collectors.counting()));
    return map;
  }
  public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
    Optional<Candidate> young;
    young= list.stream().filter(c->c.getGender().equals("Male")&& c.getDepartment().equals("Product Development")).min((c1,c2)->c1.getAge()>c2.getAge()?1:-1);
    return young;
  }
  //Write Your Code Here..
}

public class ex6 {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}