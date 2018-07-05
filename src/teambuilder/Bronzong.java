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
public class Bronzong extends Pokemon {
    private int choosenSet;
    private final int maxSets = 8;
    
    public Bronzong()
    {
        Random r = new Random();
        choosenSet = r.nextInt(maxSets)+1;
    }
    
    @Override
    public String getName() {
        return "Bronzong (With "+getAbility().toString()+")";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Steel();
        else
            return new PsychicType();
    }
    
    @Override
    public Ability getAbility()
    {
        if((choosenSet >= 1 && choosenSet <= 6) || choosenSet == 8)
            return new Levitate();
        else
            if(choosenSet == 7)
                return new Heatproof();
        else
            {
                Random r = new Random();
                int a = r.nextInt(2)+1;
                if(a == 1)
                    return new Levitate();
                else
                    return new Heatproof();
            }
    }
    
    @Override
    public double getTier() {
        Random r = new Random();
        if(r.nextBoolean())
            return 3;
        else
            return 6 + (4/12);
    }
    
    @Override
    public double getBase() {
        return 500;
    }
}
