W1 GUESS GAME PROJECT IN HEAD JAVA

Here in this project, I will re-write the code of the very game given by HEAD JAVA. I did so to understand clearly and concisely the data structure in the project. I've seen different ways of approaching creating instances and then later assigning the objects "new Object()" to create references in the memory. 
Here, normally I do like this:

Object object = new Object(); 

However, in the project, the book went like this: 

Player p1; 
Player p2; 
Player p3;

later assigned new object like; 

p1 = new Player();
p2 = new Player();
p3 = new Player(); // under different CLASSES. 

Also, I have learned the path that instance variable was used. 

 p1.guess();
 p2.guess();  // in this stage, each player uses guess behavior in the class they are subjected to
 p3.guess();

  guessp1 = p1.number; // instance variable == guessp1, guess method already randomized the number we should guessp1 = randomized number (p1.number) !
            System.out.println("Betül  guessed: " + guessp1);

  This project have improved my viewpoint of how I see the JAVA structure. 
