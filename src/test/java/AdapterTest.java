/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.StructureDesignPattern.adapterDesignPattern.service.concreteclasses.AccountAdapter;
import com.phindile.StructureDesignPattern.adapterDesignPattern.service.concreteclasses.typAccount;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author chiry
 */
public class AdapterTest {
    
    public AdapterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestAdapter()
    {
        typAccount accAdapter;
        accAdapter = new typAccount();
        
        accAdapter.Account("Savings","Phindile Mposwa");
        accAdapter.Account("Check","Lelethu lee-Cooper Mbekhi");
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
