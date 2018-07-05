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
public abstract class Ability {
    public abstract String toString();
    
    public abstract Double getModifier(Type2 type);
}
