package javaapplication6;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Scanner;
import javaapplication6.Sprite;
import javaapplication6.coreGame;
import static javaapplication6.coreGame.mapPick;
import static javaapplication6.coreGame.patronPick;
import static javaapplication6.coreGame.patronResponse;
import static javaapplication6.coreGame.scenario;

public class projectPanel extends JPanel implements MouseListener {

    // Sprites for the ingredients and cauldron
    Sprite lab = new Sprite(0, 0, "images/AlchemyLab.jpeg", 1500, 1000);
    Sprite mageberries = new Sprite(55, 467, "images/Mageberries.png", 100, 100);
    Sprite fairyessence = new Sprite(160, 450, "images/fairyEssence.png", 100, 100);
    Sprite weaveMoss = new Sprite(250, 430, "images/weavemoss.png", 100, 100);
    Sprite fireamber = new Sprite(56, 345, "images/fireAmber.png", 100, 100);
    Sprite toadStool = new Sprite(168, 330, "images/toadstool.png", 100, 100);
    Sprite silverdust = new Sprite(268, 325, "images/silverDust.png", 100, 100);
    Sprite ogresblood = new Sprite(65, 175, "images/ogresBlood.png", 100, 100);
    Sprite hagsmushroom = new Sprite(72, 20, "images/hagsMushroom.png", 100, 100);
    Sprite vampireSoul = new Sprite(165, 60, "images/vampireSoul_1.png", 125, 125);
    Sprite unicornblood = new Sprite(153, 190, "images/unicornBlood.png", 125, 125);
    Sprite cauldron = new Sprite(550, 577, "images/Cauldron.png", 225, 225);

    // List to store selected ingredients
    ArrayList<String> selectedIngredients = new ArrayList<>();
    
    // State variables
    boolean repeatDialogue = true;
    boolean brewingInProgress = false; // New flag to track if brewing is in progress

    public projectPanel() {
        addMouseListener(this);  // Register mouse click listener
    }

    public void paintComponent(Graphics paintDraw) {
        super.paintComponents(paintDraw);

        // Draw all sprites
        lab.draw(paintDraw);
        mageberries.draw(paintDraw);
        fairyessence.draw(paintDraw);
        weaveMoss.draw(paintDraw);
        fireamber.draw(paintDraw);
        toadStool.draw(paintDraw);
        silverdust.draw(paintDraw);
        ogresblood.draw(paintDraw);
        hagsmushroom.draw(paintDraw);
        vampireSoul.draw(paintDraw);
        unicornblood.draw(paintDraw);
        cauldron.draw(paintDraw);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();

        String yes = "yes";
        String no = "no";
        Scanner potions = new Scanner(System.in);

        // If brewing isn't in progress, ask the player for initial inputs
        if (!brewingInProgress) {
            System.out.println("");
            System.out.println("Before you choose the ingredients to brew, would you like to search the spellbook?");
            String book = potions.nextLine().toLowerCase();
            if (book.equals(yes)) {
                mapPick();
            }

            // Patron scenario
            patronPick();
            System.out.println("I seek a draft for this issue:");
            scenario();
            System.out.println("");
            System.out.println("Now, select your ingredients by clicking on them in the panel.");
            brewingInProgress = true; // Start brewing process after the dialogue
        }

        // Check if the click is inside any of the ingredient sprites
        if (mageberries.inside(mouseX, mouseY)) {
            selectedIngredients.add("mageberries");
            System.out.println("Selected Mageberries");
        } else if (fairyessence.inside(mouseX, mouseY)) {
            selectedIngredients.add("fairy essence");
            System.out.println("Selected Fairy Essence");
        } else if (weaveMoss.inside(mouseX, mouseY)) {
            selectedIngredients.add("weavemoss");
            System.out.println("Selected Weavemoss");
        } else if (fireamber.inside(mouseX, mouseY)) {
            selectedIngredients.add("fire amber");
            System.out.println("Selected Fire Amber");
        } else if (toadStool.inside(mouseX, mouseY)) {
            selectedIngredients.add("toadstool");
            System.out.println("Selected Toadstool");
        } else if (silverdust.inside(mouseX, mouseY)) {
            selectedIngredients.add("silver dust");
            System.out.println("Selected Silver Dust");
        } else if (ogresblood.inside(mouseX, mouseY)) {
            selectedIngredients.add("ogres blood");
            System.out.println("Selected Ogres Blood");
        } else if (hagsmushroom.inside(mouseX, mouseY)) {
            selectedIngredients.add("hag's mushroom");
            System.out.println("Selected Hag's Mushroom");
        } else if (vampireSoul.inside(mouseX, mouseY)) {
            selectedIngredients.add("vampire soul");
            System.out.println("Selected Vampire Soul");
        } else if (unicornblood.inside(mouseX, mouseY)) {
            selectedIngredients.add("unicorn blood");
            System.out.println("Selected Unicorn Blood");
        }

        // Check if three ingredients have been selected
        if (selectedIngredients.size() == 3) {
            // Brew the potion
            System.out.println("Brewing potion with: " + selectedIngredients);
            coreGame.patronResponse(selectedIngredients.toArray(new String[0]));
            selectedIngredients.clear();  // Reset the ingredients list for the next potion

            // Ask the player if they want to brew another potion
            System.out.println("Would you like to brew another potion? (yes/no)");
            String repeat = potions.nextLine().toLowerCase();
            if (repeat.equals(yes)) {
                brewingInProgress = false;  // Allow dialogue to repeat when brewing starts again
            } else {
                brewingInProgress = false;  // End the brewing session
                System.out.println("Thank you for brewing! The alchemy session ends here.");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
