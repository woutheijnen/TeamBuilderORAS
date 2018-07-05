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
public class MegaLopunny extends Pokemon {
    @Override
    public String getName() {
        return "Mega Lopunny";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Normal();
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
        Random r = new Random();
        if(r.nextBoolean())
            return 5;
        else
            return 6 + (2/12);
    }
    
    @Override
    public double getBase() {
        return 580;
    }
    
    @Override
    public int getId()
    {
        return 428;
    }
    
    @Override
    public Ability getAbility() {
        return new Scrappy();
    }
}
