/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teambuilder;

/**
 *
 * @author Wout
 */
public class Jynx extends Pokemon{
    @Override
    public String getName() {
        return "Jynx";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ice();
        else
            return new PsychicType();
    }
    
    @Override
    public double getBase() {
        return 455;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
    
    @Override
    public Ability getAbility()
    {
        return new DrySkin();
    }
}
