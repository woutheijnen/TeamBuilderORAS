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
public class Sableye extends Pokemon {
    @Override
    public String getName() {
        return "Sableye";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Dark();
        else
            return new Ghost();
    }
    
    @Override
    public double getTier() {
        return 5;
    }
    
    @Override
    public double getBase() {
        return 380;
    }
    
    @Override
    public int getId()
    {
        return 302;
    }
}
