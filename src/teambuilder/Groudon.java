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
public class Groudon extends Pokemon{
    @Override
    public String getName() {
        return "Groudon";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ground();
        else
            return new NoType2();
    }
    
    @Override
    public double getTier() {
        return 6 + (3/12);
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
        return 383;
    }
}
