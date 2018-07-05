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
public class Dodrio extends Pokemon{
    @Override
    public String getName() {
        return "Dodrio";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Normal();
        else
            return new Flying();
    }
    
    @Override
    public double getBase() {
        return 460;
    }
}
