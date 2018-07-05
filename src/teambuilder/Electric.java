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
class Electric extends Type2 {

    public Electric() {
    }

    @Override
    public String toString() {
        return "Electric";
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
                return new Flying();
        else
                if(n == 3)
                    return new Steel();
        else
                    return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return new Ground();
        else
            return new NoType2();
    }
    
}
