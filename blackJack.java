import java.util.Scanner;

/*
 * This is a simple black jack game, so it will use only 1 rule
 * The winner must have the greater amount of card than other player
 * And the total is less equal to 21 to win!
 */

public class blackJack {
    static int playerP = 0;
    static int comP = 0;
    static String blank = "";
    static int choice;
    public static void main(String[] args){
        int roll = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("HI!");
        System.out.println("WELCOME TO BLACKJACK GAME!");
        System.out.println("PLEASE TELL ME YOUR NAME!");
        String userName = input.nextLine();
        System.out.println("HI " + userName + "!");
        System.out.println("LET'S PLAY! (PRESS ENTER)");
        blank = input.nextLine();
        while(playerP <= 21 && comP <= 21){
            System.out.println("WHAT WOULD YOU LIKE TO DO?");
            System.out.print("1. Call\t2. Stop\n");
            choice = input.nextInt();
            if(choice == 1){
                roll = random();
                System.out.println("YOU GOT A");
                checkCard(roll);
                playerP = playerP + roll;
                System.out.println("YOUR CURRENT POINT: " + playerP);
            }
            else if(choice == 2){
                while(comP < playerP){
                    System.out.println("DEALER GOT A");
                    roll = random();
                    checkCard(roll);
                    comP = comP + roll;
                    System.out.println("DEALER CURRENT POINT: " + comP);
                }
                break;
            }
            else{
                System.out.println("PLEASE INPUT THE CORRECT CHOICE");
                choice = 0;
            }
        }
        checkWin();
        input.close();
    }
    /**
     * Function Name: random
     * Inside the function:
     * 1. Give a random number up to 12
     * 2. Support roll
     * @return
     */
    public static int random(){
        double a = Math.random() * 13;
        int b = (int)a;
        if(b == 13){
            b = 12;
        }
        return b;
    }

    /**
     * Function Name: checkWin
     * 
     * Inside the function:
     * 1. Check either the player win, lose or draw
     * 
     */
    public static void checkWin(){
        if(playerP > comP && playerP <= 21 || comP > 21){
            System.out.println("YOU WON!");
        }
        else if(playerP == comP){
            System.out.println("DRAW!");
        }
        else if(comP <= 21 && comP > playerP || playerP > 21){
            System.out.println("YOU LOST!");
        }
    }

    /**
     * Function Name: checkCard
     * Inside the function:
     * 1. Display the card
     * 2. Return it to the parameters
     * @param a
     * @return
     */
    public static int checkCard(int a){
        if(a == 1 || a == 0){
            System.out.print("   _____\n");
            System.out.print("  |A _  |\n");
            System.out.print("  | ( ) |\n");
            System.out.print("  |(_'_)|\n");
            System.out.print("  |  |  |\n");
            System.out.print("  |____V|\n");
        
        }
        else if(a == 2){
            System.out.print("   _____\n");
            System.out.print("  |2    |\n");
            System.out.print("  |  o  |\n");
            System.out.print("  |     |\n");
            System.out.print("  |  o  |\n");
            System.out.print("  |____Z|\n");
        }
        else if(a == 3){
            System.out.print("   _____\n");
            System.out.print("  |3    |\n");
            System.out.print("  | o o |\n");
            System.out.print("  |     |\n");
            System.out.print("  |  o  |\n");
            System.out.print("  |____E|\n");
        }
        else if(a == 4){
            System.out.print("   _____\n");
            System.out.print("  |4    |\n");
            System.out.print("  | o o |\n");
            System.out.print("  |     |\n");
            System.out.print("  | o o |\n");
            System.out.print("  |____h|\n");
        }
        else if(a == 5){
            System.out.print("   _____ \n");
            System.out.print("  |5    |\n");
            System.out.print("  | o o |\n");
            System.out.print("  |  o  |\n");
            System.out.print("  | o o |\n");
            System.out.print("  |____S|\n");
        }
        else if(a == 6){
            System.out.print("   _____ \n");
            System.out.print("  |6    |\n");
            System.out.print("  | o o |\n");
            System.out.print("  | o o |\n");
            System.out.print("  | o o |\n");
            System.out.print("  |____6|\n");
        }
        else if(a == 7){
            System.out.print("   _____ \n");
            System.out.print("  |7    |\n");
            System.out.print("  | o o |\n");
            System.out.print("  |o o o|\n");
            System.out.print("  | o o |\n");
            System.out.print("  |____7|\n");
        }
        else if(a == 8){
            System.out.print("   _____ \n");
            System.out.print("  |8    |\n");
            System.out.print("  |o o o|\n");
            System.out.print("  | o o |\n");
            System.out.print("  |o o o|\n");
            System.out.print("  |____8|\n");
        }
        else if(a == 9){
            System.out.print("   _____ \n");
            System.out.print("  |9    |\n");
            System.out.print("  |o o o|\n");
            System.out.print("  |o o o|\n");
            System.out.print("  |o o o|\n");
            System.out.print("  |____9|\n");
        }
        else if(a == 10){
            System.out.print("   _____ \n");
            System.out.print("  |10  o|\n");
            System.out.print("  |o o o|\n");
            System.out.print("  |o o o|\n");
            System.out.print("  |o o o|\n");
            System.out.print("  |___10|\n");
        }
        else if(a == 11){
            System.out.print("    _____\n");
            System.out.print("  |J  ww|\n");
            System.out.print("  | o {)|\n");
            System.out.print("  |o o% |\n");
            System.out.print("  | | % |\n");
            System.out.print("  |__%%[|\n");
        }
        else if(a == 12){
            System.out.print("    _____\n");
            System.out.print("  |Q  ww|\n");
            System.out.print("  | o {(|\n");
            System.out.print("  |o o%%|\n");
            System.out.print("  | |%%%|\n");
            System.out.print("  |_%%%O|\n");
        }
        else if(a == 13){
            System.out.print("    _____\n");
            System.out.print("  |K  WW|\n");
            System.out.print("  | o {)|\n");
            System.out.print("  |o o%%|\n");
            System.out.print("  | |%%%|\n");
            System.out.print("  |_%%%>|\n");
        }
        return a;
    
    }
}
