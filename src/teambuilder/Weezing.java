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
public class Weezing extends Pokemon{
    @Override
    public String getName() {
        return "Weezing";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Poison();
        else
            return new NoType2();
    }
    
    @Override
    public Ability getAbility() {
        return new Levitate();
    }
    
    @Override
    public double getBase() {
        return 490;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
}
