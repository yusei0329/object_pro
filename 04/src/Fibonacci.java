public class Fibonacci {
    public static IntCollector get(int n){
        IntCollector ic = new IntCollector(new int[0]);
        int f0=0, f1=1, f2;
        ic.add(0);
        while(f1<n) {
            ic.add(f1);
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }
        return ic;
    }

    public static void main(String[] args) {
        IntCollector ic = get(10000);
        ic.print();
    }
}
