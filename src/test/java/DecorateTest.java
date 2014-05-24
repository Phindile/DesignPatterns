/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.phindile.StructureDesignPattern.DecoratePattern.service.Imp.Rectangle;
import com.phindile.StructureDesignPattern.DecoratePattern.service.Imp.RedShapeDecorector;
import com.phindile.StructureDesignPattern.DecoratePattern.service.Shape;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author chiry
 */
public class DecorateTest {
    
    public DecorateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void DecorateTest()
    {
        Shape redrectangle = new RedShapeDecorector(new Rectangle());
        System.out.println("\nRectangle of red border");
        redrectangle.draw();
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
