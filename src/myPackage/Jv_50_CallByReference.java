public class Jv_50_CallByReference {
    int data=46;
    void change(Jv_50_CallByReference ref){
        ref.data=ref.data+50; //changes here will reflect out of this block
    }
    public static void main(String[] args) {
        Jv_50_CallByReference ref=new Jv_50_CallByReference();
        System.out.println("Before changing "+ref.data);
        ref.change(ref);
        System.out.println("After changing "+ref.data);
    }
}