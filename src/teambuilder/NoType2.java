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
public class NoType2 extends Type2{

    @Override
    public String toString() {
        return "notype";
    }

    @Override
    public Type2 immuneTo(int n) {
        return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        return new NoType2();
    }
    
}
