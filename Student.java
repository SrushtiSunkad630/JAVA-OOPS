import java.util.*;
class Student{
     String USN;
     String name;
     int no_sub;
     int credits[];
     int marks[];

    void getd(){
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter USN: ");
      USN=scn.nextLine();
      System.out.println("Enter name: ");
      name=scn.nextLine();
      System.out.println("Enter number of subjects: ");
      no_sub=scn.nextInt();
      
      credits=new int[no_sub];
      marks=new int[no_sub];
      for(int i=0;i<no_sub;i++){
          System.out.println("Enter credits: ");
          credits[i]=scn.nextInt();
          System.out.println("Enter Mraks: ");
          marks[i]=scn.nextInt();
     }
  }
  
  void putd(){
       System.out.println("USN:" + USN);
       System.out.println("Name:"+name);
       System.out.println("Number of Subjects:" + no_sub);
       for(int i=0;i<no_sub;i++){
            System.out.println("Subject"+(i+1)+ ":"+"marks= "+ marks[i]+ "credits="+credits[i]);
       }
       double sgpa=cal_sgpa();
       System.out.println("SGPA:" + sgpa);
  }
  double cal_sgpa(){
       int total_credits=0;
       int total_points=0;
       for(int i=0;i<no_sub;i++){
            total_credits+=credits[i];
            int grade_p=gradepoints(marks[i]);
            total_points+=grade_p *credits[i];
      }
      return (double) total_points/total_credits;
 }
 
 int gradepoints(int marks){
     if(marks>=90) return 10;
     else if(marks>=80) return 9;
     else if(marks>=70) return 8;
     else if(marks>=60) return 7;
     else if(marks>=50) return 6;
     else if(marks>=40) return 5;
     else return 0;
  }
}

class StudentMain{
     public static void main(String[] args){
       Student s1=new Student();
       s1.getd();
       s1.putd();
    }
}



//OUTPUT

Enter USN:
1BM23CS341
Enter name:
Srushti Sunkad
Enter number of subjects:
8
Enter credits:
4
Enter Mraks:
93
Enter credits:
4
Enter Mraks:
98
Enter credits:
3
Enter Mraks:
90
Enter credits:
3
Enter Mraks:
77
Enter credits:
3
Enter Mraks:
84
Enter credits:
1
Enter Mraks:
95
Enter credits:
1
Enter Mraks:
94
Enter credits:
1
Enter Mraks:
98
USN:1BM23CS341
Name:Srushti Sunkad
Number of Subjects:8
Subject1:marks= 93credits=4
Subject2:marks= 98credits=4
Subject3:marks= 90credits=3
Subject4:marks= 77credits=3
Subject5:marks= 84credits=3
Subject6:marks= 95credits=1
Subject7:marks= 94credits=1
Subject8:marks= 98credits=1
SGPA:9.55
