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
public class MegaGlalie extends Pokemon{
    @Override
    public String getName() {
        return "Mega Glalie";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ice();
        else
            return new NoType2();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getTier() {
        return 3;
    }
    
    @Override
    public double getBase() {
        return 580;
    }
    
    @Override
    public int getId()
    {
        return 362;
    }
}
