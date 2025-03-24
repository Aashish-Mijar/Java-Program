package myPackage;
class Account{
    private long acc_no;
    private String name, email;
    private float amount;

//    Getters and Setters
    public long getAcc_no(){
        return acc_no;
    }
    public void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }

}
public class Jv_40_1_ExmpEncapsulation {
    public static void main(String[] args) {
    Account account=new Account();
    account.setAcc_no(2036547852L);
    account.setName("Aashish  Mijar");
    account.setEmail("aashishmijar@gmail.com");
    account.setAmount(5000000f);

        System.out.println("Account number is "+account.getAcc_no());
        System.out.println("Account holder's name is "+account.getName());
        System.out.println("Account holder's email is "+account.getEmail());
        System.out.println("Account balance is "+account.getAmount());
    }
}
