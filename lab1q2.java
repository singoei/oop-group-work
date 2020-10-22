public class YearRange {
    int firstYear;
    int secondYear;
    int firstDivisor;
    int secondDivisor;
    int rangeType;
    
public YearRange(int yearrange1, int yearrange2){
    firstYear= yearrange1;
    secondYear= yearrange2;
}
public void setYearRange(int year1, int year2){
    firstYear= year1;
    secondYear= year2; 
}
public void setrangeType(int range){
    rangeType= range;
}
public int getfirstYear(){
    return firstYear;
} 
public int getsecondYear(){
    return secondYear;
}
public void setfirstDivisor(int divisor1){
    firstDivisor= divisor1;
}
public int getfirstDivisor(){
    return firstDivisor;
}
public void setsecondDivisor(int divisor2){
    secondDivisor= divisor2;
}
public int getsecondDivisor(){
    return secondDivisor;
}   
public int getrangeType(){
    return rangeType;
}
public void printYears(){
    
         if ( rangeType == 1){
            for(int count= firstYear;count<=secondYear;count++){
                if(count % this.firstDivisor == 0  & count %  secondDivisor == 0){
                    System.out.print(count+",");                   
                }
            }
        }else if( rangeType == 2){
            for(int count= firstYear;count<=secondYear;count++){
                if(count % 4 ==0 ){
                   System.out.print(count+",");                    
                }           
            }
         } else if ( rangeType ==3){
            for(int count= firstYear;count<=secondYear;count++){
                if(count % this.firstDivisor == 0  & count %  this.secondDivisor == 0){
                    System.out.print(count+",");    
                } 
            }
        } else{
            System.out.print("Choose either 1, or 2 or 3");
        }
    }

public static void main(String[] args){
    YearRange myFirstRange = new YearRange(1314, 2014);
    myFirstRange.setrangeType(1);
    myFirstRange.setfirstDivisor(14); //specifies the first dividor
    myFirstRange.setsecondDivisor(20);
    System.out.println("List of all years divisible by " + myFirstRange.getfirstDivisor() + " and " + myFirstRange.getsecondDivisor());
    myFirstRange.printYears();
    
    YearRange mySecondRange = new YearRange(1100, 3150);
    mySecondRange.setrangeType(2);
    System.out.println("List of all leap years between " + mySecondRange.getfirstYear() + " and " + mySecondRange.getsecondYear());
    mySecondRange.printYears();
    
    YearRange myThirdRange = new YearRange(1500, 1890);
    myThirdRange.setrangeType(3);
    myThirdRange.setfirstDivisor(3); 
        myThirdRange.setsecondDivisor(4);
    System.out.println("List of all Olympic years between " + myThirdRange.getfirstYear() + " and " + myThirdRange.getsecondYear() + " that are divisible by " + myThirdRange.getfirstDivisor());
    myThirdRange.printYears(); 
  }
}