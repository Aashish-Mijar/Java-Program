package myPackage;
//creating thread using extends method...
class myThread extends Thread{
    public void run(){
        int i=0;
        while(i<100) {
            System.out.println("Thread one is running.......");
            i++;
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<100) {
            System.out.println("Thread two is running now.......");
            i++;
        }
    }
}
public class Jv_58_ThreadUsingExtend {
    public static void main(String[] args) {
        myThread t1=new myThread();
        t1.start();
        myThread2 t2=new myThread2();
        t2.start();
    }
}
