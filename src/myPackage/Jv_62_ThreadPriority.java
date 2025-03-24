package myPackage;
 class MyThr extends Thread{
     MyThr(String name){
         super(name);
     }
    public void run() {
        int i = 32;
        System.out.println("Thread running..........");
        while (true) {
            System.out.println("Thank you" + this.getName());
        }
    }
}
public class Jv_62_ThreadPriority {
    public static void main(String[] args) {
        MyThr thr1=new MyThr("Aashish ");
        MyThr thr2=new MyThr("Mira");
        MyThr thr3=new MyThr("Mina");
        MyThr thr4=new MyThr("Ayushma");
        thr4.setPriority(Thread.MAX_PRIORITY);
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
    }
}
