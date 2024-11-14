abstract class Shape
{
   int dim1,dim2;
   Shape(int x,int y){
      dim1=x;
      dim2=y;
   }
   abstract double PrintArea();
}

class Rectangle extends Shape
{
  Rectangle(int a,int b){
     super(a,b);
  }
  double PrintArea(){
     return dim1*dim2;
  }
}

class Triangle extends Shape
{
  Triangle(int a,int b){
     super(a,b);
  }
  double PrintArea(){
     return 0.5*dim1*dim2;
  }
}

class Circle extends Shape
{
  Circle(int a,int b){
     super(a,b);
  }
  double PrintArea(){
     return 3.14*dim1*dim1;
  }
}

class AbstractMain
{
   public static void main(String[] args){
     Rectangle r=new Rectangle(100,240);
     Triangle t=new Triangle(10,20);
     Circle c=new Circle(10,0);
 
     System.out.println("Area of rectangle:"+r.PrintArea());
     System.out.println("Area of Triangle:"+t.PrintArea());
     System.out.println("Area of Circle:"+c.PrintArea());
  }
}


//OUTPUT
Area of rectangle:24000.0
Area of Triangle:100.0
Area of Circle:314.0
