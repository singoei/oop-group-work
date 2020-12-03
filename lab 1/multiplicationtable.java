@@ -0,0 +1,83 @@
import java.util.*;

public class MultiplicationTable {

    private int  multiplicationNumber;
    private int rangeFrom;
    private int rangeTo;


    public MultiplicationTable(int multiplicationNumber, int rangeFrom, int rangeTo)
    {
     this.multiplicationNumber = multiplicationNumber;
     this.rangeFrom = rangeFrom;
     this.rangeTo = rangeTo;
    }

    public void prepTable(int multiplicationNumber,int rangeFrom,int rangeTo)
    {
     this.multiplicationNumber = multiplicationNumber;
     this.rangeFrom = rangeFrom;
     this.rangeTo = rangeTo;
    }

    public int getMultiplicationTable()
    {
      return multiplicationNumber;
    }

    public int getRangeFrom()
    {
      return rangeFrom;
    }

    public int getRangeTo() {
        return rangeTo;
    }
    public void heading()
    {
     System.out.print("Multiplication Number");
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.print("Range from");
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.println("Range To");
    }
    public void printTable()
    {
     System.out.print( multiplicationNumber);
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.print( rangeFrom);
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.print(" \t");
     System.out.print(rangeTo);
     System.out.println();       
    }


    public static void main(String[] args) {
        MultiplicationTable table1 = new MultiplicationTable();
        MultiplicationTable table2 = new MultiplicationTable();
        MultiplicationTable table3 = new MultiplicationTable(0,1,5);

        table1.heading();
        table1.prepTable(3, 51, 102);
        table2.prepTable(4, 68, 128);
        table3.prepTable(5, 51, 105);
        table1.printTable();
        table2.printTable();
        table3.printTable();
    }

    public MultiplicationTable() 
    {}

}
