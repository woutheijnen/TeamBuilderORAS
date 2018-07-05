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
public class MegaAerodactyl extends Pokemon {
    @Override
    public String getName() {
        return "Mega Aerodactyl";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Rock();
        else
            return new Flying();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getTier() {
        Random r = new Random();
        if(r.nextBoolean())
            return 4;
        else
            return 6 + (3/12);
    }
    
    @Override
    public double getBase() {
        return 615;
    }
    
    @Override
    public int getId()
    {
        return 142;
    }
}
