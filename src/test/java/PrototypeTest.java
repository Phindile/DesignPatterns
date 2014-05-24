/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.DesignPatterns.PrototypePattern.service.Imp.Dog;
import com.phindile.DesignPatterns.PrototypePattern.service.Imp.Person;
import org.testng.Assert;
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
public class PrototypeTest {
    
    public PrototypeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestPrototype(){
        Person person1 = new Person("Pizzy");
        System.out.println("person1"+person1);
        Person person2 =(Person) person1.doClone();
        System.out.println("person2"+person2);
       Assert.assertEquals(person2.toString(),"Pizzy");
        
        Dog dog =new Dog("Puppy");
        System.out.println("person2"+dog);
        Dog dog2 = (Dog) dog.doClone();
        System.out.println("Dog2"+dog2);
        Assert.assertEquals(dog2.toString(),"Puppy");
        
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
