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
public class PrimordialSea extends Ability{
    @Override
    public String toString() {
        return "Primorial Sea";
    }

    @Override
    public Double getModifier(Type2 type) {
        if(type.toString().equals(new Fire().toString()))
            return 1.0/6.0;
        else
            return 1.0;
    }
}
