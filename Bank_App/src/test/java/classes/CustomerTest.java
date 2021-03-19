package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    private Customer customer_1;
    private Customer customer_2;
    @Before
    public void setUp() throws Exception {
        customer_1 = new Customer("Mike",50);
        customer_2 = new Customer("Tim",50);
        customer_1.addTransactions(250);
        customer_2.addTransactions(250);
        customer_1.getTransactions();
        customer_2.getTransactions();
    }

    @Test
    public void getName() {
        customer_1.getName();
    }

    @Test
    public void getTransactions() {
        customer_1.getTransactions();
    }

    @Test
    public void addTransactions() {
       customer_2.addTransactions(150);
    }
}