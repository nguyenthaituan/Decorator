
package decorator;

import Beverage.Beverage;


public abstract class CondimentDecorator extends Beverage{
    
    Beverage component;

    public CondimentDecorator() {
    }

    public CondimentDecorator(Beverage component) {
        this.component = component;
    }
    
   @Override
    public String getDescription(){
        return component.getDescription() + this.getDescription();
    }
}
