/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author haroldmacmillan
 */
public class coreGame{
    
    public static void main(String[] args) {
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
        int chosen = scenario.nextInt(0, 11);
        String option = "";
        
        if(chosen == 0) {
            String option = scenarioYouth;}
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
        
        
        String characterOne =  ("Lord Silverhearth");
        String characterTwo = ("Sir Arthur Pennycopper");
        String characterThree = ("Garalon");
        String characterFour = ("Auntie Agnes");
        String characterFive = ("Mrs. Fayne");
        String characterSix = ("Veldric the wise");
        
        int character = scenario.nextInt(0, 5);
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
              
        
        
        
        Scanner potions = new Scanner(System.in);
        System.out.println("Greeting's it is I, " + name + " and I require your skills alchemist.");
        System.out.println("");
        System.out.println("I seek a draft for this issue:");
        System.out.println(option);
        System.out.println("");
        System.out.print("Please select your first ingredient: ");
        String first = potions.nextLine().toLowerCase();
        System.out.print("Please select your second ingredient: ");
        String second = potions.nextLine().toLowerCase();
        System.out.print("Please select your final ingredient: ");
        String third = potions.nextLine().toLowerCase();
        String [] potionCombo = {first, second, third};
        
        if (Arrays.equals(potionCombo, elixirOfyouth)) {
            System.out.print("Your patron can again feel youthful – and young. You've made an elixir of youth, well done!");}
        else if (Arrays.equals(potionCombo, elixirOfhealing)) {
            System.out.print("Your patron can finally feel refreshed, rejuvinated. You've made an elixir of healing, great job!");}
        else if (Arrays.equals(potionCombo, elixirOfmirth)) {
            System.out.print("Your patron can't stop laughing? hehehe! Great job, you've made an elixir of mirth!");
        }
        else if (Arrays.equals(potionCombo, elixirOfslumber)) {
            System.out.print("Your patron can at last sleep well. ZZZZZZZ! Say goodbye to insomnia – because you've made an elixir of slumber. ");
        }
        else if (Arrays.equals(potionCombo, elixirOfcharm)) {
            System.out.print("Your patron will soon feel diffrent. Charismatic, confident, and attractive. Farewell to lonely nights! You've made an elixir of charm!");
        }
        else if (Arrays.equals(potionCombo, elixirOflove)) {
            System.out.print("Your patron can finally find love, thanks to you. You've made an elxir of love!");
        }
        else if (Arrays.equals(potionCombo, elixirOfmalice)) {
            System.out.print(" Your patron feels bitter, spiteful, and envious. Wait – you've created an elixir of malice!");


}
        else if (Arrays.equals(potionCombo, elixirOfdecay)) {
            System.out.print("HAHAHA! Soon your patrons enemies will feel – zombie like. Wait! You've made an elixir of decay!");
        }
        else if (Arrays.equals(potionCombo, elixirOfpoison)) {
            System.out.print("Your patron! They're enemies will soon be dead! It looks like you've made an elixir of poison...");
            
}
        else if (Arrays.equals(potionCombo, elixirOfspeed)){
            System.out.print("Your patron will soon feel fast. Like a hare or cheetah. You've managed to make an elixir of speed! ZOOM!");
        }
        else if (Arrays.equals(potionCombo, elixirOfluck)) {
            System.out.print("Your patrons willl feel strange, lucky almost. You've made an elixir of luck!");
        }
        else if (Arrays.equals(potionCombo, elixirOfsorrows)) {
            System.out.print("Your patron feels melancholy, forlorn, sad. They can't help but shed a few tears. You've made an elixir of sorrows – wow you are mean!");
        }
        else {
            System.out.print("You've managed to make a potion that is very much useless! Well done! ");
        }
        
}
}
