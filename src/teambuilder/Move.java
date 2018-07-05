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
public abstract class Move {
    public abstract String toString();
    
    public boolean isPhysical()
    {
        return false;
    }
    
    public boolean isSpecial()
    {
        return false;
    }
    
    public boolean isSupport()
    {
        return false;
    }
    
    public abstract Type2 getType();
}
