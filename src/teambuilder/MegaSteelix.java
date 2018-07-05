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
public class MegaSteelix extends Pokemon {
    @Override
    public String getName() {
        return "Mega Steelix";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Steel();
        else
            return new Ground();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getBase() {
        return 610;
    }
    
    @Override
    public int getId()
    {
        return 208;
    }
}
