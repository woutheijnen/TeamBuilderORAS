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
class SuckerPunch extends Move {

    public SuckerPunch() {
    }
    
    @Override
    public String toString() {
        return "Sucker Punch";
    }

    @Override
    public Type2 getType() {
        return new Dark();
    }
    
    @Override
    public boolean isPhysical()
    {
        return true;
    }
}
