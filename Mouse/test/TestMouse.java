/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import mouse.*;
/**
 *
 * @author harit
 */
public class TestMouse {
    public static void main(String[] args) {
        Mouse[] mouses=new Mouse[3];

mouses[0]=new WireMouse("Green",1.5,"USB Type-C");
mouses[1]=new WirelessMouse("Yellow",2.4);
mouses[2]=new WirelessMouse("Blue",5);

for(Mouse mouse:mouses){
System.out.println(mouse.toString());
}
mouses[0].leftClick();
mouses[1].rightClick();
mouses[0].scoll(-5);
mouses[0].scoll(2);
    }
    
    public TestMouse() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
