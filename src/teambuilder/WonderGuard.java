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
public class WonderGuard extends Ability{
    private Pokemon pok;
    
    public WonderGuard(Pokemon p)
    {
        pok = p;
    }
    
    @Override
    public String toString() {
        return "Wonder Guard";
    }

    @Override
    public Double getModifier(Type2 t) {
        double sum = 1;
        for(int i=0; i<12; i++)
        {
            if(pok.getType(1).immuneTo(i).toString().equals(t.toString()))
                sum *= 0;
            if(pok.getType(1).resists(i).toString().equals(t.toString()))
                sum *= 0.5;
            if(pok.getType(1).weakTo(i).toString().equals(t.toString()))
                sum *= 2;
            if(pok.getType(2).immuneTo(i).toString().equals(t.toString()))
                sum *= 0;
            if(pok.getType(2).resists(i).toString().equals(t.toString()))
                sum *= 0.5;
            if(pok.getType(2).weakTo(i).toString().equals(t.toString()))
                sum *= 2;
        }
        
        if(sum >= 2.0)
        {
            return 1.0;
        }
        else
        {
            return 1.0;
        }
    }
}
