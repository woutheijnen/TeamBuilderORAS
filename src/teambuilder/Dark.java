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
class Dark extends Type2 {

    public Dark() {
    }

    @Override
    public String toString() {
        return "Dark";
    }
    
    @Override
    public Type2 immuneTo(int n) {
        if(n == 1)
            return new PsychicType();
        else
            return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        if(n == 1)
            return new Dark();
        else
            if(n==2)
                return new Ghost();
        else
                return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return new Bug();
        else
            if(n == 2)
                return new Fighting();
        else
                if(n==3)
                    return new Fairy();
        else
                    return new NoType2();
    }
    
}
