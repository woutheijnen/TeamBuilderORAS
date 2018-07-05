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
class Steel extends Type2 {

    public Steel() {
    }

    @Override
    public String toString() {
        return "Steel";
    }

    @Override
    public Type2 immuneTo(int n) {
        if(n == 1)
            return  new Poison();
        else
            return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        if(n == 1)
            return  new Bug();
        else
            if(n == 2)
               return new Fairy();
        else
                if(n == 3)
                    return new Dragon();
        else
                    if(n == 4)
                        return new Flying();
        else
                            if(n == 5)
                                return new Grass();
        else
                                if(n == 6)
                                    return new Ice();
        else
                                    if(n == 7)
                                        return new Normal();
        else
                                        if(n == 8)
                                            return new PsychicType();
        else
                                            if(n == 9)
                                                return new Rock();
        else
                                                if(n == 10)
                                                    return new Steel();
        else
                                                    return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return  new Fighting();
        else
            if(n == 2)
                return new Fire();
        else
                if(n == 3)
                    return new Ground();
        else
                    return new NoType2();
    }
    
}
