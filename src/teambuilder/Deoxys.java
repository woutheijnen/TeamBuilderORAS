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
public class Deoxys extends Pokemon {
    private int form;
    
    public Deoxys()
    {
        Random r = new Random();
        form = r.nextInt(4);
    }
    
    @Override
    public String getName() {
        String s = "";
        switch(form)
        {
            case 0: s = "Normal";
            case 1: s = "Attack";
            case 2: s = "Defense";
            case 3: s = "Speed";
            default: s = "Normal";
        }
        return "Deoxys "+form;
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new PsychicType();
        else
            return new NoType2();
    }
    
    @Override
    public double getTier() {
        switch(form)
        {
            case 0: return 6;
            case 1: return 6 + (7/12);
            case 2: return 6;
            case 3: return 6 + (8/12);
            default: return 6;
        }
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
