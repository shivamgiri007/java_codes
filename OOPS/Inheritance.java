public class Inheritance {
        public static void main(String[] args) {
            car p1 = new car();
            System.out.println(p1.Brand);
            System.out.println(p1.type);
        }
}
class Vehicle{
    String Brand = "Ford";

}
class car extends Vehicle{
    String type = "Endevour";
}
