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
public class Froslass extends Pokemon{
    @Override
    public String getName() {
        return "Froslass";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ghost();
        else
            return new Ice();
    }
    
    @Override
    public double getTier() {
        return 3.5;
    }
    
    @Override
    public double getBase() {
        return 480;
    }
}
