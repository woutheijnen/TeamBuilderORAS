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
public class Bug extends Type2{

    @Override
    public String toString() {
        return "Bug";
    }
    
    @Override
    public Type2 immuneTo(int n) {
        return new NoType2();
    }

    @Override
    public Type2 resists(int n) {
        if(n == 1)
            return new Fighting();
        else
            if(n == 2)
                return new Grass();
        else
                if(n == 3)
                    return new Ground();
        else
                    return new NoType2();
    }

    @Override
    public Type2 weakTo(int n) {
        if(n == 1)
            return new Fire();
        else
            if(n == 2)
                return new Flying();
        else
                if(n == 3)
                    return new Rock();
        else
                    return new NoType2();
    }
}
