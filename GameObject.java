import java.lang.reflect.Array;  
import java.util.ArrayList;
import java.util.*;

/**
 * This class creates the game objects that the player can interact with.
 */
public class GameObject {
    static String name;
    String location;
    Integer objectSkillLevel; //object skill level
    static Integer skillLevel; //player skill level
    String objectDescription;
    //static ArrayList<GameObject> objects = new ArrayList<GameObject>();
    static Boolean hasCard;
    static Boolean hasCoins;

/**
 * Constructor for GameObject class members
 * @param name
 * @param location
 * @param objectSkillLevel
 * @param objectDescription
 */
public GameObject(String name, String location, Integer objectSkillLevel, String objectDescription) {
    this.name = name;
    this.location = location;
    this.objectSkillLevel = objectSkillLevel;
    GameObject.skillLevel = 0;
    this.objectDescription = objectDescription;
    //GameObject.objects.add(this); 
}

//Let's make some game objects!
 
//north objects
static GameObject fountain = new GameObject("fountain", "north", 99, "You see a beautiful fountain. It is made of glass and seems almost alive with bursts of water and lights. You see a few coins at the bottom of the fountain.");
static GameObject coins = new GameObject("coins", "north", 20, "You see a few coins at the bottom of the fountain. They are relics of old times before currency was digital. You fish them out of the nice cool water and put the chilled metal in your pocket.");
static GameObject bench = new GameObject("bench", "north", 3, "You see a bench. It is made of metal and has a beautiful design. It is sitting in the shade of one of the skybridges and the metal is surprisingly cool for a hot day. You sit down and relax for a moment.");
static GameObject skybridge = new GameObject ("bridge", "north", 2, "You see a skybridge. It is made of glass and is very high up in the trees. You walk up it and look down at the park below. You see a few people walking around or sitting in the cooler shade of the trees.");
static GameObject tree  = new GameObject ("tree", "north", 1, "You see a tree. It is very tall and has a lot of branches. You look up at the skybridge and see a few people walking around.");

//east objects
static GameObject bridge = new GameObject("bridge", "east", 2, "You see a bridge. It is made of metal and is very new. It has tracks for high-speed rail and paths for pedestrians. You walk across it and look down at the sparkling river below.");
static GameObject river = new GameObject("river", "east", 1, "You see a river. It is very beautiful and the water sparkles in the sun. People are swimming in the water down below to escape the heat. You look up at the bridge and see a few people walking around. A high-speed train passes by.");
static GameObject train = new GameObject("train", "east", 5, "You see a high-speed train. It is very fast. You cannot board this train."); 

//south objects
static GameObject station = new GameObject("station", "south", 3, "You see a high-speed rail station. It is very large and has several platforms, as well as trains and people moving through it. You spot a small card on the ground.");
static GameObject card = new GameObject("card", "south", 30, "You see a small card on the ground near the train tracks. It is a shiny metro card made of metal. You pick it up and put it in your pocket.");
static GameObject tracks = new GameObject("tracks", "south", 1, "Watch out! These tracks are dangerous if a train is coming. Stand clear!");
static GameObject platform = new GameObject("platform", "south", 1, "You see a train platform. It is very large and has many people moving through it.");

//west objects
static GameObject campus = new GameObject("campus", "west", 5, "You are on the campus of Dnaltrop University. It is very large and has many old and new academic buildings along a path. The campus is mostly quiet, because students are gone on summer vacation. You see a large holographic statue of the university's mascot, the Dnaltrop Dragon, in the center of the campus.");
static GameObject statue = new GameObject("statue", "west", 30, "You see a large holographic statue of the university's mascot, the Dnaltrop Dragon. You watch the hologram for a moment and see the dragon breathing colorful pulses of fire.");
static GameObject path = new GameObject("path", "west", 1, "You see a path. It is made of stone and goes straight through campus. You walk down it and see a large quad in the distance.");
static GameObject quad = new GameObject("quad", "west", 1, "You are in the quad, where Dnaltrop University students live. It is summertime, so there aren't very many students here.");

//underground objects
static GameObject tunnel = new GameObject("tunnel", "down", 0, "You see a tunnel. It is very dark and you can barely see anything. The air is cool and wet. You start walking down the tunnel and see a small amount of yellow light at the end.");
static GameObject light = new GameObject("light", "down", 0, "You see a small amount of yellow light at the end of the tunnel. You walk towards it. It is an old lamp attached to the wall of the tunnel. There is an old wooden door a few feet ahead at the end of the tunnel.");
static GameObject door = new GameObject("door", "down", 0, "You see an old wooden door and knock. There is no answer. You try the handle. It is unlocked and swings open on rusty hinges. You suddenly remember where you are and everything around you is abruptly familiar.");

//center objects
static GameObject monument = new GameObject("monument", "center", 5, "You see a towering glass monument in the middle of the city's center square. It almost seems to be emerging from the earth itself and it reflects the summer sunlight in millions of directions. You walk up to it and see it has four corners pointing to the north, south, east, and west sides of the city.");

//STUFF THAT DOESN'T WORK
//static GameObject[] objectsArray = {fountain, coins, bench, skybridge, tree, bridge, river, train, station, card};
//ArrayList<GameObject> objectsArrayList = new ArrayList<GameObject>();
//    objectsArrayList.add("fountain");


/** 
 * Explore method allows player to explore a game object and updates skill levels accordingly
 * @param name the name of the game object that the player wants to explore
 */
public static void explore(String name) {
    //STUFF THAT DOESN'T WORK
    //Integer skillLevel;
    //String objectDescription;
    //for (int i = 0; i < GameObject.getLength(); i++) {
    //    if (name.equals(objectsArray[i].name)) {
    //        System.out.println(GameObject.objectsArray[i].name);
    //        objectDescription = objectsArray[i].objectDescription;
    //System.out.println("You are now exploring the " + name + ".");
    //System.out.println(objectDescription);
    //skill = SkillLevel.skill + objectSkillLevel;
    //System.out.println("You have earned " + objectSkillLevel + " points.");
    //System.out.println("Your total skill level is now " + skill + ".");
    
    //STUFF THAT ALSO DOESN'T WORK
    //name = name.toLowerCase();
   //String object = name;
   //object = GameObject.name;
   //System.out.println(object);
   
   if (name.equals("fountain") && (fountain.location.equals(Player.location))) {
       System.out.println(fountain.objectDescription);
       System.out.println("You have earned " + fountain.objectSkillLevel + " points.");
       skillLevel = skillLevel + fountain.objectSkillLevel;
       System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("coins") && (coins.location.equals(Player.location))) {
        System.out.println(coins.objectDescription);
        System.out.println("You have earned " + coins.objectSkillLevel + " points.");
        skillLevel = skillLevel + coins.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
        hasCoins = true;
    }
    else if (name.equals("bench") && (bench.location.equals(Player.location))) {
        System.out.println(bench.objectDescription);
        System.out.println("You have earned " + bench.objectSkillLevel + " points.");
        skillLevel = skillLevel + bench.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("skybridge") && (skybridge.location.equals(Player.location))) {
        System.out.println(skybridge.objectDescription);
        System.out.println("You have earned " + skybridge.objectSkillLevel + " points.");
        skillLevel = skillLevel + skybridge.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("tree") && (tree.location.equals(Player.location))) {
        System.out.println(tree.objectDescription);
        System.out.println("You have earned " + tree.objectSkillLevel + " points.");
        skillLevel = skillLevel + tree.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("bridge") && (bridge.location.equals(Player.location))) {
        System.out.println(bridge.objectDescription);
        System.out.println("You have earned " + bridge.objectSkillLevel + " points.");
        skillLevel = skillLevel + bridge.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("river") && (river.location.equals(Player.location))) {
        System.out.println(river.objectDescription);
        System.out.println("You have earned " + river.objectSkillLevel + " points.");
        skillLevel = skillLevel + river.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("train") && (train.location.equals(Player.location))) {
        System.out.println(train.objectDescription);
        System.out.println("You have earned " + train.objectSkillLevel + " points.");
        skillLevel = skillLevel + train.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("station") && (station.location.equals(Player.location))) {
        System.out.println(station.objectDescription);
        System.out.println("You have earned " + station.objectSkillLevel + " points.");
        skillLevel = skillLevel + station.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("card") && (card.location.equals(Player.location))) {
        System.out.println(card.objectDescription);
        System.out.println("You have earned " + card.objectSkillLevel + " points.");
        skillLevel = skillLevel + card.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
        hasCard = true;
    }
    else if (name.equals("tracks") && (tracks.location.equals(Player.location))) {
        System.out.println(tracks.objectDescription);
        System.out.println("You have earned " + tracks.objectSkillLevel + " points.");
        skillLevel = skillLevel + tracks.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("platform") && (platform.location.equals(Player.location))) {
        System.out.println(platform.objectDescription);
        System.out.println("You have earned " + platform.objectSkillLevel + " points.");
        skillLevel = skillLevel + platform.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("campus") && (campus.location.equals(Player.location))){
        System.out.println(campus.objectDescription);
        System.out.println("You have earned " + campus.objectSkillLevel + " points.");
        skillLevel = skillLevel + campus.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("statue") && (statue.location.equals(Player.location))) {
        System.out.println(statue.objectDescription);
        System.out.println("You have earned " + statue.objectSkillLevel + " points.");
        skillLevel = skillLevel + statue.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("path") && (path.location.equals(Player.location))) {
        System.out.println(path.objectDescription);
        System.out.println("You have earned " + path.objectSkillLevel + " points.");
        skillLevel = skillLevel + path.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("quad") && (quad.location.equals(Player.location))) {
        System.out.println(quad.objectDescription);
        System.out.println("You have earned " + quad.objectSkillLevel + " points.");
        skillLevel = skillLevel + quad.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("tunnel") && (tunnel.location.equals(Player.location))) {
        System.out.println(tunnel.objectDescription);
        System.out.println("You have earned " + tunnel.objectSkillLevel + " points.");
        skillLevel = skillLevel + tunnel.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("light") && (light.location.equals(Player.location))) {
        System.out.println(light.objectDescription);
        System.out.println("You have earned " + light.objectSkillLevel + " points.");
        skillLevel = skillLevel + light.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("door") && (door.location.equals(Player.location))) {
        System.out.println(door.objectDescription);
        skillLevel = skillLevel + door.objectSkillLevel;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You are a part of Dnaltrop's oldest families who still lives underground to escape the heat of the earth's surface. Relief washes over you as you hear the sounds of your loved ones in the next room. You walk through the door and close it behind you. You are home.");
        System.out.println("Ending skill level: " + skillLevel + " points.");
        System.out.println("___________________________________");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thank you for playing Dnaltrop, "+ Player.name + ". Welcome home.");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        System.out.println("___________________________________");
        }
        System.exit(0);
    }

    else if (name.equals("monument") && monument.location.equals(Player.location)){
        System.out.println(monument.objectDescription);
        System.out.println("You have earned " + monument.objectSkillLevel + " points");
        skillLevel = skillLevel + monument.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else {
        System.out.println("You can't explore that.");
    }
} }