public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shivam" , 5);
        // Studetn s3 = new Student("Saif");
        // This line does not execute because this single parameterised constructor n=is not created 
        Student s3 = new Student(s2);
        // |This is shallow copy constructor

    }

}
class Student{
    // This code do constructor overloading.
    // This is example of polymorphism.
    String name;
    int roll;
    // Default / Non=Parameterised Constructor
    Student(){
        System.out.println("Constucter is called ...");
    }
    // Parameterised Constructor
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    // Shallow Copy constructor
    // We need to create copy construcor which parameters need to copy in copy constuctor.
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
    
}
