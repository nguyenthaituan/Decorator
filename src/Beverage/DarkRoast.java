/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beverage;

/**
 *
 * @author Admin
 */
public class DarkRoast extends Beverage{

    public DarkRoast(String description) {
        super(description);
    }
   
    
    @Override
    public float cost() {
        return 12000;
    }
    
}
