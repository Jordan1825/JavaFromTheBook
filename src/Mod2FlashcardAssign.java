import java.util.Scanner;

public class Mod2FlashcardAssign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Flashcard card1 = new Flashcard("Java's starting method", "main", "Java Basics");
        Flashcard card2 = new Flashcard("Keyword for no return value", "void", "Java Basics");
        Flashcard card3 = new Flashcard("Java's starting method", "main", "ReviewDeck");

        card1.setHint("Every program starts here");
        card2.setDifficulty(4);
        card3.setDifficulty(9);  // should be rejected so stays 4

        Flashcard[] deck = {card1, card2};
        for (int i = 0; i < deck.length; i++) {
            Flashcard card = deck[i];
            System.out.println("Card " + (i + 1) + ": " + card.getCurrentSide());
            System.out.print("Your answer: ");
            String answer = input.nextLine();

            if (card.checkAnswer(answer)) {
                System.out.println("Correct!");
            } else {
                card.flip();
                System.out.println("Not quite. The answer is:" + card.getCurrentSide());
            }
        }

        card2.toggleStar();

        System.out.println();
        System.out.println(card1);
        System.out.println(card2);

        System.out.println();
        System.out.println("Card 1 equals card 3? " + card1.equals(card3));
        System.out.println("Card1 equals card2?" + card1.equals(card2));
    }
}
