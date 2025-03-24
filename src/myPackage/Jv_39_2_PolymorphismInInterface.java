package myPackage;
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void photo(){
        System.out.println("Taking photos");
    }
    default void record4KVideo(){
        photo();
        System.out.println("Recording 4k video");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class myCellPhone2{
    void cellNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting......");
    }
}

class mySmartPhone2 extends myCellPhone implements MyCamera, MyWifi {
    public void takeSnap(){
        System.out.println("Taking snap........");
    }
    public void recordVideo(){
        System.out.println("Recording video........");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of network");
        String[] networkList={"Aashish23", "AaraiWifi"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
//    public void record4KVideo(){
//        System.out.println("Taking snap in 4K");
//    }
}
public class Jv_39_2_PolymorphismInInterface {
    public static void main(String[] args) {
    MyCamera cam=new mySmartPhone2(); // smart phone is used as a camera, only camera not others
    cam.record4KVideo();
//    cam.getNetworks() -> not allowed
    }
}
