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
class FireBlast extends Move {

    public FireBlast() {
    }
    
    @Override
    public String toString() {
        return "Fire Blast";
    }

    @Override
    public Type2 getType() {
        return new Fire();
    }
    
    @Override
    public boolean isSpecial()
    {
        return true;
    }
    
}
