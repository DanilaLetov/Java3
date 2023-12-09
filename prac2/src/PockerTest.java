import java.util.*;

public class PockerTest {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        Stack<String> deckStack = createDeck();
        shuffleDeck(deckStack);

        List<Stack<String>> players = dealCards(deckStack, numPlayers);

        for (Stack<String> player : players) {
            while (!player.isEmpty()) {
                System.out.print(player.pop() + " ");
            }
            System.out.println();
        }
    }

    private static Stack<String> createDeck() {
        Stack<String> deckStack = new Stack<>();
        String[] suits = {"Пики", "Трефы", "Бубны", "Черви"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deckStack.push(rank + " " + suit);
            }
        }

        return deckStack;
    }

    private static void shuffleDeck(Stack<String> deckStack) {
        Collections.shuffle(deckStack);
    }

    private static List<Stack<String>> dealCards(Stack<String> deckStack, int numPlayers) {
        List<Stack<String>> players = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++) {
            Stack<String> playerHand = new Stack<>();
            for (int j = 0; j < 5; j++) {
                playerHand.push(deckStack.pop());
            }
            players.add(playerHand);
        }

        return players;
    }
}
