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
public class MegaGengar extends Pokemon {
    @Override
    public String getName() {
        return "Mega Gengar";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ghost();
        else
            return new Poison();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getTier() {
        return 6 + (9/12);
    }
    
    @Override
    public double getBase() {
        return 600;
    }
    
    @Override
    public int getId()
    {
        return 94;
    }
}
