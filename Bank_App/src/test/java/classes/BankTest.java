package classes;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;
    @org.junit.Before
    public void setUp() throws Exception {
        bank = new Bank("GCB");
        bank.addBranch("Accra");
        bank.addCustomers("Accra","Mike",200);
        bank.addCustomerTransaction("Accra","Mike",420);
        //bank.listCustomers("Accra",true);
    }

    @org.junit.Test
    public void addBranch() {

        assertTrue(bank.addBranch("Adelaide"));
        assertFalse(bank.addBranch(""));
    }

    @org.junit.Test
    public void addCustomers() {
        assertTrue(bank.addCustomers("Accra","Mike",200));
    }

    @org.junit.Test
    public void addCustomerTransaction() {
        assertTrue(bank.addCustomerTransaction("Accra","Mike",420));
    }

    @org.junit.Test
    public void listCustomers() {
        assertTrue(bank.listCustomers("Accra",true));
    }
}