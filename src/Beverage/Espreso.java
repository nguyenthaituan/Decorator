/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beverage;


public class Espreso extends Beverage{

    public Espreso(String description) {
        super(description);
    }

    @Override
    public float cost() {
        return 5000;
    }
    
}
