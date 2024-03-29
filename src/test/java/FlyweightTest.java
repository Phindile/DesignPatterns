/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.StructureDesignPattern.FlyweightPattern.service.Imp.Circle;
import com.phindile.StructureDesignPattern.FlyweightPattern.service.Imp.ShapeFactory;
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
public class FlyweightTest {
     private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    
    public FlyweightTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestFlyweight()
    {
        
      for(int i=0; i < 20; ++i) {
      Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
      circle.setX(getRandomX()); circle.setY(getRandomY());
       circle.setRadius(100); circle.draw();
      }
    }
    private static String getRandomColor()
    { 
        return colors[(int)(Math.random()*colors.length)];
        
    }
    private static int getRandomX() 
    { 
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() 
    { 
        return (int)(Math.random()*100);
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
