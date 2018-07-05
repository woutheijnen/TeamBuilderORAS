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
public class Blaziken extends Pokemon{
    @Override
    public String getName() {
        return "Blaziken";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Fire();
        else
            return new Fighting();
    }
    
    @Override
    public double getTier() {
        return 6 + (3/12);
    }
    
    @Override
    public double getBase() {
        return 530;
    }
    
    @Override
    public int getId()
    {
        return 257;
    }
}
