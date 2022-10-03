package entities;

public class SavingsAccount extends Account {


    public SavingsAccount(Client client) {
        super(client);
    }

    public void printExtract(){
        System.out.println("*** Saving Account Extract ***");
        super.printAccInfo();
    }

}
