/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teambuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Wout
 */
public class Simulation  {
    private final int nbPokes = 501;
    
    private double[] defScore2 = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScore3 = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScore4 = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScore6 = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScore3w = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScoreAG = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScore4w = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScoreUb = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScoreOU = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScoreUU = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScoreRU = {0,0,0,0,0,0,0,0,0,0};
    private double[] defScoreNU = {0,0,0,0,0,0,0,0,0,0};
    
    private int partner;
    private int partySize = 6;
    ArrayList<Integer>blackListModes = new ArrayList<>();
    
    private Boolean hasMega = false;
    private Boolean allowBanned = false;    
    Type2[] types = {new Normal(), new Fighting(), new Flying(), new Poison(), new Ground(), new Rock(), new Bug(), new Ghost(), new Steel(), new Fire(), new Water(), new Grass(), new Electric(), new PsychicType(), new Ice(), new Dragon(), new Dark(), new Fairy()};
    
    ArrayList<Integer> uberIds = new ArrayList<>();
    ArrayList<Integer> ouIds = new ArrayList<>();
    ArrayList<Integer> uuIds = new ArrayList<>();
    ArrayList<Integer> ruIds = new ArrayList<>();
    ArrayList<Integer> nuIds = new ArrayList<>();
    ArrayList<Integer> uberIdsUb = new ArrayList<>();
    ArrayList<Integer> ouIdsUb = new ArrayList<>();
    ArrayList<Integer> uuIdsUb = new ArrayList<>();
    ArrayList<Integer> ruIdsUb = new ArrayList<>();
    ArrayList<Integer> nuIdsUb = new ArrayList<>();
    
