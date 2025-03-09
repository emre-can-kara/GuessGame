public class GuessGame {
    Player p1;
    Player p2;              //create instances
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();      // creating reference variable aka objects
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);              // creating a target number expecting to be identical with player guesses
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();  // in this stage, each player uses guess behavior in the class they are subjected to
            p3.guess();

            guessp1 = p1.number; // instance variable == guessp1, guess method already randomized the number we should guessp1 = randomized number (p1.number) !
            System.out.println("Betül  guessed: " + guessp1);

            guessp2 = p2.number;
            System.out.println("Emre guessed: " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed: " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Betül got it right?" + p1isRight);
                System.out.println("Emre got it right?" + p2isRight);
                System.out.println("Player three got it right?" + p3isRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }


    }
}
