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
class GrassKnot extends Move {

    public GrassKnot() {
    }
    
    @Override
    public String toString() {
        return "Grass Knot";
    }

    @Override
    public Type2 getType() {
        return new Grass();
    }
    
    @Override
    public boolean isSpecial()
    {
        return true;
    }
}
