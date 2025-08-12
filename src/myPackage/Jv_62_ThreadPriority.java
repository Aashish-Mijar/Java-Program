package myPackage;
 class MeroThread extends Thread{
     MeroThread(String name){
         super(name);
     }
    public void run() {
        int i = 32;
        System.out.println("Thread running..........");
//        while (true) {
//            System.out.println("Thank you" + this.getName());
//        }
    }
}
public class Jv_62_ThreadPriority {
    public static void main(String[] args) {
        MeroThread thr1=new MeroThread("Aashish ");
        MeroThread thr2=new MeroThread("Mira");
        MeroThread thr3=new MeroThread("Mina");
        MeroThread thr4=new MeroThread("Ayushma");
        thr4.setPriority(Thread.MAX_PRIORITY);
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        System.out.println("The priority of thread is "+thr4.getPriority());
    }
}
