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
public class Lumineon extends Pokemon{
    @Override
    public String getName() {
        return "Lumineon";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Water();
        else
            return new NoType2();
    }
    
    @Override
    public double getBase() {
        return 460;
    }
    
    @Override
    public Ability getAbility() {
        Random r = new Random();
        if((r.nextInt(2)+1) == 1)
            return new StormDrain();
        else
            return new NoSpecialAbility();
    }
}
