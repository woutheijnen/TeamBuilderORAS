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
public class Malamar extends Pokemon{
    @Override
    public String getName() {
        return "Malamar";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Dark();
        else
            return new PsychicType();
    }
    
    @Override
    public double getBase() {
        return 482;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
}
