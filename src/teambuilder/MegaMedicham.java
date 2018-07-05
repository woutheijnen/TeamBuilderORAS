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
public class MegaMedicham extends Pokemon{
    @Override
    public String getName() {
        return "Mega Medicham";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Fighting();
        else
            return new PsychicType();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getTier() {
        return 4.5;
    }
    
    @Override
    public double getBase() {
        return 510;
    }
    
    @Override
    public int getId()
    {
        return 308;
    }
}
