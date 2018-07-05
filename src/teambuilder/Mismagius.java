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
public class Mismagius extends Pokemon{
    @Override
    public String getName() {
        return "Mismagius";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ghost();
        else
            return new NoType2();
    }
    
    @Override
    public double getBase() {
        return 495;
    }
    
    @Override
    public Ability getAbility() {
        return new Levitate();
    }
}
