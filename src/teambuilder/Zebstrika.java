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
public class Zebstrika extends Pokemon {
    private int choosedSet;
    private int maxSets = 2;
    
    public Zebstrika()
    {
        Random r = new Random();
        choosedSet = r.nextInt(2)+1;
    }
    
    @Override
    public String getName() {
        return "Zebstrika [With "+getAbility().toString()+"]";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Electric();
        else
            return new NoType2();
    }
    
    @Override
    public double getBase() {
        return 497;
    }
    
    @Override
    public Ability getAbility() {
        if(choosedSet == 1)
            return new SapSipper();
        else
            return new Lightingrod();
    }
}
