import java.util.*;
class Book{
   String name;
   String author;
   int price;
   int no_pages;
   
   Book(){}
   
   Scanner scn=new Scanner(System.in);
   Book(String name, String author,int price, int no_pages){
          this.name=name;
          this.author=author;
          this.price=price;
          this.no_pages=no_pages;
  }
  void getd(){
     System.out.println("Enter book name:");
     name=scn.nextLine();
     System.out.println("Enter author name:");
    author=scn.nextLine();
    System.out.println("Enter price:");
    price=scn.nextInt();
    System.out.println("Enter number of pages:");
    no_pages=scn.nextInt();
 }
 void putd(){
     System.out.println("Book name:" + name);
     System.out.println("Author name:" + author);
     System.out.println("Book price:" + price);
     System.out.println("Number of pages:" + no_pages);
 }
 
 public String toString(){
    return "Book{" + "Name="+name+",Author="+author+",Price="+price+",Number of pages="+no_pages+"}";
 }
}
 
class BookMain{
    public static void main(String[] args){
      Scanner scn=new Scanner(System.in);
      Book b1=new Book("BalaswamyBook","Balaswamy", 499, 900);
      b1.putd();
      System.out.println("Enter number of books");
      int n=scn.nextInt();
      Book[] b=new Book[n];
      for(int i=0;i<n;i++){
          b[i]=new Book();
          b[i].getd();
          b[i].putd();
     }
     System.out.println("All book details:");
     for(int i=0;i<n;i++){
         System.out.println(b[i].toString());
     }
   }
}



//OUTPUT
Book name:BalaswamyBook
Author name:Balaswamy
Book price:499
Number of pages:900
Enter number of books
2
Enter book name:
Wings of Fire
Enter author name:
APJ Abdul Kalam
Enter price:
250
Enter number of pages:
689
Book name:Wings of Fire
Author name:APJ Abdul Kalam
Book price:250
Number of pages:689
Enter book name:
XYZ
Enter author name:
xyz
Enter price:
300
Enter number of pages:
800
Book name:XYZ
Author name:xyz
Book price:300
Number of pages:800
All book details:
Book{Name=Wings of Fire,Author=APJ Abdul Kalam,Price=250,Number of pages=689}
Book{Name=XYZ,Author=xyz,Price=300,Number of pages=800}
