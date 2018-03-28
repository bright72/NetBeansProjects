/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitappstore;

/**
 *
 * @author harit
 */
public class Application extends Item {

    public Application() {
    }

    public Application(String appName, String category, double price) {
        super(appName, category, price);
    }
    
    @Override
    public String getType(){
    
    }
}
