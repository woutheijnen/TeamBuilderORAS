/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teambuilder;

import javax.lang.model.type.NoType;

/**
 *
 * @author Wout
 */
class Rock extends Type2 {

    public Rock() {
    }

    @Override
    public String toString() {
        return "Rock";
    }

    public Type2 immuneTo(int n) {
        return new NoType2();
    }

    public Type2 resists(int n) {
        if(n == 1)
            return new Fire();
        else
            if(n == 2)
                return new Flying();
        else
                if(n == 3)
                    return new Normal();
        else
                    if(n == 4)
                        return new Poison();
        else
                        return new NoType2();
    }

    public Type2 weakTo(int n) {
        if(n == 1)
            return new Fighting();
        else
            if(n == 2)
                return new Grass();
        else
                if(n == 3)
                    return new Ground();
        else
                    if(n == 4)
                        return new Steel();
        else
                        if(n == 5)
                            return new Water();
        else
                            return new NoType2();
    }
}
