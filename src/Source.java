public class Source {
    public static void main(String[] args) {
    double n =5;
        System.out.println(am_i_wilson(n));
    }
    public static boolean am_i_wilson(double n) {
        long divider = (long) (n*n);
        long factor =1;
        for (int i = 2; i < n ; i++) {
            factor=(factor*i)%divider; // basic factorial will overflow for input grater than ~300
        }
        return factor+1==divider;
    }
}