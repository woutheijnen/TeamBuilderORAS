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
public class MegaBeedrill extends Pokemon{
    @Override
    public String getName() {
        return "Mega Beedrill";
    }

    @Override
    public Type2 getType(int n) {
        if(n==1)
            return new Bug();
        else
            return new Poison();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getTier() {
        return 4;
    }
    
    @Override
    public double getBase() {
        return 495;
    }
    
    @Override
    public int getId()
    {
        return 15;
    }
}
