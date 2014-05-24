/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.DesignPatterns.FactoryPattern.BankTransactionFactory;
import com.phindile.DesignPatterns.FactoryPattern.service.BankTransaction;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author chiry
 */
public class FactoryTest {
    
    public FactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void FactoryTest()
    { 
        //get an object of Deposit and call its draw method.
        BankTransactionFactory banktransaction = new  BankTransactionFactory ();
        
        BankTransaction bank = banktransaction.getTransaction("Deposit");  
        //Assert.assertEquals(bank.getTransaction(),"DepositTransaction");
    }

//    @BeforeClass
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//
//    @BeforeMethod
//    public void setUpMethod() throws Exception {
//    }
//
//    @AfterMethod
//    public void tearDownMethod() throws Exception {
//    }
}
