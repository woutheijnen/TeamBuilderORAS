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
public class Rayquaza extends Pokemon {
@Override
    public String getName() {
        return "Rayquaza";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Dragon();
        else
            return new Flying();
    }
    
    @Override
    public double getTier() {
        return 6 + (7/12);
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
    
    @Override
    public int getId()
    {
        return 384;
    }
}
