class Employee{
    String name;
    int id;
    int salary;

    void displayEmpInfo(){
        System.out.println("Employee name is: "+name);
        System.out.println("Employee id is: "+id);
        System.out.println("Employee salary is: "+salary);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        emp1.name="Aashish Mijar";
        emp1.id=124;
        emp1.salary=34000;

        emp2.name="Mira Mijar";
        emp2.id=125;
        emp2.salary=45000;


        emp1. displayEmpInfo();
        System.out.println();
        emp2. displayEmpInfo();


    }
}
