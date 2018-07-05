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
class NightSlash extends Move {

    public NightSlash() {
    }
    
    @Override
    public String toString() {
        return "Night Slash";
    }

    @Override
    public Type2 getType() {
        return new Dark();
    }
    
    @Override
    public boolean isPhysical()
    {
        return true;
    }
    
}
