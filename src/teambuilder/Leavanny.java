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
public class Leavanny extends Pokemon{
    @Override
    public String getName() {
        return "Leavanny";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Bug();
        else
            return new Grass();
    }
    
    @Override
    public double getBase() {
        return 500;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
}
