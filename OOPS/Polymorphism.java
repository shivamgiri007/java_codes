public class Polymorphism {
    public static class Animal{
        public void animalSound(){
            System.out.println("animal has a sound.");
        }
    }
    public static class Horse extends Animal{
        public void animalSound(){
            System.out.println("Horse has sound hee hee.");
        }
    }
    public static class Cat extends Animal{
        public void animalSound(){
            System.out.println("Cat has a sound myau myau.");
        }
    }
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Horse h1 = new Horse();
     Cat c1 = new Cat();
        a1.animalSound();
        h1.animalSound();
        c1.animalSound();
    }
}
