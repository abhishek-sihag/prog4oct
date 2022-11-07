package dos;

import java.util.*;
import java.util.stream.Collectors;
class Employee {
    String name;
    int salary;
    public Employee(){}
    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class ex5{
    enum SortMethod {
        BYNAME, BYSALARY;
    };
    public List<Employee> sort(List<Employee> emps, final SortMethod method){
        List<Employee> list= null;
        switch(method){
            case BYNAME: list = emps.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
            break;
            case BYSALARY: list= emps.stream().sorted((e1,e2)->e1.getSalary()>e2.getSalary()?1:-1).collect(Collectors.toList());
            break;
        }
        return list;
    }
    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
        return entities.stream().allMatch(c->c.getName().toLowerCase().contains(character.toLowerCase()));
    }
}