public class TilingProblem {
    // This tiling problem is for 2 X a size surface area
    public static int tileprob(int a){
        if(a==0 || a==1){
            return 1;
        }
        int tile1 = tileprob(a-1);
        int tile2 = tileprob(a-2);
        return tile1 + tile2;
    }
    public static void main(String[] args) {
        System.out.println(tileprob(4));
    }
}
