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
public class WormadamSandy extends Pokemon{
    @Override
    public String getName() {
        return "Wormadam Sandy";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Bug();
        else
            return new Ground();
    }
    
    @Override
    public double getBase() {
        return 424;
    }
    
    @Override
    public int getId()
    {
        return 413;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
}
