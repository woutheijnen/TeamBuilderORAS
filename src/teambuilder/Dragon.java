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
class Dragon extends Type2 {

    public Dragon() {
    }

    @Override
    public String toString() {
        return "Dragon";
    }
    
    @Override
    public Type2 immuneTo(int n) {
        return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        if(n == 1)
            return new Electric();
        else
            if(n == 2)
                return new Fire();
        else
                if(n == 3)
                    return new Grass();
        else
                    if(n == 4)
                        return new Water();
        else
                        return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return new Dragon();
        else
            if(n == 2)
                return new Ice();
        else
                if(n==3)
                    return new Fairy();
        else
                    return new NoType2();
    }
    
}
