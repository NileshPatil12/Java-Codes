class hi extends Thread
{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            
        }
    }
}
class hello extends Thread
{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
            //try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}



public class ThreadDemo {
    public static void main(String args[]){
        hi a= new hi();
        hello b=new hello();
        a.start();
        b.start();

    }
    
}
