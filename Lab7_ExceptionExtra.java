import java.util.*;
class WrongMarks extends Exception
{
   public WrongMarks(String msg){
       super(msg);
   }
}

class Internals
{
   int IntMarks;
   Internals(int IntMarks) throws WrongMarks{
        if(IntMarks>30){
            throw new WrongMarks("Internal mark exceeded");
        }
        this.IntMarks=IntMarks;
        
   }
}

class Externals
{
    int ExtMarks;
    Externals(int ExtMarks) throws WrongMarks{
         if(ExtMarks>70){
            throw new WrongMarks("External mark exceeded");
        }
        this.ExtMarks=ExtMarks;
    }
}

public class Demo
{
   public static void main(String [] args){
     Scanner scn=new Scanner(System.in);

     System.out.println("Enter Internal Marks:");
     int Imarks=scn.nextInt();

     System.out.println("Enter External Marks:");
     int Emarks=scn.nextInt();
   
     try
     {
       Internals i=new Internals(Imarks);
       System.out.println("Internal Marks are valid:"+i.IntMarks);
     }
     catch(WrongMarks e){
         System.out.println(e.getMessage());
     }
     try
      {
      Externals E=new Externals(Emarks);
      System.out.println("External Marks are valid:"+E.ExtMarks);
      }
      catch(WrongMarks e){
         System.out.println(e.getMessage());
     }

   }
}

//OUTPUT
//Case:1
Enter Internal Marks:
20
Enter External Marks:
60
Internal Marks are valid:20
External Marks are valid:60

//Case:2
Enter Internal Marks:
20
Enter External Marks:
90
Internal Marks are valid:20
External mark exceeded

//Case:3
Enter Internal Marks:
40
Enter External Marks:
60
Internal mark exceeded
External Marks are valid:60

//Case:4
Enter Internal Marks:
40
Enter External Marks:
90
Internal Marks exceeded
External mark exceeded
