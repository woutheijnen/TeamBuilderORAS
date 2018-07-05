/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teambuilder;

import java.util.Random;

/**
 *
 * @author Wout
 */
public class Jirachi extends Pokemon {
    @Override
    public String getName() {
        return "Jirachi";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new PsychicType();
        else
            return new Steel();
    }
    
    @Override
    public double getTier() {
        Random r = new Random();
        if(r.nextBoolean())
            return 5;
        else
            return 6 + (4/12);
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
