public class Customer {

    private String name;
    private String carNumberPlate;
    private String phoneNumber;
    private int password;
    private double washCardBalance;
    private String[] options = {"Check Balance", "Top-up the Balance", "Wash Car"};


    public Customer() {};
    public Customer (String name, String carNumberPlate, String phoneNumber, int password,double washCardBalance) {
        this.name = name;
        this.carNumberPlate = carNumberPlate;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.washCardBalance= washCardBalance;
    }

    public void chargeWashCardBalance(double amount) {
        System.out.println("Charge Balance!");
        this.washCardBalance += amount;
        System.out.println("Balance: " + this.washCardBalance);
    }

    public void washCar() {
        // params: WashType type
        System.out.println("Washing Car!");
    }


}
