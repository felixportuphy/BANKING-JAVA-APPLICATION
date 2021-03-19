package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    private Branch branch_1;
    private Branch branch_2;
    @Before
    public void setUp() throws Exception {
       branch_1 = new Branch("Accra");
       branch_2 = new Branch("Adelaide");
       branch_1.newCustomer("Mike",200);
       branch_1.newCustomer("Kelvin",200);
       branch_1.addCustomerTransaction("Mike",420);
       branch_1.addCustomerTransaction("Kelvin",420);
       branch_1.getCustomer();
       branch_1.getName();


    }

    @Test
    public void getName() {
        branch_1.getCustomer();
    }

    @Test
    public void getCustomer() {
        branch_1.getCustomer();
    }

    @Test
    public void newCustomer() {
        assertTrue(  branch_2.newCustomer("Tim",200));
    }

    @Test
    public void addCustomerTransaction() {
        assertTrue( branch_1.addCustomerTransaction("Kelvin",420));
    }
}