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
class IceBeam extends Move {

    public IceBeam() {
    }
    
    @Override
    public String toString() {
        return "Ice Beam";
    }

    @Override
    public Type2 getType() {
        return new Ice();
    }
    
    @Override
    public boolean isSpecial()
    {
        return true;
    }
    
}
