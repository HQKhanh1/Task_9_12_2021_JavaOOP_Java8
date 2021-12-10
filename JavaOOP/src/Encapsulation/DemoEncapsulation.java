package Encapsulation;

public class DemoEncapsulation {
    public static void main(String[] args) {
        //creating instance of Account class
        Account acc = new Account();
        //setting values through setter methods
        acc.setAcc_no(7560504000L);
        acc.setName("khanh Huynh");
        acc.setEmail(" khanhhq@itsj-group.com.vn");
        acc.setAmount(3000000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}
