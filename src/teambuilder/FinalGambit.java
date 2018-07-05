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
class FinalGambit extends Move {

    public FinalGambit() {
    }
    
    @Override
    public String toString() {
        return "Final Gambit";
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
