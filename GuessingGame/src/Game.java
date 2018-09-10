import java.util.Scanner;


public class Game {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        boolean running = true;
        boolean guessed = true;

        int number = 0;
        int input = 0;
        String input2 = "";



        while(running){

            //input2 = str.nextLine();

            if(guessed) {

                System.out.println("I have chose a random value.");
                System.out.println("Have a go at guessing it.");
                number = getRandom(9);
                guessed = false;
            } else {

                System.out.println("Nope, try again");



            }

            input = sc.nextInt();


            if(input == -1) {
                System.out.println("You have exited the game.");
                running = false;
            } else {
                guessed = (input == number);

                if (guessed) {
                    System.out.println("Correct! Want to play again?");
                    System.out.println("Type yes to play again.");
                    input2 = str.nextLine();

                    if (input2.equals("yes") || input2.equals("Yes")) {
                        System.out.println("New Game:");
                        guessed = true;
                    }else {
                        System.out.println("You have exited the game.");
                        running = false;
                    }

                }
            }

        }


    }


    public static int getRandom(int max) {
        return (int) (Math.random() * max) + 1;


    }


}
