package myPackage;
class Dogs{
    boolean speak(){
        System.out.println("vou vou");
        return false;
    }
}
//class talkingDog extends Dogs{
//    @Override
//    boolean speak(){
//        System.out.println("Scooby Doo says *Ruh Ruh*");
//        return false;
//    }
//}
public class Jv_72_anonymousClass {
    public static void main(String[] args) {
//        Anonymous class= A classes that doesn't have a name. Cannot be reused.
//                          Add custom behavior without having to create a new class.
//                          Often used for one time uses(TimeTask, Runnable, callbacks)

        Dogs dog=new Dogs();
        Dogs dog2=new Dogs(){
            @Override
            boolean speak(){
                System.out.println("Scooby Do says *Ruh Ruh*");
                return false;
            }
        };


//        talkingDog talkDog=new talkingDog();
        System.out.println(dog.speak());
        System.out.println(dog2.speak());
//        System.out.println(talkDog.speak());
    }
}
