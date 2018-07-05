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
class Ground extends Type2 {

    public Ground() {
    }

    @Override
    public String toString() {
        return "Ground";
    }

    @Override
    public Type2 immuneTo(int n) {
        if(n == 1)
            return  new Electric();
        else
            return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        if(n == 1)
            return  new Poison();
        else
            if(n == 2)
                return new Rock();
        else
                return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return  new Grass();
        else
            if(n == 2)
                return new Ice();
        else
                if(n == 3)
                    return new Water();
        else
                    return new NoType2();
    }
    
}
