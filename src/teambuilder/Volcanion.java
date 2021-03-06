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
public class Volcanion extends Pokemon {
    @Override
    public String getName() {
        return "Volcanion (Unreleased)";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Fire();
        else
            return new Water();
    }
    
    @Override
    public double getTier() {
        return 0;
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
    
    @Override
    public Ability getAbility()
    {
        return new WaterAbsorb();
    }
}
