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
class Blizzard extends Move {

    public Blizzard() {
    }

    @Override
    public String toString() {
        return "Blizzard";
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
