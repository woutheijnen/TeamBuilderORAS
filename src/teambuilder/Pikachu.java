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
public class Pikachu extends Pokemon{
    @Override
    public String getName() {
        return "Pikachu";
    }

    @Override
    public Type2 getType(int n) {
        if(n==1)
            return new Electric();
        else
            return new NoType2();
    }
    
    @Override
    public double getBase() {
        return 320;
    }
    
    @Override
    public Ability getAbility() {
        return new Lightingrod();
    }
}
