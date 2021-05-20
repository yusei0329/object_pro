import java.util.Arrays;

public class IntCollector {
    private int[] array;
    public IntCollector(){
        this.array = new int[0];
    }
    public IntCollector(int[] values){
        this();
        this.array = new int[values.length];
        System.arraycopy(values, 0, this.array, 0, values.length);
    }

    public int[] getArray(){
        return this.array;
    }

    public void setArray(int[] values){
        this.array = new int[values.length];
        System.arraycopy(values, 0, this.array, 0, values.length);
    }

    public void add(int value){
        int []tmp = getArray();
        this.array = new int[tmp.length+1];
        System.arraycopy(tmp, 0, this.array, 0, tmp.length);
        this.array[this.array.length-1] = value;
    }

    public int countOf(int value){
        int count=0;
        for (int j : this.array) {
            if (value == j) count++;
        }
        return count;
    }

    public int indexOf(int value){
        for (int i=0; i<this.array.length; i++) {
            if(this.array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index){
        int []tmp = getArray();
        if(0<=index && index<tmp.length) {
            tmp[index] = 0;
            this.array = new int[0];
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] != 0) {
                    add(tmp[i]);
                }
            }
        }
    }

    public void print(){
        System.out.println(Arrays.toString(this.array));
    }

    //-------------------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        IntCollector inco = new IntCollector(new int[]{40, 90, 50});
//        System.out.println("get = " + Arrays.toString(inco.getArray()));
//
//        inco.setArray(new int[]{10, 50, 60});
//        System.out.println("set = " + Arrays.toString(inco.getArray()));
//
//        inco.add(50);
//        System.out.println("add = " + Arrays.toString(inco.getArray()));
//
//        System.out.println("50の個数は"+inco.countOf(50));
//
//        System.out.println("indexの個数は"+ inco.indexOf(60));
//
//        inco.remove(2);
//        System.out.println("remove = " + Arrays.toString(inco.getArray()));
//
//        inco.print();
//    }
//-------------------------------------------------------------------------------------------

}
