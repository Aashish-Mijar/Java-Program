package myPackage;
class Admission{
    String name;
     Admission(String name){
         this.name=name;
     }
 }

 class IdCard{
    // passing objects
     void card(Admission ad){
        System.out.println("This is "+ad.name+"'s id card");
    }
 }


public class Jv_34_ObjectPassing {
    public static void main(String[] args) {
  IdCard idC=new IdCard();
  Admission adM1=new Admission("Aashish");
  Admission adM2=new Admission("Prabin");
  idC.card(adM1);
  idC.card(adM2);
    }
}
