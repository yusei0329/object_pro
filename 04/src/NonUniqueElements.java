public class NonUniqueElements {
    public static IntCollector convert(IntCollector seq){
        int[] tmp = seq.getArray();
        for (int j : tmp) {
            if (seq.countOf(j) == 1) {
                seq.remove(seq.indexOf(j));
            }
        }
        return seq;
    }

    public static void main(String[] args) {

        IntCollector ic1 = new IntCollector(new int []{1,2,1,1,2,2,3,3,3,4,4,5,6});
        ic1.print();
        IntCollector convert = convert(ic1);
        convert.print();

        IntCollector ic2 = new IntCollector(new int []{1,2,1,1,25,4,6,7,3,2,1,7,7,5,9,0,0,2,3,3,3,4,4,5,6});
        ic2.print();
        IntCollector convert2 = convert(ic2);
        convert2.print();

        IntCollector ic3 = new IntCollector(new int []{11,43,22,15,4,});
        ic3.print();
        IntCollector convert3 = convert(ic3);
        convert3.print();
    }
}
