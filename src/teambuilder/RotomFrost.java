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
public class RotomFrost extends Pokemon{
    @Override
    public String getName() {
        return "Rotom Frost";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Electric();
        else
            return new Ice();
    }
    
    @Override
    public Ability getAbility() {
        return new Levitate();
    }
    
    @Override
    public double getBase() {
        return 520;
    }
    
    @Override
    public int getId()
    {
        return 479;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
}
