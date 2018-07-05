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
class BugBuzz extends Move {

    public BugBuzz() {
    }
    
    @Override
    public String toString() {
        return "Bug Buzz";
    }

    @Override
    public Type2 getType() {
        return new Bug();
    }
    
    @Override
    public boolean isSpecial()
    {
        return true;
    }
    
}
