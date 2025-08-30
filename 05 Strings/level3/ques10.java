import java.util.Scanner;

public class ques10 {

    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                           "Jack", "Queen", "King", "Ace" };

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int numCards) {
        if (numPlayers * numCards > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] players = new String[numPlayers][numCards];
        int cardIndex = 0;

        for (int i = 0; i < numCards; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[cardIndex++];
            }
        }

        return players;
    }

    public static void printPlayersCards(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int numCards = sc.nextInt();

        String[][] players = distributeCards(deck, numPlayers, numCards);
        printPlayersCards(players);

        sc.close();
    }
}
