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
public class Zekrom extends Pokemon {
    @Override
    public String getName() {
        return "Zekrom";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Electric();
        else
            return new Dragon();
    }
    
    @Override
    public double getTier() {
        return 6 + (5/12);
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
