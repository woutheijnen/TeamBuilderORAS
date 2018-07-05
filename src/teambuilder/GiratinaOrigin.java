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
public class GiratinaOrigin extends Pokemon{
    @Override
    public String getName() {
        return "Giratina Origin";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Dragon();
        else
            return new Ghost();
    }
    
    @Override
    public double getTier() {
        return 6 + (6/12);
    }
    
    @Override
    public double getBase() {
        return 680;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
    
    @Override
    public Ability getAbility() {
        return new Levitate();
    }
}