    @SuppressWarnings("UnusedAssignment")
    public void start()
    {
        //Blacklisting modes
        /*blackListModes.add(4);
        blackListModes.add(5);
        blackListModes.add(7);*/
        
        System.out.println("Now searching for new and better Pokémon teams for Gen VI (ORAS) - Auto mode.");
        System.out.println("=========");
        System.out.println("Trying to load saved scores...");
        loadScores(true);
        System.out.println();
        System.out.println("Search started!");
        System.out.println();
        ArrayList<Pokemon> partyTemp = new ArrayList<>();
        Random ran = new Random();
        int mode, g=0;
        double[] defScore = {0,0,0,0,0,0,0,0,0,0};
        long nextTime = System.nanoTime();
        
        //Creating lists for faster generation of good teams
        for(int i=1; i<=nbPokes; i++)
        {
            Pokemon temp = Id2Pokemon(i);
            if(temp.isBanned())
            {
                if(temp.getTier() >= 6 && temp.getTier() < 7)
                    uberIds.add(i);
                if(temp.getTier() == 5 || temp.getTier() == 4.5)
                    ouIds.add(i);
                if(temp.getTier() == 4 || temp.getTier() == 3.5)
                    uuIds.add(i);
                if(temp.getTier() == 3 || temp.getTier() == 2.5)
                    ruIds.add(i);
                if(temp.getTier() == 2 || temp.getTier() == 1.5 || temp.getTier() == 1)
                    nuIds.add(i);
            }
            else
            {
                if(temp.getTier() >= 6 && temp.getTier() < 7)
                {
                    uberIds.add(i);
                    uberIdsUb.add(i);
                }
                if(temp.getTier() == 5 || temp.getTier() == 4.5)
                {
                    ouIds.add(i);
                    ouIdsUb.add(i);
                }
                if(temp.getTier() == 4 || temp.getTier() == 3.5)
                {
                    uuIds.add(i);
                    uuIdsUb.add(i);
                }
                if(temp.getTier() == 3 || temp.getTier() == 2.5)
                {
                    ruIds.add(i);
                    ruIdsUb.add(i);
                }
                if(temp.getTier() == 2 || temp.getTier() == 1.5 || temp.getTier() == 1)
                {
                    nuIds.add(i);
                    nuIdsUb.add(i);
                }
            }
        }
                                
        do{
            do{
                mode = ran.nextInt(12)+1;
            }while(blackListModes.contains(mode));
            
            switch(mode){
                case 1: partySize = 6;
                        allowBanned = true;
                        defScore = defScoreAG;
                        break;
                case 2: partySize = 4;
                        allowBanned = true;
                        defScore = defScore4w;
                        break;
                case 3: partySize = 6;
                        allowBanned = false;
                        defScore = defScore6;
                        break;
                case 4: partySize = 4;
                        allowBanned = false;
                        defScore = defScore2;
                        break;
                case 5: partySize = 3;
                        allowBanned = false;
                        defScore = defScore3;
                        break;
                case 6: partySize = 4;
                        allowBanned = false;
                        defScore = defScore4;
                        break;
                case 7: partySize = 3;
                        allowBanned = true;
                        defScore = defScore3w;
                        break;
                case 8: partySize = 6;
                        allowBanned = true;
                        defScore = defScoreUb;
                        break;
                case 9: partySize = 6;
                        allowBanned = true;
                        defScore = defScoreOU;
                        break;
                case 10: partySize = 6;
                        allowBanned = true;
                        defScore = defScoreUU;
                        break;
                case 11: partySize = 6;
                        allowBanned = true;
                        defScore = defScoreRU;
                        break;
                case 12: partySize = 6;
                        allowBanned = true;
                        defScore = defScoreNU;
                        break;
            }
            
            Pokemon temp;
            Boolean megaTemp = false;
            
            if(mode != 4)
            {
                do{
                    if(mode == 1 && ran.nextInt(7) > 0)
                            temp = Id2Pokemon(236);
                    else
                    {
                        if(mode == 1 || mode == 3 || mode > 7 )
                            temp = Id2Pokemon(weightedRandom(mode));
                        else
                            temp = Id2Pokemon(ran.nextInt(nbPokes)+1);
                    }
                }while(partyTemp.contains(temp));
                partyTemp.add(temp);
                megaTemp = temp.isMega();
            }
            else
            {
                partner = ran.nextInt(4)+1;
                switch(partner){
                    case 1: partyTemp.add(new Magnezone());
                            partyTemp.add(new MegaGallade());
                            break;
                    case 2: partyTemp.add(new Aerodactyl());
                            partyTemp.add(new MegaMetagross());
                            break;
                    case 3: partyTemp.add(new Claydol());
                            partyTemp.add(new Exploud());
                            break;
                    case 4: partyTemp.add(new Crobat());
                            partyTemp.add(new MegaCamerupt());
                            break;
                }
            }

            for(int i = partyTemp.size(); i<= partySize; i++)
            {
                do{
                    if(mode == 1 || mode == 3 || mode > 7)
                        temp = Id2Pokemon(weightedRandom(mode));
                    else
                        temp = Id2Pokemon(ran.nextInt(nbPokes)+1);
                }while(partyTemp.contains(temp));
                
                if((temp.isMega() && megaTemp && mode!= 4) || (temp.isBanned() && !allowBanned))
                {
                    do
                    {
                        do{
                            if(mode == 1 || mode == 3 || mode > 7)
                                temp = Id2Pokemon(weightedRandom(mode));
                            else
                                temp = Id2Pokemon(ran.nextInt(nbPokes)+1);
                        }while(partyTemp.contains(temp));
                    }while((temp.isMega() && megaTemp) || (temp.isBanned() && !allowBanned));
                    partyTemp.add(temp);
                }
                else
                {
                    partyTemp.add(temp);
                    if(temp.isMega())
                        megaTemp = true;
                }
            }
            
            if(isValid(partyTemp, mode))
            {
                double tierScore = calcPartyTierScore(partyTemp, mode);
                double ndefScore = calcPartyDefScore(partyTemp);
                double baseScore = calcPartyBaseScore(partyTemp, mode);
                double newScore = tierScore /ndefScore * baseScore;
                String pText = "Unknown";
                switch(mode){
                    case 1: pText = "[WiFi(Free) & Smogon] Triple - Anything Goes";
                            break;
                    case 2: pText = "[WiFi(Free)] Double";
                            break;
                    case 3: pText = "[Maison & WiFi(Rated)] Triple";
                            break;
                    case 4: pText = "[Maison] Multi";
                            break;
                    case 5: pText = "[Maison & WiFi(Rated)] Single";
                            break;
                    case 6: pText = "[Maison & WiFi(Rated) & VGC] Double";
                            break;
                    case 7: pText = "[WiFi(Free)] Single";
                            break;
                    case 8: pText = "[Smogon] Uber";
                            break;
                    case 9: pText = "[Smogon] Over-Used";
                            break;
                    case 10: pText = "[Smogon] Under-Used";
                            break;
                    case 11: pText = "[Smogon] Rarely-Used";
                            break;
                    case 12: pText = "[Smogon] Never-Used";
                            break;
                    }
                
                pText += " ["+mode+"]";
                boolean saved = false;
                
                for(int o=0; o<defScore2.length; o++)
                {
                    if((newScore > defScore[o]  && (defScore[0] != newScore && defScore[1] != newScore && defScore[2] != newScore && defScore[3] != newScore && defScore[4] != newScore && defScore[5] != newScore && defScore[6] != newScore && defScore[7] != newScore && defScore[8] != newScore)) && !saved && defScore[9] != newScore)
                    {
                        loadScores(false);
                        if((newScore > defScore[o]  && (defScore[0] != newScore && defScore[1] != newScore && defScore[2] != newScore && defScore[3] != newScore && defScore[4] != newScore && defScore[5] != newScore && defScore[6] != newScore && defScore[7] != newScore && defScore[8] != newScore)) && !saved && defScore[9] != newScore)
                        {
                            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss - dd/MM/yyyy");
                            Date date = new Date();

                            String data = "========="+"\nTeam type: "+pText+"\nTeam number: "+(o+1)+"\n";
                            for(int i=0; i<partySize; i++)
                                data += "\n"+partyTemp.get(i).getName();
                            data += "\n\nTier score: "+tierScore+"\nDefending score: "+ndefScore+"\nBase score: "+baseScore+"\nEnd score: "+newScore+" (+"+(newScore-defScore[o])+")"+"\nTimestamp: "+dateFormat.format(date)+"\n=========\n\n";

                            System.out.println(data);

                            String path = "Teams";
                            path += '\\'+pText;
                            boolean succes = false;

                            do{
                                try {
                                    File file = new File(path);
                                    if (!file.exists()) {
                                        file.mkdirs();
                                    }

                                    path += "\\"+(o+1)+".txt";

                                    file = new File(path);
                                    if (!file.exists()) {
                                        file.createNewFile();
                                    }
                                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                                    try (BufferedWriter bw = new BufferedWriter(fw)) {
                                        String[] words = data.split("\n");
                                        for (String word: words) {
                                            bw.write(word);
                                            bw.newLine();
                                        }
                                    }
                                    succes = true;
                                } catch (IOException ex) {
                                    succes = false;
                                }
                            }while(!succes);

                            saveNewScores(newScore, mode, o);
                            saved = true;
                        }
                    }
                }
            }
            partyTemp.clear();
            hasMega = false;
        }while(true);
    }
    
