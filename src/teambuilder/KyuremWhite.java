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
public class KyuremWhite extends Pokemon{
    @Override
    public String getName() {
        return "Kyurem White";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ice();
        else
            return new Dragon();
    }
    
    @Override
    public double getTier() {
        return 6 + (3/12);
    }
    
    @Override
    public double getBase() {
        return 700;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
}
