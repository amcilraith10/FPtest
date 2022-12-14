
//Got rid of this class and implemented it into the GameObject class.
public class Terrain {
    public String name;
    public String location;
    public String description;
    //public Integer pointsEarned;

/**
 * Constructor for objects of Terrain class
 * @param name
 * @param location
 * @param description
 */
public Terrain(String name, String location, String description, int pointsEarned) {
    this.name = name;
    this.location = location;
    this.description = description;
    //this.pointsEarned = pointsEarned;
}

//Let's make some terrain objects!
Terrain center = new Terrain("Center", "center", "Welcome to the Center of Dnaltrop. You are currently in the center of a city far into the future. There are many tall buildings around you.", 5);
Terrain park = new Terrain("Park", "north", "Welcome to North Dnaltrop Park. You are in a large park with a lot of trees, diverse plants, and native grasses. There are glass skybridges up in the trees that you can walk on, and several beautiful fountains. There are also many benches and people walking around.", 5);
Terrain waterfront = new Terrain("Waterfront", "east", "Welcome to the East Waterfront. You are on a sidewalk overlooking the city's beautiful river waterfront. There is a bridge ahead of you.", 5);

}
