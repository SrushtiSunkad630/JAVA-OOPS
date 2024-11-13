//CIE/Student
package CIE;
import java.util.*;


public class Student
{
   public String USN;
   public String Name;
   public int sem;
  
   Scanner scn=new Scanner(System.in);

   public void getd(){
      System.out.println();
      scn.nextLine();
      System.out.println("Enter USN:");
      USN=scn.nextLine();
      System.out.println("Enetr Name:");
      Name=scn.nextLine();
      System.out.println("Enetr sem:");
      sem=scn.nextInt();
   }

   public void putd(){
     System.out.println("USN:"+USN);
     System.out.println("Name:"+Name);
     System.out.println("Sem:"+sem);
}
}

//CIE/Internals
package CIE;
import java.util.*;

public class Internals
{
   Scanner scn=new Scanner(System.in);

   public int Cmarks[]=new int[5];
  
   public void getd(){
     System.out.println("Enter CIE marks:");
     for(int i=0;i<5;i++){
       Cmarks[i]=scn.nextInt();
     }
   }

  public void putd(){
     for(int i=0;i<5;i++){
       System.out.print(Cmarks[i]+" ");
     }
   }
}

//SEE/Externals
package SEE;
import CIE.Student;
import java.util.*;


public class External extends Student
{
   Scanner scn=new Scanner(System.in);

     public int Smarks[]=new int[5];
   
   public void getd(){
     System.out.println();
     System.out.println("Enter SEE marks:");
     for(int i=0;i<5;i++){
       Smarks[i]=scn.nextInt();
     }
   }

   public void putd(){
      for(int i=0;i<5;i++){
       System.out.print(Smarks[i]+" ");
      }
   }

   public int getFinalMark(int Idx, int internalMark) {
        return internalMark + (Smarks[Idx] / 2);
    }
}

//C_SMain
import java.util.*;
import CIE.*; 
import SEE.*;

class C_SMain
{
   public static void main(String[] args){
   Scanner scn=new Scanner(System.in);

   System.out.println("Enter number of Students:"); 
   int n=scn.nextInt();  
 
   Student s=new Student();

   Internals I[]=new Internals[n];
   External E[]=new External[n];

   for(int i=0;i<n;i++){
       s.getd();
       s.putd();
 
       I[i]=new Internals();
       I[i].getd();
       I[i].putd();

       E[i]=new External();
       E[i].getd();
       E[i].putd();

    System.out.println("Final Marks:");
            for (int j = 0; j < 5; j++) {
                int finalMark = E[i].getFinalMark(j, I[i].Cmarks[j]);
                System.out.println(finalMark);
            }
    }

     }
}

//OUTPUT
Enter number of Students:
2

Enter USN:
1BM23CS341
Enetr Name:
Srushti
Enetr sem:
3
USN:1BM23CS341
Name:Srushti
Sem:3
Enter CIE marks:
40
48
47
46
45
40 48 47 46 45
Enter SEE marks:
90
98
97
91
92
90 98 97 91 92 
Final Marks:
85
97
95
91
91

Enter USN:
1BM23CS222
Enetr Name:
Spoorti
Enetr sem:
3
USN:1BM23CS222
Name:Spoorti
Sem:3
Enter CIE marks:
44
45
43
42
41
44 45 43 42 41
Enter SEE marks:
90
99
98
94
91
90 99 98 94 91 
Final Marks:
89
94
92
89
86
