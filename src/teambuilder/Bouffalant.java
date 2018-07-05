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
public class Bouffalant extends Pokemon {
    @Override
    public String getName() {
        return "Bouffalant";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Normal();
        else
            return new NoType2();
    }
    
    @Override
    public double getBase() {
        return 490;
    }
    
    @Override
    public Ability getAbility()
    {
        return new SapSipper();
    }
}
