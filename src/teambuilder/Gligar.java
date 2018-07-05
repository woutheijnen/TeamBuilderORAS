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
public class Gligar extends Pokemon{
    @Override
    public String getName() {
        return "Gligar";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ground();
        else
            return new Flying();
    }
    
    @Override
    public double getTier() {
        return 4;
    }
    
    @Override
    public double getBase() {
        return 430;
    }
}
