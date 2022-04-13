package Class;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car(); //
        Car holden = new Car(); //
        //porsche.equals(holden); // equals and other methods are inherited from Object class.
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
        BankAccount bobsAccount = new BankAccount();
        BankAccount samsAccount = new BankAccount(1,9000,"Sam Taylor","samtaylor@yahoo.com","(778) 212 4567");
        bobsAccount.depositFunds(50);
        bobsAccount.depositFunds(100);
        bobsAccount.withdrawalFunds(150);
        bobsAccount.withdrawalFunds(150);
        samsAccount.depositFunds(8000);
        samsAccount.withdrawalFunds(22000);

        BankAccount noobAccount = new BankAccount("Asad Raza Nayani","asadraza@jojo.com","(789) 090 2213");
        noobAccount.depositFunds(1000);
        noobAccount.withdrawalFunds(1000);




    }
}
