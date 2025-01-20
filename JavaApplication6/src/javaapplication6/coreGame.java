/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author haroldmacmillan
 */
public class coreGame{
    
    public static void scenario() {
 
        String scenarioYouth = "(I need an elixir to retain my youthful vigor. Can you craft something for me, alchemist?)";
        String scenarioHealing = "(I have been grievously wounded in battle. Can you prepare a healing potion for me, master alchemist?)";
        String scenarioMirth = "(My heart is heavy and my soul burdened. I seek a potion to lift my spirits!)";
        String scenarioSlumber = "(I have not slept in days! My mind grows weary and my body weak. Please, grant me rest!)";
        String scenarioCharm = "(I have lost my confidence. I seek an elixir to enhance my charisma and presence.)";
        String scenarioLove = "(I wish to find love, but alas, none take notice of me. Can you brew something to change this?)";
        String scenarioSpeed = "(I must race against time itself! I need a potion to increase my swiftness.)";
        String scenarioLuck = "(I am about to embark on a perilous journey. A bit of luck would do me wonders.)";
        String scenarioMalice = "(There is a rival who must fall. Can you craft an elixir of malice to turn their heart to stone?)";
        String scenarioDecay = "(A neighbor has become a thorn in my side. I need something... permanent to deal with them.)";
        String scenarioPoison = "(Rats infest my home, and my patience is gone. Can you craft something deadly to rid me of them?)";
        String scenarioSorrows = "(A friend of mine has found joy, but I cannot bear it. I wish for them to know sorrow.)";
        Random scenario = new Random();
        int chosen = scenario.nextInt(12);
        String option = "";
        
        if(chosen == 0) {
            option = scenarioYouth;}
        else if (chosen == 1) {
            option = scenarioHealing;}
        else if (chosen == 2) {
            option = scenarioMirth;}
        else if (chosen == 3) {
            option = scenarioSlumber;}
        else if (chosen == 4) {
            option = scenarioCharm;}
        else if (chosen == 5) {
            option = scenarioLove;}
        else if (chosen == 6) {
            option = scenarioSpeed;}
        else if (chosen == 7) {
            option = scenarioLuck;}
        else if (chosen == 8) {
            option = scenarioMalice;}
        else if (chosen == 9) {
            option = scenarioDecay;}
        else if (chosen == 10) {
            option = scenarioPoison;}
        else if (chosen == 11) {
            option = scenarioSorrows;}
        
        System.out.println(option);
        
}
        
    public static void patronPick() {
        Random characters = new Random();
        String characterOne =  ("Lord Silverhearth");
        String characterTwo = ("Sir Ashen Pennycopper");
        String characterThree = ("Garalon");
        String characterFour = ("Auntie Agnes");
        String characterFive = ("Mrs. Fayne");
        String characterSix = ("Veldric the wise");
        String characterSeven = ("Broilbog the ogre");
        String characterEight = ("Princess Evangaline");
        String characterNine = ("Quarion moonbrooke");
        
        int character = characters.nextInt(0, 8);
        String name = "";
        if (character == 0) {
            name = characterOne;}
        else if (character == 1) {
            name = characterTwo;}
        else if (character == 2) {
            name = characterThree;}
        else if (character == 3) {
            name = characterFour;}
        else if (character == 4) {
            name = characterFive;}
        else if (character == 5) {
            name = characterSix;}
        else if (character == 6) {
            name = characterSeven;}
        else if (character == 7) {
            name = characterEight;}
        else if (character == 8) {
            name = characterNine;}
        
        System.out.println("Greeting's it is I, " + name + " and I require your skills alchemist.");
    }    
       
    public static void mapPick() {
        HashMap<String, String> alchemyBook = new HashMap<String, String>();

        alchemyBook.put("silver dust, fire amber, unicorn blood", "Elixir of youth");
        alchemyBook.put("mageberries, weavemoss, toadstool", "Elixir of healing");
        alchemyBook.put("ogres blood, silver dust, fairy essence", "Elixir of mirth");
        alchemyBook.put("mageberries, fire amber, fairy essence", "Elixir of slumber");
        alchemyBook.put("vampire soul, silver dust, weavemoss", "Elixir of charm");
        alchemyBook.put("unicorn blood, mageberries, hag's mushroom", "Elixir of love");
        alchemyBook.put("fairy essence, toadstool, mageberries", "Elixir of speed");
        alchemyBook.put("silver dust, mageberries, hag's mushrooms", "Elixir of luck");
        alchemyBook.put("vampire soul, mageberries, ogres blood", "Elixir of malice");
        alchemyBook.put("silver dust, toadstool, hag's mushroom", "Elixir of decay");
        alchemyBook.put("weavemoss, ogres blood, fire amber", "Elixir of poison");
        alchemyBook.put("unicorn blood, fire amber, toadstool", "Elixir of sorrows");
        
        System.out.println("\nAlchemy Book Contents:\n");
        for (Map.Entry<String, String> entry : alchemyBook.entrySet()) {
    System.out.println("Ingredients: " + entry.getKey());
    System.out.println("Elixir: " + entry.getValue());
    System.out.println("---------------------------");}}

