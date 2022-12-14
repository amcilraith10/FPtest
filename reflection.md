# CSC120-FinalProject

Reflections on final project
This project had a lot of things I didn't anticipate coming up but I learned a lot.

After I made my game loop, I first had trouble figuring out how to split and interpret multiword user input from the command line. My roommate Sophi helped me figure out how to do this so that I could interpret the verb part of the command and match it to a method, as well as the noun part of the command, so it could do what the user wanted (example command: "go south", verb = go, noun =  south) 
I also decided to put the objects for the the terrain into the player class to more easily implement the go method. 

Tried and failed to iterate through an array and an arraylist to match the user input to the instance of the class to recognize and print the right game object description. After a few hours of trying and asking for help I decided to just use an if loop for each GameObjects instance to fix it. I know this isn't the most efficient way to implement this method and I still don't know why this didn't work but I really tried.

Set up help command and quit command. 

Set up hints and special messages for when the player reaches a certain amount of levels. Added time delays for some messages to make the game's flow feel more natural, used a tutorial (referenced in code) to learn how to use try/catch and java TimeUnit sleep method. 

Was going to implement Companion class next but ran out of time.