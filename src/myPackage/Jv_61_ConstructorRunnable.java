package myPackage;
class MyThread implements Runnable{
    public void run(){
        System.out.println("Now the thread is running.....");

    }
}
public class Jv_61_ConstructorRunnable {
    public static void main(String[] args) {
        Runnable r=new MyThread();
        Thread th=new Thread(r, "My new Thread");
        th.start();

        String str=th.getName();
        System.out.println("Name is "+str);
        System.out.println("Id is "+th.getId());
    }
}
