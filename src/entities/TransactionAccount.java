package entities;

public class TransactionAccount extends Account {
    public TransactionAccount(Client client) {
        super(client);
    }


    public void printExtract(){
        System.out.println("*** Transaction Account Extract ***");
        super.printAccInfo();
    }
}

