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
public class ThickFat extends Ability{
    @Override
    public String toString() {
        return "Thick Fat";
    }

    @Override
    public Double getModifier(Type2 type) {
        if(type.toString().equals(new Ice().toString()) || type.toString().equals(new Fire().toString()))
            return 0.5;
        else
            return 1.0;
    }
}
