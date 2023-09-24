public class GetterSetter{
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("Yellow");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

    }
}
class pen{
    private String Color;
    private int Tip;
    void setColor(String newColor){
        this.Color=newColor;
    }
    void setTip(int tip){
        this.Tip = tip;
    }
    int getTip(){
        return this.Tip;
    }
    String getColor(){
        return this.Color;
    }
}