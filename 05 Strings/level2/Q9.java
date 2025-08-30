import java.util.Scanner;

public class Q9 {

    public static String getComputerChoice() {
        int num = (int)(Math.random() * 3);
        switch (num) {
            case 0: return "Rock";
            case 1: return "Paper";
            default: return "Scissors";
        }
    }

    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) return "Draw";
        if ((user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(String[] results) {
        int userWins = 0, compWins = 0, draws = 0;
        int totalGames = results.length;

        for (String res : results) {
            if (res.equals("User")) userWins++;
            else if (res.equals("Computer")) compWins++;
            else draws++;
        }

        double userPercent = ((double)userWins / totalGames) * 100;
        double compPercent = ((double)compWins / totalGames) * 100;

        String[][] stats = new String[3][3];
        stats[0][0] = "User Wins"; stats[0][1] = String.valueOf(userWins); stats[0][2] = String.format("%.2f%%", userPercent);
        stats[1][0] = "Computer Wins"; stats[1][1] = String.valueOf(compWins); stats[1][2] = String.format("%.2f%%", compPercent);
        stats[2][0] = "Draws"; stats[2][1] = String.valueOf(draws); stats[2][2] = String.format("%.2f%%", ((double)draws/totalGames)*100);

        return stats;
    }

    public static void displayResults(String[] userChoices, String[] compChoices, String[] winners, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < winners.length; i++) {
            System.out.println((i+1) + "\t" + userChoices[i] + "\t" + compChoices[i] + "\t\t" + winners[i]);
        }

        System.out.println("\nSummary:");
        System.out.println("Result\t\tCount\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] userChoices = new String[n];
        String[] compChoices = new String[n];
        String[] winners = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice for game " + (i+1) + " (Rock/Paper/Scissors): ");
            userChoices[i] = sc.nextLine();
            compChoices[i] = getComputerChoice();
            winners[i] = findWinner(userChoices[i], compChoices[i]);
        }

        String[][] stats = calculateStats(winners);
        displayResults(userChoices, compChoices, winners, stats);

        sc.close();
    }
}
