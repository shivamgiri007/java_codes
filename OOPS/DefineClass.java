public class DefineClass{
    public static void main(String[] args) {
        //create object in main function using new kwyword
        Pen p1 = new Pen();
        //new keyword creates space in heap memory to create new object
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(3);
        System.out.println(p1.Tip);
        p1.setColor("yellow");
        System.out.println(p1.color);
        p1.color = "blue";
        System.out.println(p1.color);
    }

}
class Pen{
    String color;
    int Tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        Tip = newTip;
    }
}
class student{
    String name;
    int age;
    float percentage;
    void percentage(int phy, int chem , int math){
        percentage = phy + chem + math /2;
    }
}