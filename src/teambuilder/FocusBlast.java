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
class FocusBlast extends Move {

    public FocusBlast() {
    }
    
    @Override
    public String toString() {
        return "Focus Blast";
    }

    @Override
    public Type2 getType() {
        return new Fighting();
    }
    
    @Override
    public boolean isSpecial()
    {
        return true;
    }
    
}
