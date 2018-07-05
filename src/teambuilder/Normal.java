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
class Normal extends Type2 {

    public Normal() {
    }

    @Override
    public String toString() {
        return "Normal";
    }

    @Override
    public Type2 immuneTo(int n) {
        if(n == 1)
            return  new Ghost();
        else
            return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return  new Fighting();
        else
            return new NoType2();
    }
    
}
