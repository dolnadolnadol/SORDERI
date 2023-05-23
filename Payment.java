public class Payment{
    private String[] payment = {"QR", "Cash"};
    Payment(){

    }
    public void QRpayment(){
        System.out.println("\n" + payment[0] + "\n" + "|||||| |||| ||||| || |||||||||");
    }
    public void Cashpayment(){
        System.out.println("\n" + payment[1] + "\n" + "Give waiter a money");
    }
}