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
public class Surskit extends Pokemon{
    @Override
    public String getName() {
        return "Surskit ";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Bug();
        else
            return new Water();
    }
    
    @Override
    public double getBase() {
        return 269;
    }
    
    @Override
    public double getTier() {
        return 1;
    }
}
