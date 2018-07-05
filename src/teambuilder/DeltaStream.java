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
public class DeltaStream extends Ability {

    @Override
    public String toString() {
        return "Delta Stream";
    }

    @Override
    public Double getModifier(Type2 type) {
        if(type.toString().equals(new Ice().toString()) || type.toString().equals(new Rock().toString()) || type.toString().equals(new Electric().toString()))
        {
            return 0.5;
        }
        else
        {
            return 1.0;
        }
    }
}
