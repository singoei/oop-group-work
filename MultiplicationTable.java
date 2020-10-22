
public class MultiplicationTable {
 int multiplicationNumber;
    int rangeFrom;
    int rangeTo;
    
    public MultiplicationTable( int number, int range1, int range2){
          multiplicationNumber= number;
          rangeFrom= range1;
          rangeTo= range2;
    }
    
    public void setMultiplicationTable(int number,int range1,int range2) {
        multiplicationNumber = number;
        rangeFrom= range1;
        rangeTo= range2;
    }
    
    public int getMultiplicationTable() {
        return multiplicationNumber;
    }

    public int getRangeFrom() {
        return rangeFrom;
    }

    public int getRangeTo() {
        return rangeTo;
    }
    
    public void title(){
        System.out.print("Multiplication Table of");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print("Range from");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.println("Range To");
    }
    
    public void printTable(){
         
         System.out.print( multiplicationNumber);
         System.out.print(" \t");
         System.out.print(" \t");
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
        public static void main(String[]args){
            MultiplicationTable myObj1= new MultiplicationTable(3,17,25);
            MultiplicationTable myObj2= new MultiplicationTable(17,3,49);
            MultiplicationTable myObj3= new MultiplicationTable(0,1,5);
            
        myObj1.setMultiplicationTable(3, 17, 25);
        myObj2.setMultiplicationTable(17, 3, 49);
        myObj3.setMultiplicationTable  (0, 1, 5);
        myObj1.title();
        myObj1.printTable();
        myObj2.printTable();
        myObj3.printTable();
                    
        }      
   
}
