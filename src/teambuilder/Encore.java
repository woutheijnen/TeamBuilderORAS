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
class Encore extends Move {

    public Encore() {
    }
    
    @Override
    public String toString() {
        return "Encore";
    }

    @Override
    public Type2 getType() {
        return new NoType2();
    }
    
    @Override
    public boolean isSupport()
    {
        return true;
    }
    
}
