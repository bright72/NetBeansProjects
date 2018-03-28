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
public class SitAppStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item[] items=new Item[4];
items[0]=new Movie("Wall-E", "Family", 100);
items[1]=new Movie("Guardians of the G", "Action&Adventure", 260);
items[2]=new Application("TO-FU", "Education", 0);
items[3]=new Application("Minecraft", "Game", 254);
Item.setOrderBy("appName");
showMe(items);
Item.setOrderBy("category");
showMe(items);
Item.setOrderBy("price");
showMe(items);
}
// method นี ้ใช้เพื่อการแสดงผลเท่านั้น
public static void showMe(Item[] items) {
Arrays.sort(items);
System.out.println("Order By: "+Item.getOrderBy());
for(Item item:items){
System.out.println(item);
}
System.out.println("");
}
    }
    
}
