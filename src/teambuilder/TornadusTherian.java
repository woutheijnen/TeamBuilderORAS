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
public class TornadusTherian extends Pokemon{
    @Override
    public String getName() {
        return "Tornadus Therian";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Flying();
        else
            return new NoType2();
    }
    
    @Override
    public double getTier() {
        return 4.5;
    }
    
    @Override
    public double getBase() {
        return 580;
    }
    
    @Override
    public int getId()
    {
        return 641;
    }
}
