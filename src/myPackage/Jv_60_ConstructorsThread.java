package myPackage;
class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am a thread ");
    }
}
public class Jv_60_ConstructorsThread {
    public static void main(String[] args) {
        myThr thr=new myThr("Aashish");
        thr.start();
        System.out.println("The name of the thread is "+thr.getName());
        System.out.println("The id of the thread is "+thr.getId());
    }
}
