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
public class GroudonPrimal extends Pokemon{
    @Override
    public String getName() {
        return "Primal Groudon";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ground();
        else
            return new Fire();
    }
    
    @Override
    public double getTier() {
        return 6 + (11/12);
    }
    
    @Override
    public double getBase() {
        return 770;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
    
    @Override
    public Ability getAbility()
    {
        return new DesolateLand();
    }
    
    @Override
    public int getId() {
        return 383;
    }
}
