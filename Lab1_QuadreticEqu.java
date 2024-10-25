import java.util.*;
class QuadMain{
     public static void main(String[] args){
       Scanner scn=new Scanner(System.in);
       int a=scn.nextInt();
       int b=scn.nextInt();
       int c=scn.nextInt();
       int d=(b*b)-(4*a*c);
       if(d>=0){
          double r1=(-b+Math.sqrt(d)/(2*a));
          double r2=(-b-Math.sqrt(d)/(2*a));
          if(d==0){
              System.out.println("Real Solutions" +r1);
          }
          else{
             System.out.println("Real solutions: " +r1+" "+r2);
          }
       }
       else{
         System.out.println("No real solutions");
      }
   }
}


//OUTPUT

//CASE1:
1
2
3
No real solutions

//CASE2:
1
-5
4
Real solutions: 6.5 3.5
