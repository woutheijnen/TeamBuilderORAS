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
class Fighting extends Type2 {

    public Fighting() {
    }

    @Override
    public String toString() {
        return "Fighting";
    }

    @Override
    public Type2 immuneTo(int n) {
        return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        if(n == 1)
            return new Bug();
        else
            if(n == 2)
                return new Dark();
        else
                if(n == 3)
                    return new Rock();
        else
                    return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return new Flying();
        else
            if(n == 2)
                return new PsychicType();
        else
                if(n==3)
                    return new Fairy();
        else
                    return new NoType2();
    }
    
}
