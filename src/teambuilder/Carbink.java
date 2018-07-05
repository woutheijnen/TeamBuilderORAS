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
public class Carbink extends Pokemon{
    @Override
    public String getName() {
        return "Carbink";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Rock();
        else
            return new Fairy();
    }
    
    @Override
    public double getBase() {
        return 500;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
}
