ublic class YearRange
{
 private int year1 ;
 private int year2;
 private int divide1;
 private int divide2;
 private int range;

    public YearRange(int range1, int range2)
    {
     this.year1 = range1;
     this.year2 = range2;
    }


     public void prepDivider1(int divide1)
     {
       this.divide1 = divide1;
     }

    public void prepDivider2(int divide2)
    {
      this.divide2 = divide2;
    }

    public int findDivider1()
    {
      return divide1;
    }
    public int findDivider2()
    {
      return divide2;
    }

    public void prepRange(int range)
    {
      this.range = range;
    }
    public int prepYear1()
    {
      return year1;
    }

    public int prepYear2()
    {
      return year2;
    }
    public void printYear()
    {
      if ( this.range ==1)
      {
        for(int count= this.year1;count<=this.year2;count++)
        {
          if(count % this.divide1 == 0  & count %  this.divide2 == 0)
          {
            System.out.print(count+",");
          }

        }
       }
       else if( this.range == 2)
       {
         for(int count= this.year1;count<=this.year2;count++)
         {
           if(count % 4 ==0 )
           {
             System.out.print(count+",");

           }


          }
        }
        else if ( this.range ==3)
        {
           for(int count= this.year1;count<=this.year2;count++)
           {
             if(count % this.divide1 == 0  & count %  this.divide2 == 0)
             {
               System.out.print(count+",");

             }

           }
        }
        else
        {
          System.out.print("Select 1, 2 or 3");
        }

    }



    public static void main(String[] args) {

        //Get all years divisible by 14 and 20

        YearRange myFirstRange = new YearRange(1314, 2014);//specifies the  borders
         myFirstRange.prepRange(1); //specifies the Range type
        myFirstRange.prepDivider1(14); //specifies the first dividor
        myFirstRange.prepDivider2(20); //specifies the second dividor
        System.out.println("List of all years divisible by "+ myFirstRange.findDivider1() + " and " + myFirstRange.findDivider2()); 
        myFirstRange.printYear(); // print out
        System.out.println();

        //Get all leap years.
         System.out.println();
        YearRange mySecondRange = new YearRange(1100, 3150); //specifies the  borders
        mySecondRange.prepRange(2);//specfies the range type
        System.out.println("List of all leap years between " + mySecondRange.prepYear1() + " and "+ mySecondRange.prepYear2());
        mySecondRange.printYear();
        System.out.println();

        //Get all Olympic years divisible by 3
         System.out.println();
        YearRange myThirdRange = new YearRange(1500, 1890); 
        myThirdRange.prepRange(3);
        myThirdRange.prepDivider1(3); //specifies the first dividor
        myThirdRange.prepDivider2(4);//every olympic year comes after 4 years
        System.out.println("List of all Olympic years between " + myThirdRange.prepYear1() + 
        " and " + myThirdRange.prepYear2() + " that are divisible by " + myThirdRange.findDivider1()); 
        myThirdRange.printYear();
        System.out.println();



    }

} 
