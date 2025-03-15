interface Camera{
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

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class myCellPhone{
    void cellNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting......");
    }
}

class mySmartPhone extends myCellPhone implements Camera, Wifi {
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
public class Jv_38_1_Interface {
    public static void main(String[] args) {
    mySmartPhone ms=new mySmartPhone();
    ms.record4KVideo();
    String[] ar=ms.getNetworks();
    for(String item:ar){
        System.out.println(item);
    }

    }
}
