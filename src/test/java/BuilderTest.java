/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.DesignPatterns.BuilderDesignPattern.Developers;
import com.phindile.DesignPatterns.BuilderDesignPattern.DevelopmentDirector;
import com.phindile.DesignPatterns.BuilderDesignPattern.service.DeveloperBuilder;
import com.phindile.DesignPatterns.BuilderDesignPattern.service.Imp.EasternCapeDevelopersBuilder;
import com.phindile.DesignPatterns.BuilderDesignPattern.service.Imp.WersternCapeDevelopersBuilder;
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
public class BuilderTest {
    
    public BuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
  @Test
  public void TestBuild(){
      DeveloperBuilder devebuilder = new WersternCapeDevelopersBuilder ();
      DevelopmentDirector developdirector = new DevelopmentDirector(devebuilder);
      developdirector.constructDevelopers();
      Developers developer = developdirector.getDeveloper();
      System.out.println("Western Developer is:"+developer);
      
       devebuilder = new EasternCapeDevelopersBuilder ();
       developdirector = new DevelopmentDirector(devebuilder);
       developdirector.constructDevelopers();
       developer = developdirector.getDeveloper();
       System.out.println("EasternCape Developer is:"+developer);
      
      
      
      
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
