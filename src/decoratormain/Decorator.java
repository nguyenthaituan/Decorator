
package decoratormain;

import Beverage.Beverage;
import Beverage.DarkRoast;
import decorator.Milk;
import decorator.Mocha;
public class Decorator {

    public static void main(String[] args) {
        Beverage dr = new DarkRoast("cafe đen số 1 thế giới: ");
        dr = new Milk(dr);  
        System.out.println(dr.getDescription());
        System.out.println("Gia 1: "+dr.cost());  
         
        dr = new Mocha(dr);
        System.out.println(dr.getDescription());
        System.out.println("Gia 2: "+dr.cost()); 
        
         dr = new Milk(dr);
         System.out.println(dr.getDescription());
        System.out.println("Gia 3: "+dr.cost());
        
        
    }
    
}