    public static void main(String[] args) {
        
        String yes = "yes";
        String no = "no";
        
        Scanner potions = new Scanner(System.in);
            System.out.println("");
            System.out.println("");
        System.out.println("");
        patronPick();
        System.out.println("I seek a draft for this issue:");
        scenario();
        System.out.println("");
        System.out.println("Before you choose the ingredients to brew, would you like to search the spellbook?: ");
        String book = potions.nextLine().toLowerCase();
        if (book.equals(yes)) {
            // Done by CHATGPT
            mapPick();}
            
        System.out.print("");
        System.out.print("Choose first ingredient to brew: ");
        String first = potions.nextLine().toLowerCase();
        System.out.print("Choose second ingredient to brew: ");
        String second = potions.nextLine().toLowerCase();
        System.out.print("Choose third ingredient to brew: ");
        String third = potions.nextLine().toLowerCase();
        System.out.println("Cauldron is brewing...");
        System.out.println("");
        String [] potionCombo = {first, second, third};
        patronResponse(potionCombo);
    
    
    }
    
    public static void patronResponse (String[]potionCombo) {
          String[] elixirOfyouth = {"silver dust", "fire amber", "unicorn blood"};
        String[] elixirOfhealing = {"mageberries", "weavemoss", "toadstool"};
        String[] elixirOfmirth = {"ogres blood", "silver dust", "fairy essence"};
        String[] elixirOfslumber = {"mageberries", "fire amber", "fairy essence"};
        String[] elixirOfcharm = {"vampire soul", "silver dust", "weavemoss"};
        String[] elixirOflove = {"unicorn blood", "mageberries", "hag's mushroom"};
        String[] elixirOfspeed = {"fairy essence", "toadstool", "mageberries"};
        String[] elixirOfluck = {"silver dust", "mageberries", "hag's mushrooms"};
        
        String[] elixirOfmalice = {"vampire soul", "mageberries", "ogres blood"};
        String[] elixirOfdecay = {"silver dust", "toadstool", "hag's mushroom"};
        String[] elixirOfpoison = {"weavemoss", "ogres blood", "fire amber"};
        String[] elixirOfsorrows = {"unicorn blood", "fire amber", "toadstool"};
        
        if (Arrays.equals(potionCombo, elixirOfyouth)) {
            System.out.print("Your patron can again feel youthful – and young. You've made an elixir of youth, well done!");}
        else if (Arrays.equals(potionCombo, elixirOfhealing)) {
            System.out.print("Thank you alchemist. Without your aid I would have surely perish.");}
        else if (Arrays.equals(potionCombo, elixirOfmirth)) {
            System.out.print("Huzzah! I feel like a child oncemore, thanks to you dear alchemist.");
        }
        else if (Arrays.equals(potionCombo, elixirOfslumber)) {
            System.out.print("I can at last rest! Oh dear god! Thank you alchemist.");
        }
        else if (Arrays.equals(potionCombo, elixirOfcharm)) {
            System.out.print("I feel charismatic, confident. Your are a saint my fellow!");
        }
        else if (Arrays.equals(potionCombo, elixirOflove)) {
            System.out.print("I can finally find love, thanks to you alchemist!");
        }
        else if (Arrays.equals(potionCombo, elixirOfmalice)) {
            System.out.print("Soon I shall be rid of my foes. HAHAHAHA!");


}
        else if (Arrays.equals(potionCombo, elixirOfdecay)) {
            System.out.print("HAHAHA! Soon my neighbour shall feel – zombie like. Oh rejoice!");
        }
        else if (Arrays.equals(potionCombo, elixirOfpoison)) {
            System.out.print("At last I may finally be rid of those foul pests! Thanks to you alchemist.");
            
}
        else if (Arrays.equals(potionCombo, elixirOfspeed)){
            System.out.print("I feel agile. I feel fast. Like a hare!");
        }
        else if (Arrays.equals(potionCombo, elixirOfluck)) {
            System.out.print("I feel strange, lucky almost.");
        }
        else if (Arrays.equals(potionCombo, elixirOfsorrows)) {
            System.out.print("Thanks to you alchemist. My dear friend will pay!");
        }
        else {
            System.out.print("Whats this! I didn't ask for that! Do you take me as a fool? Good day!");
        }
        

    }
    
    
    
    
}
