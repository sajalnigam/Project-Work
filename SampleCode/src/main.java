public class main {
    public static void main(String[] args)
    {
        Account call=new Account();
        call.setAccount("9855");
        call.setBalance(1000.00);
        call.setCustomername("Sajal Nigam");
        call.setEmail("sajal.sajal.nigam@gmail.com");
        call.setMobile("8840661109");

        call.withdrawl(1050);
        call.display();
    }
}
