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
class Superpower extends Move {

    public Superpower() {
    }
    
    @Override
    public String toString() {
        return "Superpower";
    }

    @Override
    public Type2 getType() {
        return new Fighting();
    }
    
    @Override
    public boolean isPhysical()
    {
        return true;
    }
    
}
