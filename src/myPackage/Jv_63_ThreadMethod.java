package myPackage;
class myNewThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank you:");
        }
    }
}
class myNewThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println(" My Thank you:");
        }
    }
}
public class Jv_63_ThreadMethod {
    public static void main(String[] args) {
    myNewThread t1=new myNewThread();
    myNewThread2 t2=new myNewThread2();
    t1.start();
//    try{
//        t1.join();
//    }
//    catch(Exception e){
//        System.out.println(e);
//    }
    t2.start();
    }
}
