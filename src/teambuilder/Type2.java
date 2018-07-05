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
abstract class Type2 {
    public abstract String toString();
    public abstract Type2 immuneTo(int n);
    
    public abstract Type2 resists(int n);
    
    public abstract Type2 weakTo(int n);
}
