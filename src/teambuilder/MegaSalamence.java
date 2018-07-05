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
public class MegaSalamence extends Pokemon{
    @Override
    public String getName() {
        return "Mega Salamence";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Dragon();
        else
            return new Flying();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getTier() {
        return 6 + (10/12);
    }
    
    @Override
    public double getBase() {
        return 700;
    }
    
    @Override
    public int getId()
    {
        return 373;
    }
}
