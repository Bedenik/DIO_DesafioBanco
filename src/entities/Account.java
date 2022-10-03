package entities;

public abstract class Account {
    protected double balance;
    protected  int agency;
    protected  int accountNumber;
    protected Client client;
    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCIAL = 0;

    public Account(Client client){
        this.accountNumber = SEQUENCIAL;
        this.agency = DEFAULT_AGENCY;
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public int getAgency() {
        return agency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void withdraw(double value) {
        balance -= value;
    }

    public void deposit(double value){
        balance += value;

    }

    public void transfer(double value, Account destinyAccount ){
        this.withdraw(value);
        destinyAccount.deposit(value);
    }

    protected void printAccInfo(){
        System.out.printf("Agency: %d%n",this.agency);
        System.out.printf("Number: %d%n",this.accountNumber);
        System.out.printf("Balance: %.2f%n",this.balance);
    }

}
