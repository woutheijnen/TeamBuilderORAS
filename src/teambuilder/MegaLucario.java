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
public class MegaLucario extends Pokemon {
    @Override
    public String getName() {
        return "Mega Lucario";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Steel();
        else
            return new Fighting();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getTier() {
        return 6 + (5/12);
    }
    
    @Override
    public double getBase() {
        return 625;
    }
    
    @Override
    public int getId()
    {
        return 448;
    }
}
