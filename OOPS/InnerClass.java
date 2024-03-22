public class InnerClass {
    public static class OutClass{
        public String s1 = "This is Outer class.";
        public static class InClass{
            public String s2 = "This is InnerClass";
        }
    }
    public static void main(String[] args) {
        OutClass o1 = new OutClass();
        OutClass.InClass i1 = new OutClass.InClass();
        System.out.println(o1.s1);
        System.out.println(i1.s2);
    }

}
