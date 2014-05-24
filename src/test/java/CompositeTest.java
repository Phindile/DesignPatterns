/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.StructureDesignPattern.CompositePattern.Employee;
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
public class CompositeTest {
    
    public CompositeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void CompsositeTest(){
        Employee Ceo =new Employee("Pindile","CEO",500000);
        Employee HeadSales =new Employee("Lelethu","HeadSales",30000);
        Employee HeadMarcketing = new Employee("Anda","HeadMarcketing",8000);
        //sales
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        //marcket
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        
        Ceo.addEmployee(HeadSales);
        Ceo.addEmployee(HeadMarcketing);
        
        HeadSales.addEmployee(salesExecutive1);
        HeadMarcketing.addEmployee(clerk1);
        //print All Employees
        System.out.println(Ceo);
        for(Employee Topemps :Ceo.getAllEmployees()){
            System.out.println(Topemps);
            for(Employee heademps:Topemps.getAllEmployees()){
                System.out.println(Topemps);
            }
        }
        
        
        
        
        
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
