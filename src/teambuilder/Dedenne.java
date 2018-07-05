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
public class Dedenne extends Pokemon{
    @Override
    public String getName() {
        return "Dedenne";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Electric();
        else
            return new Fairy();
    }
    
    @Override
    public double getBase() {
        return 431;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
}
