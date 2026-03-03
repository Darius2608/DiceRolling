import java.util.*;
public class DiceRolling {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Random random = new Random();
        int total = 0;
        System.out.print("enter number of dice you want to roll: ");
        int numdice = scanner.nextInt();
        if(numdice>0){
            for(int i = 0; i<numdice; i++){
                int roll = random.nextInt(1,7);
                printdie(roll);
                System.out.println("you rolled: " + roll);
                total += roll;
            }
            System.out.println("total: " + total);
        }
        else{
            System.out.println("number of dice must be greater than 0");
        }



    }
    static void printdie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("invalid roll");

        }

    }
}
            
