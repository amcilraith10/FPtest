import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Player {
    static String name;//name of the person
    String type;//type of player
    Integer skill;//player's level of skill (points earned)
    static String location;//location of the player on the map

    /**
     * Constructor for object of class Player
     * @param name
     * @param type
     * @param skill
     * @param location
     */
    public Player(String name, String type, int skill, String location){
        this.name = name;
        this.type = "Human";
        this.skill = 0;
        this.location = "center";
    }
static Player player = new Player("unnamed", "Human", 0, "center");

    
    /** 
     * Go method moves the player in the specified direction
     * @param direction the direction the player is moving
     */
    public void go(String direction) {
        String description;
        description = null;
        if(direction.equals("north")){
            player.location = "north";
            System.out.println("You are now in the " + player.location + "ern side of the city.");
            //Used this tutorial for doing TimeUnit sleep method: https://www.geeksforgeeks.org/timeunit-sleep-method-in-java-with-examples/
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            description = "Welcome to North Dnaltrop Park. You are in a large park with a lot of trees, diverse plants, and native grasses. There are glass skybridges up in the trees that you can walk on, and several beautiful fountains. There are also many benches and people walking around.";
            //SkillLevel.skill = SkillLevel.skill + 5;
        }
        else if(direction.equals("south")){
            player.location = "south";
            
            System.out.println("You are now in the " + player.location + "ern side of the city.");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            description = "Welcome to Dnaltrop South Station. You are on a sidewalk in front of a bustling high-speed rail station that connects the city. There are many people walking around, and trains coming and going.";
        }
        else if(direction.equals("east")){
            player.location = "east";
            System.out.println("You are now in the " + player.location + "ern side of the city.");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            description = "Welcome to the East Waterfront. You are on a sidewalk overlooking the city's beautiful river waterfront. There is a bridge ahead of you.";
        }
        else if(direction.equals("west")){
            player.location = "west";
            System.out.println("You are now in the " + player.location + "ern side of the city.");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            description = "Welcome to the Dnaltrop University Campus. You are on a sidewalk in front of a large university campus. It feels like you've been here before.";
        }
        else if (direction.equals("center")){
            player.location = "center";
            description = "Welcome to the Center of Dnaltrop. You are currently in the center of a city far into the future. It is summertime, and from centuries of climate change, the weather is very warm.";
        }
        else if (direction.equals("down")|| (direction.equals("underground"))) {
            if (GameObject.skillLevel >= 100 && (GameObject.hasCoins == true) && (GameObject.hasCard == true)) {
                player.location = "down";
                description = "Welcome to the Underground of Dnaltrop. You are currently in a dimly lit tunnel.";}
            else {
                System.out.println("You are not skilled enough to go underground yet. Keep exploring the city and come back later.");
            }
        }
        else if (direction.equals("up")) {
        System.out.println("This might be the future, but humans still can't fly.");
        }

        else {
            System.out.println("Direction not recognized. Please use north, south, east, and west to explore the map.");
        }

        //print description and prompt user to explore
        System.out.println(description);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("What would you like to explore?");
    }
   }