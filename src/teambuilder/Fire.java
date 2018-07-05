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
public class Fire extends Type2{

    @Override
    public String toString() {
        return "Fire";
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
                return new Fire();
        else
                if(n == 3)
                    return new Grass();
        else
                    if(n == 4)
                        return new Ice();
        else
                        if(n == 5)
                            return new Steel();
        else
                            if(n == 6)
                                return new Fairy();
        else
                                return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return new Ground();
        else
            if(n == 2)
                return new Rock();
        else
                if(n == 3)
                    return new Water();
        else
                    return new NoType2();
    }
}
