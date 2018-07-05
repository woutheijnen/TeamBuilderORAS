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
class Pursuit extends Move {

    public Pursuit() {
    }
    
    @Override
    public String toString() {
        return "Pursuit";
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
