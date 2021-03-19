package classes;

public class BankDriver {
    public static void main(String[] args) {
        Bank bank_1 = new Bank("Zenith");
        Bank bank_2 = new Bank("GCB");
        bank_1.addBranch("New York");
        bank_1.addCustomers("New York","Kofi",200);
        bank_1.listCustomers("New York",true);
        System.out.println("\n");

        bank_2.addBranch("Accra");
        bank_2.addBranch("London");
        bank_2.addCustomers("London","Kay",500);
        bank_2.addCustomers("Accra","Mike",200);
        bank_2.addCustomers("Accra","Kelvin",200);
        bank_2.addCustomers("Accra","David",210);
        bank_2.addCustomerTransaction("Accra","David",1);
        bank_2.addCustomerTransaction("Accra","Mike",420.5);
        bank_2.addCustomerTransaction("London","Kay",620.24);
        bank_2.addCustomerTransaction("London","Kay",756.23);
        bank_2.listCustomers("Accra",true);
        System.out.println("\n");
        bank_2.listCustomers("London",true);

    }
}
