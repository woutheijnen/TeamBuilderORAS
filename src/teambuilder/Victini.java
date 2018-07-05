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
public class Victini extends Pokemon{
    @Override
    public String getName() {
        return "Victini";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new PsychicType();
        else
            return new Fire();
    }
    
    @Override
    public double getTier() {
        return 4.5;
    }
    
    @Override
    public double getBase() {
        return 600;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
}
