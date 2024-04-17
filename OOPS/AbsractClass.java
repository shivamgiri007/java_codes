class AbstractClass{
abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzzzzz ");
    }
}
class tiger extends Animal{
    public void animalSound(){
        System.out.println("roar roar !");
    }
}
public static void main(String[] args) {
    tiger t1 = new tiger();
        t1.animalSound();
        t1.sleep();
    }
}