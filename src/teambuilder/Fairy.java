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
public class Fairy extends Type2{

    @Override
    public String toString() {
        return "Fairy";
    }

    @Override
    public Type2 immuneTo(int n) {
        if(n==1)
            return new Dragon();
        else
            return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        if(n==1)
            return new Fighting();
        else
            if(n==2)
                return new Bug();
        else
                if(n==3)
                    return new Dark();
        else
                    return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n==1)
            return new Poison();
        else
            if(n==2)
                return new Steel();
        else
                return new NoType2();
    }
    
}
