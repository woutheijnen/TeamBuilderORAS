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
public class Wobbuffet extends Pokemon {
    @Override
    public String getName() {
        return "Wobbuffet";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new PsychicType();
        else
            return new NoType2();
    }
    
    @Override
    public double getBase() {
        return 405;
    }
    
    @Override
    public double getTier() {
        Random r = new Random();
        if(r.nextBoolean())
            return 2;
        else
            return 6 + (5/12);
    }
}
