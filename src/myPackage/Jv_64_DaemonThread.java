package myPackage;
class TestDaemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread work");
        }
        else{
            System.out.println("User Thread work");
        }
    }
}
public class Jv_64_DaemonThread {
    public static void main(String[] args) {
        TestDaemonThread t1=new TestDaemonThread();
        TestDaemonThread t2=new TestDaemonThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        System.out.println("Name "+Thread.currentThread().getName());
        System.out.println("Daemon "+Thread.currentThread().isDaemon());
    }
}
