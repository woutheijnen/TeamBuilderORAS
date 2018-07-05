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
public class Aurorus extends Pokemon {
    @Override
    public String getName() {
        return "Aurorus";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Rock();
        else
            return new Ice();
    }
    
    @Override
    public double getBase() {
        return 521;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
}