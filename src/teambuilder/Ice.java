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
public class Ice extends Type2{

    @Override
    public String toString() {
        return "Ice";
    }

    @Override
    public Type2 immuneTo(int n) {
        return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        if(n == 1)
            return  new Ice();
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
                    return new Rock();
        else
                    if(n == 4)
                        return new Steel();
        else
                        return new NoType2();
    }
}
