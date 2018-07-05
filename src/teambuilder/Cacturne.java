/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teambuilder;

/**
 *
 * @author Wout
 */
public class Cacturne extends Pokemon{
    @Override
    public String getName() {
        return "Cacturne";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Grass();
        else
            return new Dark();
    }
    
    @Override
    public double getBase() {
        return 475;
    }
    
    @Override
    public Ability getAbility() {
        return new WaterAbsorb();
    }
}
