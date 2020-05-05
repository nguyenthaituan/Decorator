/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import Beverage.Beverage;

/**
 *
 * @author Admin
 */
public class Mocha extends CondimentDecorator
{

    public Mocha(Beverage component) {
        super(component);
    }
    
    @Override
    public String getDescription()
    {
        return component.getDescription()+ ", Mocha ";
    }

    @Override
    public float cost() 
    {
        return component.cost() + 5000;
    }
    
}
