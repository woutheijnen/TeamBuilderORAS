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
public class Kyogre extends Pokemon {
    @Override
    public String getName() {
        return "Kyogre";
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
        return 6;
    }
    
    @Override
    public double getBase() {
        return 670;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
    
    @Override
    public int getId() {
        return 382;
    }
}
