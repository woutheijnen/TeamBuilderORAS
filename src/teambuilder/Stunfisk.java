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
public class Stunfisk extends Pokemon{
    @Override
    public String getName() {
        return "Stunfisk";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ground();
        else
            return new Electric();
    }
    
    @Override
    public double getBase() {
        return 471;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
}
