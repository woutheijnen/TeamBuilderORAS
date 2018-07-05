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
public class Swellow extends Pokemon {@Override
    public String getName() {
        return "Swellow";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Normal();
        else
            return new Flying();
    }
    
    @Override
    public double getBase() {
        return 430;
    }
    
    @Override
    public Ability getAbility() {
        return new Scrappy();
    }
}
