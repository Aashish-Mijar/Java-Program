package myPackage;
class myThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<100){
        System.out.println("Thread one using runnable interface");
        i++;
        }
    }
}
class myThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread two using runnable interface");
            i++;
        }
    }
}
public class Jv_59_ThreadRunnable {
    public static void main(String[] args) {
        myThreadRunnable1 myT1=new myThreadRunnable1();
        Thread t1=new Thread(myT1);
        myThreadRunnable2 myT2 =new myThreadRunnable2();
        Thread t2=new Thread(myT2);
        t1.start();
        t2.start();
    }
}
