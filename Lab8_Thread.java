class Thread1 extends Thread
{
  private String msg;
  private int intervals;

  Thread1(String msg,int intervals){
      this.msg=msg;
      this.intervals=intervals;
  }

  public void run(){
      try{
          while(true){
              System.out.println(msg);
              Thread1.sleep(intervals*1000);
          }
      } 
      catch(InterruptedException e){
          System.out.println("Interrupt Mag:"+msg);
      } 
  }
}

class TMain
{ 
   public static void main(String [] args){
       Thread1 t1=new Thread1("BMS College of Enginneering",10);
       Thread1 t2=new Thread1("CSE",2);

       t1.start();
       t2.start();
   }
}
