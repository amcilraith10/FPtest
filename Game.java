import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Game class for Dnaltrop
 * 
 * @author Abby McIlraith 
 * @version 1.0, 12/13/2022
 */

public class Game {
    public static Player player;
    public Companion companion;
    public static GameObject gameObject;
    
     /** 
     * Constructor for object of class Game
     * @param player
     * @param companion
     * @param gameObject
     */

    public Game() {
        player = new Player("Player", "human", 0, "center");
        companion = new Companion("Companion", "center", "A friendly companion.");
        gameObject = new GameObject("tree", "Park", 1, "A large tree with many branches.");
    }

    /**
     * Main method with game loop
     * @param args
     * @throws InterruptedException
    */
    
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("unnamed", "Human", 0, "center");
        //Companion companion = new Companion("Companion", "center", "This is your friendly companion, to help guide you through Dnaltrop!");
        boolean reachedLevel50 = false;
        boolean reachedLevel100 = false;

    //Game startup and setting the player's name
        System.out.println("Initializing game...");
        //Used this tutorial for doing TimeUnit sleep method with try/catch: https://www.geeksforgeeks.org/timeunit-sleep-method-in-java-with-examples/
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome to Dnaltrop. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome to Dnaltrop, " + name + ".");
        Player.name = name;
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You are currently in the center of an unfamiliar city far into the future. There are many tall buildings around you and a large monument, but you have no idea where you are or how to get home.");
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You can go north, south, east, or west. You can also explore the city by typing explore + the object you want to explore. Explore as many objects as you can to earn skill levels. This will help you later on.");
        System.out.println("You can also end the game at any time by typing quit.");
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("What would you like to do?");

    //Messy game loop time! 
    while(true){
        //credit for how to split a command string into two parts goes to one of my roommates, Sophi Cerda 
        String command = scanner.nextLine();
        String[] words =  command.split("\\s+", 2);

        //Check player's skill level and print out a message if they have reached a new level
        if (GameObject.skillLevel >= 50 && reachedLevel50 == false){
                System.out.println("You have done some good exploring of Dnaltrop so far! Keep exploring to find your way home.");
                reachedLevel50 = true; }
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace(); 
        }
        if (GameObject.skillLevel >= 100 && reachedLevel100 == false) {
            System.out.println("It feels like you're almost home...");
            System.out.println("Sometimes the best directions to go aren't the ones you expect. Try going in a new direction this time...");
            reachedLevel100 = true;
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } }
    
        //Checks if the command is empty or not
        if (command == null || command.length() == 0) {
            System.out.println("Command not recognized. Please use go or quit.");
            return; }
        else {
            String verb = words[0].toLowerCase();
            String noun = "unassigned" ;
            //System.out.println(words.length);
                if (words.length > 1) {
                    noun = words[1].toLowerCase();
                    //System.out.println(verb + noun);
                    }
                    else {
                        System.out.println("Please add a noun to your command.");
                    } 

            //scanner.close();    

     //Detects what command is being used and calls the appropriate method       
        if(verb.equals("go")){
            player.go(noun);}
        
        else if (verb.equals("check")){
            System.out.println("Your skill level is " + GameObject.skillLevel + ".");
            System.out.println("You are currently in the " + player.location + " of Dnaltrop.");
            System.out.println("What would you like to do?");
        }
        
        else if (verb.equals("help")){
            System.out.println("You can go north, south, east, or west. You can explore objects around you by typing explore + the object's name.");
            System.out.println("You can also quit playing at any time by typing quit.");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            System.out.println("What would you like to do?");
        } }
        
        else if(verb.equals("explore")){
            GameObject.explore(noun);
        }

        else if(verb.equals("quit")){
            System.out.println("Thank you for playing Dnaltrop.");
            break;
        }
        else{
            System.out.println("Command not recognized. Please use a recognized command or quit.");   
    }
} } } }