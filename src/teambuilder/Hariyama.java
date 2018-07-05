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
public class Hariyama extends Pokemon{
    @Override
    public String getName() {
        return "Hariyama";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Fighting();
        else
            return new NoType2();
    }
    
    @Override
    public double getBase() {
        return 474;
    }
    
    @Override
    public Ability getAbility()
    {
        Random r = new Random();
        int a = r.nextInt(2)+1;
        if(a == 1)
            return new NoSpecialAbility();
        else
            return new ThickFat();
    }
}
