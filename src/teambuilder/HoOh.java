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
public class HoOh extends Pokemon {
    @Override
    public String getName() {
        return "Ho-Oh";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Fire();
        else
            return new Flying();
    }
    
    @Override
    public double getTier() {
        return 6 + (10/12);
    }
    
    @Override
    public double getBase() {
        return 680;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
}
