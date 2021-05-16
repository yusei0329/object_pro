import java.util.Arrays;

public class TimesTable {
    private int width;
    private int height;
    private int[][] array;

    private TimesTable(){
        this.array = new int[0][0];
    }

    public TimesTable(int width, int height){
        this();
        this.width = width;
        this.height = height;
        this.array = new int[this.width][this.height];

        this.array = new int[width+1][height+1];
        for (int i=1; i < width+1; i++){
            for (int j = 1; j<height+1;j++){
                this.array[i][j] = i*j;
            }
        }
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public int[][] getArray(){
        return this.array;
    }
    public void print(){
        for (int i=1; i < this.width+1; i++){
            for (int j = 1; j<this.height+1;j++){
                System.out.print("| "+this.array[i][j]);
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        //debug---------------------------------------------------------------
        TimesTable table1 = new TimesTable(9,9);
        System.out.println("Width = " + table1.getWidth() + " Height = " + table1.getHeight() + " Array = " + Arrays.deepToString(table1.getArray()));
        table1.print();

        TimesTable table2 = new TimesTable(5,5);
        System.out.println("Width = " + table2.getWidth() + " Height = " + table2.getHeight() + " Array = " + Arrays.deepToString(table2.getArray()));
        table2.print();
        //MIN---------------------------------------------------------------
        TimesTable tableMin = new TimesTable(0,0);
        System.out.println("Width = " + tableMin.getWidth() + " Height = " + tableMin.getHeight() + " Array = " + Arrays.deepToString(tableMin.getArray()));
        tableMin.print();

        //MAX---------------------------------------------------------------
        TimesTable tableMax = new TimesTable(99,99);
        System.out.println("Width = " + tableMax.getWidth() + " Height = " + tableMax.getHeight() + " Array = " + Arrays.deepToString(tableMax.getArray()));
        tableMax.print();

    }
}
