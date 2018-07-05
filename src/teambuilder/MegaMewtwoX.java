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
public class MegaMewtwoX extends Pokemon{
    @Override
    public String getName() {
        return "Mega Mewtwo X";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new PsychicType();
        else
            return new Fighting();
    }
    
    @Override
    public double getTier() {
        return 6 + (5/12);
    }
    
    @Override
    public double getBase() {
        return 780;
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
    
    @Override
    public int getId()
    {
        return 150;
    }
}
