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
public class IceShard extends Move {
    @Override
    public String toString() {
        return "Ice Shard";
    }

    @Override
    public Type2 getType() {
        return new Ice();
    }
    
    @Override
    public boolean isPhysical()
    {
        return true;
    }
}