    private int weightedRandom(int mode)
    {
        Random ran = new Random();
        if(mode == 1 || mode == 8)
        {
            int w = ran.nextInt(20)+1;
            if(w <= 6)
                return uberIds.get(ran.nextInt(uberIds.size()));
            else
                if(w <= 11)
                    return ouIds.get(ran.nextInt(ouIds.size()));
            else
                    if(w <= 15)
                        return uuIds.get(ran.nextInt(uuIds.size()));
            else
                        if(w <= 18)
                            return ruIds.get(ran.nextInt(ruIds.size()));
            else
                            return nuIds.get(ran.nextInt(nuIds.size()));
        }
        else
            if(mode == 9)
            {
                int w = ran.nextInt(14)+1;
                if(w <= 5)
                    return ouIds.get(ran.nextInt(ouIds.size()));
                else
                    if(w <= 9)
                        return uuIds.get(ran.nextInt(uuIds.size()));
                else
                        if(w <= 12)
                            return ruIds.get(ran.nextInt(ruIds.size()));
                else
                            return nuIds.get(ran.nextInt(nuIds.size()));
            }
        else
                if(mode == 10)
                {
                    int w = ran.nextInt(9)+1;
                    if(w <= 4)
                        return uuIds.get(ran.nextInt(uuIds.size()));
                    else
                        if(w <= 7)
                            return ruIds.get(ran.nextInt(ruIds.size()));
                    else
                            return nuIds.get(ran.nextInt(nuIds.size()));
                }
        else
                    if(mode == 11)
                    {
                        int w = ran.nextInt(5)+1;
                        if(w <= 3)
                            return ruIds.get(ran.nextInt(ruIds.size()));
                        else
                            return nuIds.get(ran.nextInt(nuIds.size()));
                    }
        else
                        if(mode == 12)
                            return nuIds.get(ran.nextInt(nuIds.size()));
        else
                        {
                            int w = ran.nextInt(20)+1;
                            if(w <= 6)
                                return uberIdsUb.get(ran.nextInt(uberIdsUb.size()));
                            else
                                if(w <= 11)
                                    return ouIdsUb.get(ran.nextInt(ouIdsUb.size()));
                            else
                                    if(w <= 15)
                                        return uuIdsUb.get(ran.nextInt(uuIdsUb.size()));
                            else
                                        if(w <= 18)
                                            return ruIdsUb.get(ran.nextInt(ruIdsUb.size()));
                            else
                                            return nuIdsUb.get(ran.nextInt(nuIdsUb.size()));
                        }
    }
    
