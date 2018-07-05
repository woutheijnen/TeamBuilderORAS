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
public class Camerupt extends Pokemon{
    @Override
    public String getName() {
        return "Camerupt";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Fire();
        else
            return new Ground();
    }
    
    @Override
    public double getBase() {
        return 460;
    }
    
    @Override
    public int getId()
    {
        return 323;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
    
    @Override
    public Ability getAbility() {
        return new SolidRock(this);
    }
}
