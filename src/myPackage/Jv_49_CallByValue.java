public class Jv_49_CallByValue {
    int value=50;
    void change(int val){
        val=val+20; // changes here will not reflect out of this block
    }
    public static void main(String[] args) {
        Jv_49_CallByValue op=new Jv_49_CallByValue();
        System.out.println("Before changing "+ op.value);
        op.change(34);
        System.out.println("After changing "+op.value);
    }
}
