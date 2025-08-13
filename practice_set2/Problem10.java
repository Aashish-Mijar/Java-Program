class Student{
    String name;
    int rollNo;

    Student(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    void displayStd(){
        System.out.println("The name of student whose roll number is "+rollNo+" is "+name);
    }
}
public class Problem10 {
    public static void main(String[] args) {
        Student sd=new Student("Aashish Mijar", 02);
        sd.displayStd();
    }
}
