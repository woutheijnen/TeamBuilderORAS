/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teambuilder;

import java.util.Random;

/**
 *
 * @author Wout
 */
public class RandomGenerator {
    public int getRandom(int min, int max)
    {
        Random rand = new Random();
        return rand.nextInt(max-min+1)+min;
    }
}
