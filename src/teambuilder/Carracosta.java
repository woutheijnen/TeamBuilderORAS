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
public class Carracosta extends Pokemon{
    @Override
    public String getName() {
        return "Carracosta";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Rock();
        else
            return new Water();
    }
    
    @Override
    public double getBase() {
        return 495;
    }
    
    @Override
    public Ability getAbility() {
        return new SolidRock(this);
    }
}
