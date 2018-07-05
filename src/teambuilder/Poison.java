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
class Poison extends Type2 {

    public Poison() {
    }

    @Override
    public String toString() {
        return "Poison";
    }

    @Override
    public Type2 immuneTo(int n) {
        return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        if(n == 1)
            return  new Bug();
        else
            if(n == 2)
                return new Fighting();
        else
                if(n == 3)
                    return new Grass();
        else
                    if(n == 4)
                        return new Poison();
        else
                        if(n==5)
                            return new Fairy();
        else
                            return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return  new Ground();
        else
            if(n == 2)
                return new PsychicType();
        else
                return new NoType2();
    }
    
}
