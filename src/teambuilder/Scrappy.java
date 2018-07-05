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
public class Scrappy extends Ability{
    @Override
    public String toString() {
        return "Scrappy";
    }

    @Override
    public Double getModifier(Type2 type) {
        return 1.0;
    }
}
