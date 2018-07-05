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
public class KyogrePrimal extends Pokemon {
    @Override
    public String getName() {
        return "Primal Kyogre";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Water();
        else
            return new NoType2();
    }
    
    @Override
    public double getTier() {
        return 6 + (7/12);
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
        return new PrimordialSea();
    }
    
    @Override
    public int getId() {
        return 382;
    }
}
