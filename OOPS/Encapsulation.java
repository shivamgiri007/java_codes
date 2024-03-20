public class Encapsulation {
    public static void main(String[] args) {
       Mycar p1 = new Mycar();
       System.out.println(p1.getName());
       p1.setName("This is my new car tata.");
       System.out.println(p1.getName());         
    }
}
class Mycar{
    private String carname = "This is my ford.";
    public String getName(){
        return carname;
    }
    public void setName(String newName){
        this.carname = newName;
    }
}