    private void saveNewScores(double newScore, int mode, int n)
    {
        switch(mode){
            case 1: defScoreAG[n] = newScore;
                    break;
            case 2: defScore4w[n] = newScore;
                    break;
            case 3: defScore6[n] = newScore;
                    break;
            case 4: defScore2[n] = newScore;
                    break;
            case 5: defScore3[n] = newScore;
                    break;
            case 6: defScore4[n] = newScore;
                    break;
            case 7: defScore3w[n] = newScore;
                    break;
            case 8: defScoreUb[n] = newScore;
                    break;
            case 9: defScoreOU[n] = newScore;
                    break;
            case 10: defScoreUU[n] = newScore;
                    break;
            case 11: defScoreRU[n] = newScore;
                    break;
            case 12: defScoreNU[n] = newScore;
                    break;
            }
        
            boolean succes = false;
            do{
            try {
                String path = "Saved";
                File file = new File(path);
                if (!file.exists()) {
                    file.mkdirs();
                }
                 
                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path+"\\"+mode+".ser"))) {
                    switch(mode){
                        case 1: out.writeObject(defScoreAG);
                        break;
                        case 2: out.writeObject(defScore4w);
                        break;
                        case 3: out.writeObject(defScore6);
                        break;
                        case 4: out.writeObject(defScore2);
                        break;
                        case 5: out.writeObject(defScore3);
                        break;
                        case 6: out.writeObject(defScore4);
                        break;
                        case 7: out.writeObject(defScore3w);
                        break;
                        case 8: out.writeObject(defScoreUb);
                        break;
                        case 9: out.writeObject(defScoreOU);
                        break;
                        case 10: out.writeObject(defScoreUU);
                        break;
                        case 11: out.writeObject(defScoreRU);
                        break;
                        case 12: out.writeObject(defScoreNU);
                        break;
                    }
                    out.flush();
                    succes = true;
                }
                } catch (IOException ex) {
                    succes = false;
                }
            }while(!succes);
    }
    
    private void loadScores(boolean showMsg)
    {
        for(int i=1; i<=12; i++)
        {
            ObjectInputStream in;
            try {
                in = new ObjectInputStream(new FileInputStream("Saved\\"+i+".ser"));
                switch(i)
                {
                    case 1: defScoreAG = (double[]) in.readObject();
                            break;
                    case 2: defScore4w = (double[]) in.readObject();
                            break;
                    case 3: defScore6 = (double[]) in.readObject();
                            break;
                    case 4: defScore2 = (double[]) in.readObject();
                            break;
                    case 5: defScore3 = (double[]) in.readObject();
                            break;
                    case 6: defScore4 = (double[]) in.readObject();
                            break;
                    case 7: defScore3w = (double[]) in.readObject();
                            break;
                    case 8: defScoreUb = (double[]) in.readObject();
                            break;
                    case 9: defScoreOU = (double[]) in.readObject();
                            break;
                    case 10: defScoreUU = (double[]) in.readObject();
                            break;
                    case 11: defScoreRU = (double[]) in.readObject();
                            break;
                    case 12: defScoreNU = (double[]) in.readObject();
                            break;
                }
                
                if(showMsg)
                {
                    System.out.print("Loaded score for mode "+i+", values: ");

                    for(int j=0; j<defScoreAG.length; j++)
                    {
                        switch(i)
                        {
                            case 1: System.out.print("["+(j+1)+"] "+defScoreAG[j]);
                                    break;
                            case 2: System.out.print("["+(j+1)+"] "+defScore4w[j]);
                                    break;
                            case 3: System.out.print("["+(j+1)+"] "+defScore6[j]);
                                    break;
                            case 4: System.out.print("["+(j+1)+"] "+defScore2[j]);
                                    break;
                            case 5: System.out.print("["+(j+1)+"] "+defScore3[j]);
                                    break;
                            case 6: System.out.print("["+(j+1)+"] "+defScore4[j]);
                                    break;
                            case 7: System.out.print("["+(j+1)+"] "+defScore3w[j]);
                                    break;
                            case 8: System.out.print("["+(j+1)+"] "+defScoreUb[j]);
                                    break;
                            case 9: System.out.print("["+(j+1)+"] "+defScoreOU[j]);
                                    break;
                            case 10: System.out.print("["+(j+1)+"] "+defScoreUU[j]);
                                    break;
                            case 11: System.out.print("["+(j+1)+"] "+defScoreRU[j]);
                                    break;
                            case 12: System.out.print("["+(j+1)+"] "+defScoreNU[j]);
                                    break;
                        }
                        if(j != defScoreAG.length-1)
                            System.out.print("  - ");
                    }
                    
                    System.out.println();
                }
                
                
                in.close();
            } catch (IOException | ClassNotFoundException ex) {
                if(showMsg)
                    System.out.println("Couldn't load score for mode "+i);
            }
        }
    }
    
    private void convertScores()
    {
        //From 10 to 1000
        loadScores(true);
        for(int mode=1; mode<13; mode++){
        boolean succes = false;
            do{
            try {
                double[] defScoreTemp = {0,0,0,0,0,0,0,0,0,0};
                String path = "SavedNEW";
                File file = new File(path);
                if (!file.exists()) {
                    file.mkdirs();
                }
                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path+"\\"+mode+".ser"))) {
                    switch(mode){
                        case 1: defScoreTemp = (defScoreAG);
                        break;
                        case 2: defScoreTemp = (defScore4w);
                        break;
                        case 3: defScoreTemp = (defScore6);
                        break;
                        case 4: defScoreTemp = (defScore2);
                        break;
                        case 5: defScoreTemp = (defScore3);
                        break;
                        case 6: defScoreTemp = (defScore4);
                        break;
                        case 7: defScoreTemp = (defScore3w);
                        break;
                        case 8: defScoreTemp = (defScoreUb);
                        break;
                        case 9: defScoreTemp = (defScoreOU);
                        break;
                        case 10: defScoreTemp = (defScoreUU);
                        break;
                        case 11: defScoreTemp = (defScoreRU);
                        break;
                        case 12: defScoreTemp = (defScoreNU);
                        break;
                    }
                    
                    double[] defScoreTempBig = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                    for(int z=0; z<10; z++)
                    {
                        defScoreTempBig[z] = defScoreTemp[z];
                    }
                    
                    out.writeObject(defScoreTempBig);
                    out.flush();
                    succes = true;
                }
                } catch (IOException ex) {
                    succes = false;
                }
            }while(!succes);
            }
    }
    
    private Boolean isValid(ArrayList<Pokemon> team, int mode)
    {
        if(!allowBanned)
        {
            for(int i=0; i<partySize; i++)
            {
                if(team.get(i).isBanned())
                    return false;
            }
        }
        
        if(mode > 7)
        {
            for(int i=0; i<partySize; i++)
            {
                if(mode == 8 && team.get(i).getTier() >= 7)
                    return false;
                if(mode == 9 && team.get(i).getTier() >= 6)
                    return false;
                if(mode == 10 && team.get(i).getTier() >= 5)
                    return false;
                if(mode == 11 && team.get(i).getTier() >= 4)
                    return false;
                if(mode == 12 && team.get(i).getTier() >= 3)
                    return false;
            }
        }
        
        for(int j=0; j<partySize; j++)
        {
            if(team.get(j).isMega() && hasMega)
                return false;
            
            for(int i=0; i<partySize; i++)
            {
                if(team.get(i).getId() > 0 && i != j && team.get(j).getId() > 0 && team.get(i).getId() == team.get(j).getId())
                {
                    return false;
                }
            }                  
            
            if(team.get(j).isMega())
            {
                if(mode == 4)
                {
                    if(partner == 1 && !(team.get(j).getName().equals(new MegaGallade().getName())))
                        hasMega = true;
                    if(partner == 2 && !(team.get(j).getName().equals(new MegaMetagross().getName())))
                        hasMega = true;
                    if(partner == 3)
                        hasMega = true;
                    if(partner == 4 && !(team.get(j).getName().equals(new MegaCamerupt().getName())))
                        hasMega = true;
                }
                else
                    hasMega = true;
            }
            
            for(int i=0; i<partySize; i++)
            {
                if(team.get(i).getName().equals(team.get(j).getName()) && i != j)
                {
                    return false;
                }
            } 
        }
        return true;
    }
    
    private double typeCalc(Pokemon pok, Type2 t)
    {
        double sum = 1;
        for(int i=0; i<12; i++)
        {
            if(pok.getType(1).immuneTo(i).toString().equals(t.toString()))
                sum *= 1.0/6.0;
            if(pok.getType(1).resists(i).toString().equals(t.toString()))
                sum *= 0.5;
            if(pok.getType(1).weakTo(i).toString().equals(t.toString()))
                sum *= 2;
            if(pok.getType(2).immuneTo(i).toString().equals(t.toString()))
                sum *= 1.0/6.0;
            if(pok.getType(2).resists(i).toString().equals(t.toString()))
                sum *= 0.5;
            if(pok.getType(2).weakTo(i).toString().equals(t.toString()))
                sum *= 2;
        }
        sum *= pok.getAbility().getModifier(t);
        if(sum<1.0/6.0)
            sum = 1.0/6.0;
        return sum;
    }
    
    private double calcPartyDefScore(ArrayList<Pokemon> team)
    {
        ArrayList<Double> weakTable = new ArrayList<>();
        for(int j = 0; j< partySize; j++)
        {
            if(j == 0)
            {
                for (Type2 type : types) {
                    weakTable.add(typeCalc(team.get(0), type));
                }
            }
            else
            {
                for(int i=0; i<types.length; i++)
                {
                    weakTable.set(i, typeCalc(team.get(j), types[i]) * weakTable.get(i));
                }
            }  
        }
        
        double s = 0;
        for (Double weakTable1 : weakTable) {
            if (weakTable1 > 1) {
                s += weakTable1 * weakTable1;
            } else {
                s += weakTable1;
            }
        }
        
        return s;
    }
    
    private double calcPartyTierScore(ArrayList<Pokemon> team, int mode)
    {
        double s = 0;
        for(int i = 0; i< partySize; i++)
        {
            s += team.get(i).getTier();
            if(mode != 1 && mode != 2 && !(mode >= 7) && (team.get(i).getName().equals(new MegaKangaskhan().getName()) || team.get(i).getName().equals(new Landorus().getName()) || team.get(i).getName().equals(new Talonflame().getName()) || team.get(i).getName().equals(new Gliscor().getName())))
                s += 1;
        }
        return s/(43/6*partySize)*100;
    }
    
    private double calcPartyBaseScore(ArrayList<Pokemon> team, int mode)
    {
        double s = 0;
        for(int i = 0; i< partySize; i++)
        {
            s += team.get(i).getBase();
        }
        return s/(780*partySize)*100;
    }
    
    @SuppressWarnings("empty-statement")
    private Pokemon Id2Pokemon(int id)
    {
        if(id==1){ return new Venusaur(); };
        if(id==2){ return new MegaVenusaur(); };
        if(id==3){ return new Charizard(); };
        if(id==4){ return new MegaCharizardX(); };
        if(id==5){ return new MegaCharizardY(); };
        if(id==6){ return new Blastoise(); };
        if(id==7){ return new MegaBlastoise(); };
        if(id==8){ return new Butterfree(); };
        if(id==9){ return new Beedrill(); };
        if(id==10){ return new MegaBeedrill(); };
        if(id==11){ return new Pidgeot(); };
        if(id==12){ return new MegaPidgeot(); };
        if(id==13){ return new Raticate(); };
        if(id==14){ return new Fearow(); };
        if(id==15){ return new Arbok(); };
        if(id==16){ return new Raichu(); };
        if(id==17){ return new Sandslash(); };
        if(id==18){ return new Nidoqueen(); };
        if(id==19){ return new Nidoking(); };
        if(id==20){ return new Clefable(); };
        if(id==21){ return new Ninetales(); };
        if(id==22){ return new Wigglytuff(); };
        if(id==23){ return new Vileplume(); };
        if(id==24){ return new Parasect(); };
        if(id==25){ return new Venomoth(); };
        if(id==26){ return new Dugtrio(); };
        if(id==27){ return new Persian(); };
        if(id==28){ return new Golduck(); };
        if(id==29){ return new Primeape(); };
        if(id==30){ return new Arcanine(); };
        if(id==31){ return new Poliwrath(); };
        if(id==32){ return new Alakazam(); };
        if(id==33){ return new MegaAlakazam(); };
        if(id==34){ return new Machamp(); };
        if(id==35){ return new Victreebel(); };
        if(id==36){ return new Tentacruel(); };
        if(id==37){ return new Golem(); };
        if(id==38){ return new Rapidash(); };
        if(id==39){ return new Slowbro(); };
        if(id==40){ return new MegaSlowbro(); };
        if(id==41){ return new Farfetchd(); };
        if(id==42){ return new Dodrio(); };
        if(id==43){ return new Dewgong(); };
        if(id==44){ return new Muk(); };
        if(id==45){ return new Cloyster(); };
        if(id==46){ return new Gengar(); };
        if(id==47){ return new MegaGengar(); };
        if(id==48){ return new Hypno(); };
        if(id==49){ return new Kingler(); };
        if(id==50){ return new Electrode(); };
        if(id==51){ return new Exeggutor(); };
        if(id==52){ return new Marowak(); };
        if(id==53){ return new Hitmonlee(); };
        if(id==54){ return new Hitmonchan(); };
        if(id==55){ return new Weezing(); };
        if(id==56){ return new Chansey(); };
        if(id==57){ return new Kangaskhan(); };
        if(id==58){ return new MegaKangaskhan(); };
        if(id==59){ return new Seaking(); };
        if(id==60){ return new Starmie(); };
        if(id==61){ return new MrMime(); };
        if(id==62){ return new Jynx(); };
        if(id==63){ return new Pinsir(); };
        if(id==64){ return new MegaPinsir(); };
        if(id==65){ return new Tauros(); };
        if(id==66){ return new Gyarados(); };
        if(id==67){ return new MegaGyarados(); };
        if(id==68){ return new Lapras(); };
        if(id==69){ return new Ditto(); };
        if(id==70){ return new Vaporeon(); };
        if(id==71){ return new Jolteon(); };
        if(id==72){ return new Flareon(); };
        if(id==73){ return new Omastar(); };
        if(id==74){ return new Kabutops(); };
        if(id==75){ return new Aerodactyl(); };
        if(id==76){ return new MegaAerodactyl(); };
        if(id==77){ return new Snorlax(); };
        if(id==78){ return new Articuno(); };
        if(id==79){ return new Zapdos(); };
        if(id==80){ return new Moltres(); };
        if(id==81){ return new Dragonite(); };
        if(id==82){ return new Mewtwo(); };
        if(id==83){ return new MegaMewtwoX(); };
        if(id==84){ return new MegaMewtwoY(); };
        if(id==85){ return new Mew(); };
        if(id==86){ return new Meganium(); };
        if(id==87){ return new Typhlosion(); };
        if(id==88){ return new Feraligatr(); };
        if(id==89){ return new Furret(); };
        if(id==90){ return new Noctowl(); };
        if(id==91){ return new Ledian(); };
        if(id==92){ return new Ariados(); };
        if(id==93){ return new Crobat(); };
        if(id==94){ return new Lanturn(); };
        if(id==95){ return new Xatu(); };
        if(id==96){ return new Ampharos(); };
        if(id==97){ return new MegaAmpharos(); };
        if(id==98){ return new Bellossom(); };
        if(id==99){ return new Azumarill(); };
        if(id==100){ return new Sudowoodo(); };
        if(id==101){ return new Politoed(); };
        if(id==102){ return new Jumpluff(); };
        if(id==103){ return new Sunflora(); };
        if(id==104){ return new Quagsire(); };
        if(id==105){ return new Espeon(); };
        if(id==106){ return new Umbreon(); };
        if(id==107){ return new Slowking(); };
        if(id==108){ return new Unown(); };
        if(id==109){ return new Wobbuffet(); };
        if(id==110){ return new Girafarig(); };
        if(id==111){ return new Forretress(); };
        if(id==112){ return new Dunsparce(); };
        if(id==113){ return new Steelix(); };
        if(id==114){ return new MegaSteelix(); };
        if(id==115){ return new Granbull(); };
        if(id==116){ return new Qwilfish(); };
        if(id==117){ return new Scizor(); };
        if(id==118){ return new MegaScizor(); };
        if(id==119){ return new Shuckle(); };
        if(id==120){ return new Heracross(); };
        if(id==121){ return new MegaHeracross(); };
        if(id==122){ return new Ursaring(); };
        if(id==123){ return new Magcargo(); };
        if(id==124){ return new Corsola(); };
        if(id==125){ return new Octillery(); };
        if(id==126){ return new Delibird(); };
        if(id==127){ return new Mantine(); };
        if(id==128){ return new Skarmory(); };
        if(id==129){ return new Houndoom(); };
        if(id==130){ return new MegaHoundoom(); };
        if(id==131){ return new Kingdra(); };
        if(id==132){ return new Donphan(); };
        if(id==133){ return new Stantler(); };
        if(id==134){ return new Smeargle(); };
        if(id==135){ return new Hitmontop(); };
        if(id==136){ return new Miltank(); };
        if(id==137){ return new Blissey(); };
        if(id==138){ return new Raikou(); };
        if(id==139){ return new Entei(); };
        if(id==140){ return new Suicune(); };
        if(id==141){ return new Tyranitar(); };
        if(id==142){ return new MegaTyranitar(); };
        if(id==143){ return new Lugia(); };
        if(id==144){ return new HoOh(); };
        if(id==145){ return new Celebi(); };
        if(id==146){ return new Sceptile(); };
        if(id==147){ return new MegaSceptile(); };
        if(id==148){ return new Blaziken(); };
        if(id==149){ return new MegaBlaziken(); };
        if(id==150){ return new Swampert(); };
        if(id==151){ return new MegaSwampert(); };
        if(id==152){ return new Mightyena(); };
        if(id==153){ return new Linoone(); };
        if(id==154){ return new Beautifly(); };
        if(id==155){ return new Dustox(); };
        if(id==156){ return new Ludicolo(); };
        if(id==157){ return new Shiftry(); };
        if(id==158){ return new Swellow(); };
        if(id==159){ return new Pelipper(); };
        if(id==160){ return new Gardevoir(); };
        if(id==161){ return new MegaGardevoir(); };
        if(id==162){ return new Surskit(); };
        if(id==163){ return new Masquerain(); };
        if(id==164){ return new Breloom(); };
        if(id==165){ return new Slaking(); };
        if(id==166){ return new Ninjask(); };
        if(id==167){ return new Shedinja(); };
        if(id==168){ return new Exploud(); };
        if(id==169){ return new Hariyama(); };
        if(id==170){ return new Delcatty(); };
        if(id==171){ return new Sableye(); };
        if(id==172){ return new MegaSableye(); };
        if(id==173){ return new Mawile(); };
        if(id==174){ return new MegaMawile(); };
        if(id==175){ return new Aggron(); };
        if(id==176){ return new MegaAggron(); };
        if(id==177){ return new Medicham(); };
        if(id==178){ return new MegaMedicham(); };
        if(id==179){ return new Manectric(); };
        if(id==180){ return new MegaManectric(); };
        if(id==181){ return new Plusle(); };
        if(id==182){ return new Minum(); };
        if(id==183){ return new Volbeat(); };
        if(id==184){ return new Illumise(); };
        if(id==185){ return new Swalot(); };
        if(id==186){ return new Sharpedo(); };
        if(id==187){ return new MegaSharpedo(); };
        if(id==188){ return new Wailord(); };
        if(id==189){ return new Camerupt(); };
        if(id==190){ return new MegaCamerupt(); };
        if(id==191){ return new Torkoal(); };
        if(id==192){ return new Grumpig(); };
        if(id==193){ return new Spinda(); };
        if(id==194){ return new Flygon(); };
        if(id==195){ return new Cacturne(); };
        if(id==196){ return new Altaria(); };
        if(id==197){ return new Zangoose(); };
        if(id==198){ return new Seviper(); };
        if(id==199){ return new Lunatone(); };
        if(id==200){ return new Solrock(); };
        if(id==201){ return new Whiscash(); };
        if(id==202){ return new Crawdaunt(); };
        if(id==203){ return new Claydol(); };
        if(id==204){ return new Cradily(); };
        if(id==205){ return new Armaldo(); };
        if(id==206){ return new Milotic(); };
        if(id==207){ return new Castform(); };
        if(id==208){ return new Kecleon(); };
        if(id==209){ return new Banette(); };
        if(id==210){ return new MegaBanette(); };
        if(id==211){ return new Tropius(); };
        if(id==212){ return new Chimecho(); };
        if(id==213){ return new Absol(); };
        if(id==214){ return new MegaAbsol(); };
        if(id==215){ return new Glalie(); };
        if(id==216){ return new MegaGlalie(); };
        if(id==217){ return new Walrein(); };
        if(id==218){ return new Huntail(); };
        if(id==219){ return new Gorebyss(); };
        if(id==220){ return new Relicanth(); };
        if(id==221){ return new Luvdisc(); };
        if(id==222){ return new Salamence(); };
        if(id==223){ return new MegaSalamence(); };
        if(id==224){ return new Metagross(); };
        if(id==225){ return new MegaMetagross(); };
        if(id==226){ return new Regirock(); };
        if(id==227){ return new Regice(); };
        if(id==228){ return new Registeel(); };
        if(id==229){ return new Latias(); };
        if(id==230){ return new MegaLatias(); };
        if(id==231){ return new Latios(); };
        if(id==232){ return new MegaLatios(); };
        if(id==233){ return new Kyogre(); };
        if(id==234){ return new Groudon(); };
        if(id==235){ return new Rayquaza(); };
        if(id==236){ return new MegaRayquaza(); };
        if(id==237){ return new Jirachi(); };
        if(id==238){ return new Deoxys(); };
        if(id==239){ return new Torterra(); };
        if(id==240){ return new Infernape(); };
        if(id==241){ return new Empoleon(); };
        if(id==242){ return new Staraptor(); };
        if(id==243){ return new Bibarel(); };
        if(id==244){ return new Kricketune(); };
        if(id==245){ return new Luxray(); };
        if(id==246){ return new Roserade(); };
        if(id==247){ return new Rampardos(); };
        if(id==248){ return new Bastiodon(); };
        if(id==249){ return new Wormadam(); };
        if(id==250){ return new WormadamSandy(); };
        if(id==251){ return new WormadamTrash(); };
        if(id==252){ return new Mothim(); };
        if(id==253){ return new Vespiquen(); };
        if(id==254){ return new Pachirisu(); };
        if(id==255){ return new Floatzel(); };
        if(id==256){ return new Cherrim(); };
        if(id==257){ return new Gastrodon(); };
        if(id==258){ return new Ambipom(); };
        if(id==259){ return new Drifblim(); };
        if(id==260){ return new Lopunny(); };
        if(id==261){ return new MegaLopunny(); };
        if(id==262){ return new Mismagius(); };
        if(id==263){ return new Honchkrow(); };
        if(id==264){ return new Purugly(); };
        if(id==265){ return new Skuntank(); };
        if(id==266){ return new Bronzong(); };
        if(id==267){ return new Chatot(); };
        if(id==268){ return new Spiritomb(); };
        if(id==269){ return new Garchomp(); };
        if(id==270){ return new MegaGarchomp(); };
        if(id==271){ return new Lucario(); };
        if(id==272){ return new MegaLucario(); };
        if(id==273){ return new Hippowdon(); };
        if(id==274){ return new Drapion(); };
        if(id==275){ return new Toxicroak(); };
        if(id==276){ return new Carnivine(); };
        if(id==277){ return new Lumineon(); };
        if(id==278){ return new Abomasnow(); };
        if(id==279){ return new MegaAbomasnow(); };
        if(id==280){ return new Weavile(); };
        if(id==281){ return new Magnezone(); };
        if(id==282){ return new Lickillicky(); };
        if(id==283){ return new Rhyperior(); };
        if(id==284){ return new Tangrowth(); };
        if(id==285){ return new Electivire(); };
        if(id==286){ return new Magmortar(); };
        if(id==287){ return new Togekiss(); };
        if(id==288){ return new Yanmega(); };
        if(id==289){ return new Leafeon(); };
        if(id==290){ return new Glaceon(); };
        if(id==291){ return new Gliscor(); };
        if(id==292){ return new Mamoswine(); };
        if(id==293){ return new PorygonZ(); };
        if(id==294){ return new Gallade(); };
        if(id==295){ return new MegaGallade(); };
        if(id==296){ return new Probopass(); };
        if(id==297){ return new Dusknoir(); };
        if(id==298){ return new Froslass(); };
        if(id==299){ return new Rotom(); };
        if(id==300){ return new RotomHeat(); };
        if(id==301){ return new RotomWash(); };
        if(id==302){ return new RotomFrost(); };
        if(id==303){ return new RotomFan(); };
        if(id==304){ return new RotomMow(); };
        if(id==305){ return new Uxie(); };
        if(id==306){ return new Mesprit(); };
        if(id==307){ return new Azelf(); };
        if(id==308){ return new Dialga(); };
        if(id==309){ return new Palkia(); };
        if(id==310){ return new Heatran(); };
        if(id==311){ return new Regigigas(); };
        if(id==312){ return new Giratina(); };
        if(id==313){ return new GiratinaOrigin(); };
        if(id==314){ return new Cresselia(); };
        if(id==315){ return new Manaphy(); };
        if(id==316){ return new Darkrai(); };
        if(id==317){ return new Shaymin(); };
        if(id==318){ return new ShayminSky(); };
        if(id==319){ return new Arceus(); };
        if(id==320){ return new Arceus(); };
        if(id==321){ return new Arceus(); };
        if(id==322){ return new Arceus(); };
        if(id==323){ return new Arceus(); };
        if(id==324){ return new Arceus(); };
        if(id==325){ return new Arceus(); };
        if(id==326){ return new Arceus(); };
        if(id==327){ return new Arceus(); };
        if(id==328){ return new Arceus(); };
        if(id==329){ return new Arceus(); };
        if(id==330){ return new Arceus(); };
        if(id==331){ return new Arceus(); };
        if(id==332){ return new Arceus(); };
        if(id==333){ return new Arceus(); };
        if(id==334){ return new Arceus(); };
        if(id==335){ return new Arceus(); };
        if(id==336){ return new Arceus(); };
        if(id==337){ return new Victini(); };
        if(id==338){ return new Serperior(); };
        if(id==339){ return new Emboar(); };
        if(id==340){ return new Samurott(); };
        if(id==341){ return new Watchog(); };
        if(id==342){ return new Stoutland(); };
        if(id==343){ return new Liepard(); };
        if(id==344){ return new Simisage(); };
        if(id==345){ return new Simisear(); };
        if(id==346){ return new Simipour(); };
        if(id==347){ return new Mushama(); };
        if(id==348){ return new Unfezant(); };
        if(id==349){ return new Zebstrika(); };
        if(id==350){ return new Gigalith(); };
        if(id==351){ return new Swoobat(); };
        if(id==352){ return new Excadrill(); };
        if(id==353){ return new Audino(); };
        if(id==354){ return new MegaAudino(); };
        if(id==355){ return new Conkeldurr(); };
        if(id==356){ return new Seismitoad(); };
        if(id==357){ return new Throh(); };
        if(id==358){ return new Sawk(); };
        if(id==359){ return new Leavanny(); };
        if(id==360){ return new Scolipede(); };
        if(id==361){ return new Whimsicott(); };
        if(id==362){ return new Lilligant(); };
        if(id==363){ return new Basculin(); };
        if(id==364){ return new Krookodile(); };
        if(id==365){ return new Darmanitan(); };
        if(id==366){ return new Maractus(); };
        if(id==367){ return new Crustle(); };
        if(id==368){ return new Scrafty(); };
        if(id==369){ return new Sigilyph(); };
        if(id==370){ return new Cofagrigus(); };
        if(id==371){ return new Carracosta(); };
        if(id==372){ return new Archeops(); };
        if(id==373){ return new Garbodor(); };
        if(id==374){ return new Zoroark(); };
        if(id==375){ return new Cinccino(); };
        if(id==376){ return new Gothitelle(); };
        if(id==377){ return new Reuniclus(); };
        if(id==378){ return new Swanna(); };
        if(id==379){ return new Vanilluxe(); };
        if(id==380){ return new Sawsbuck(); };
        if(id==381){ return new Emolga(); };
        if(id==382){ return new Escavalier(); };
        if(id==383){ return new Amoonguss(); };
        if(id==384){ return new Jellicent(); };
        if(id==385){ return new Alomomola(); };
        if(id==386){ return new Galvantula(); };
        if(id==387){ return new Ferrothorn(); };
        if(id==388){ return new Klingklang(); };
        if(id==389){ return new Eelektross(); };
        if(id==390){ return new Beheeyem(); };
        if(id==391){ return new Chandelure(); };
        if(id==392){ return new Haxorus(); };
        if(id==393){ return new Beartic(); };
        if(id==394){ return new Cryogonal(); };
        if(id==395){ return new Accelgor(); };
        if(id==396){ return new Stunfisk(); };
        if(id==397){ return new Mienshao(); };
        if(id==398){ return new Druddigon(); };
        if(id==399){ return new Golurk(); };
        if(id==400){ return new Bisharp(); };
        if(id==401){ return new Bouffalant(); };
        if(id==402){ return new Braviary(); };
        if(id==403){ return new Mandibuzz(); };
        if(id==404){ return new Heatmor(); };
        if(id==405){ return new Durant(); };
        if(id==406){ return new Hydreigon(); };
        if(id==407){ return new Volcarona(); };
        if(id==408){ return new Cobalion(); };
        if(id==409){ return new Terrakion(); };
        if(id==410){ return new Virizion(); };
        if(id==411){ return new Tornadus(); };
        if(id==412){ return new ThundurusTherian(); };
        if(id==413){ return new Tornadus(); };
        if(id==414){ return new ThundurusTherian(); };
        if(id==415){ return new Reshiram(); };
        if(id==416){ return new Zekrom(); };
        if(id==417){ return new Landorus(); };
        if(id==418){ return new LandorusTherian(); };
        if(id==419){ return new Kyurem(); };
        if(id==420){ return new KyuremWhite(); };
        if(id==421){ return new KyuremBlack(); };
        if(id==422){ return new Keldeo(); };
        if(id==423){ return new Meloetta(); };
        if(id==424){ return new MeloettaPirouette(); };
        if(id==425){ return new Genesect(); };
        if(id==426){ return new Chesnaught(); };
        if(id==427){ return new Delphox(); };
        if(id==428){ return new Greninja(); };
        if(id==429){ return new Diggersby(); };
        if(id==430){ return new Talonflame(); };
        if(id==431){ return new Vivillon(); };
        if(id==432){ return new Pyroar(); };
        if(id==433){ return new Florges(); };
        if(id==434){ return new Gogoat(); };
        if(id==435){ return new Pangoro(); };
        if(id==436){ return new Furfrou(); };
        if(id==437){ return new Meowstic(); };
        if(id==438){ return new Aegislash(); };
        if(id==439){ return new Aromatisse(); };
        if(id==440){ return new Slurpuff(); };
        if(id==441){ return new Malamar(); };
        if(id==442){ return new Barbaracle(); };
        if(id==443){ return new Dragalge(); };
        if(id==444){ return new Clawitzer(); };
        if(id==445){ return new Heliolisk(); };
        if(id==446){ return new Tyrantrum(); };
        if(id==447){ return new Aurorus(); };
        if(id==448){ return new Sylveon(); };
        if(id==449){ return new Hawlucha(); };
        if(id==450){ return new Dedenne(); };
        if(id==451){ return new Carbink(); };
        if(id==452){ return new Goodra(); };
        if(id==453){ return new Klefki(); };
        if(id==454){ return new Trevenant(); };
        if(id==455){ return new Gourgeist(); };
        if(id==456){ return new Avalugg(); };
        if(id==457){ return new Noivern(); };
        if(id==458){ return new Xerneas(); };
        if(id==459){ return new Yveltal(); };
        if(id==460){ return new Zygarde(); };
        if(id==461){ return new Diancie(); };
        if(id==462){ return new MegaDiancie(); };
        if(id==463){ return new Combusken(); };
        if(id==464){ return new Dragonair(); };
        if(id==465){ return new Duosion(); };
        if(id==466){ return new Dusclops(); };
        if(id==467){ return new Ferroseed(); };
        if(id==468){ return new Floette(); };
        if(id==469){ return new Fraxure(); };
        if(id==470){ return new Frogadier(); };
        if(id==471){ return new Gabite(); };
        if(id==472){ return new Gothorita(); };
        if(id==473){ return new Gurdurr(); };
        if(id==474){ return new Haunter(); };
        if(id==475){ return new Kadabra(); };
        if(id==476){ return new Lampent(); };
        if(id==477){ return new Machoke(); };
        if(id==478){ return new Metang(); };
        if(id==479){ return new Murkrow(); };
        if(id==480){ return new Phione(); };
        if(id==481){ return new Pikachu(); };
        if(id==482){ return new Quilladin(); };
        if(id==483){ return new Roselia(); };
        if(id==484){ return new Scyther(); };
        if(id==485){ return new Seadra(); };
        if(id==486){ return new Shelgon(); };
        if(id==487){ return new Sliggoo(); };
        if(id==488){ return new Sneasel(); };
        if(id==489){ return new Tangela(); };
        if(id==490){ return new Togetic(); };
        if(id==491){ return new Vigoroth(); };
        if(id==492){ return new Doublade(); };
        if(id==493){ return new Fletchinder(); };
        if(id==494){ return new Golbat(); };
        if(id==495){ return new Magneton(); };
        if(id==496){ return new Gligar(); };
        if(id==497){ return new Porygon2(); };
        if(id==498){ return new KyogrePrimal(); };
        if(id==499){ return new GroudonPrimal(); };
        if(id==500){ return new Hoopa(); };
        if(id==501){ return new HoopaAlt(); };
        return null;
    }
}