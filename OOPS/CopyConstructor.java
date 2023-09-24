public class CopyConstructor {
    // Types of copy constructor - 1) shallow copy 
    //                             2) Deep Copy Constructor
    // Shallow copy gives reference to the copy of object - changes in original object reflects in copy object
    // deep copy creates copy of object - changes in original do not reflect in original.
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.StudentName = "Shivam";
        student1.rollNo = 5;
        student1.marks[0] = 30;
        student1.marks[1] = 40;
        student1.marks[2] = 50;
        Students student2 = new Students(student1);
        student1.marks[2] = 70;
        for(int i=0;i<3;i++){
            System.out.println(student2.marks[i]);
        }
    }
}
class Students{
    // *******************************************
    // This is shallow copy Constructor
    // *******************************************
    String StudentName;
    int rollNo;
    int marks[];
        Students(Students student1){
        marks = new int[3];
        this.StudentName = student1.StudentName;
        this.rollNo = student1.rollNo;
        this.marks = student1.marks;  //this is shallow copy that gives reference to new object
    }
    // ********************************************
    //Now see the deep copy constructor.
    // ********************************************
    // Students(Students s1){
    //     marks = new int[3];
 
    //     // we use loop insted of this in deep copy
    //     for(int i=0;i<3;i++){
    //         this.marks[i] = s1.marks[i];
    //     }
    // }

    Students(){
        marks = new int[3];
    }
    
}