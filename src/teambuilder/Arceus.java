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
public class Arceus extends Pokemon {
    private int plate;
    
    public Arceus()
    {
        Random r = new Random();
        plate = r.nextInt(18);
    }
    
    @Override
    public String getName() {
        String p = "";
        switch(plate)
        {
            case 1: p = "Bug";
                    break;
            case 2: p = "Dark";
                    break;
            case 3: p = "Dragon";
                    break;
            case 4: p = "Electric";
                    break;
            case 5: p = "Fairy";
                    break;
            case 6: p = "Fighting";
                    break;
            case 7: p = "Fire";
                    break;
            case 8: p = "Flying";
                    break;
            case 9: p = "Ghost";
                    break;
            case 10: p = "Grass";
                     break;
            case 11: p = "Ground";
                     break;
            case 12: p = "Ice";
                     break;
            case 13: p = "Poison";
                     break;
            case 14: p = "Psychic";
                     break;
            case 15: p = "Rock";
                     break;
            case 16: p = "Steel";
                     break;
            case 17: p = "Water";
                     break;
        }
        
        return "Arceus "+p;
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
        {
            switch(plate)
            {
                case 0: return new Normal();
                case 1: return new Bug();
                case 2: return new Dark();
                case 3: return new Dragon();
                case 4: return new Electric();
                case 5: return new Fairy();
                case 6: return new Fighting();
                case 7: return new Fire();
                case 8: return new Flying();
                case 9: return new Ghost();
                case 10: return new Grass();
                case 11: return new Ground();
                case 12: return new Ice();
                case 13: return new Poison();
                case 14: return new PsychicType();
                case 15: return new Rock();
                case 16: return new Steel();
                case 17: return new Water();
                default: return new Normal();
            }
        }
        else
            return new NoType2();
    }
    
    @Override
    public double getTier() {
        switch(plate)
            {
                case 0: return 6 + (10/12);
                case 1: return 6;
                case 2: return 6 + (4/12);
                case 3: return 6 + (4/12);
                case 4: return 6 + (2/12);
                case 5: return 6 + (3/12);
                case 6: return 6 + (2/12);
                case 7: return 6;
                case 8: return 6 + (1/12);
                case 9: return 6 + (8/12);
                case 10: return 6 + (2/12);
                case 11: return 6 + (8/12);
                case 12: return 6 + (3/12);
                case 13: return 6 + (2/12);
                case 14: return 6;
                case 15: return 6 + (7/12);
                case 16: return 6 + (1/12);
                case 17: return 6 + (9/12);
                default: return 6 + (10/12);
            }
    }
    
    @Override
    public double getBase() {
        return 720;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
    
    @Override
    public int getId()
    {
        return 493;
    }
}
