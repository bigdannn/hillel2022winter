import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RunApp {
    public static void main(String[] args) {
        //todo: remove and write code here ...
        System.out.println("First maven project executable jar 10.02.2022 ...");

        List<Card>  cards = new ArrayList<>(52);


            for (Rank r : Rank.values()) {
                for (Suit s : Suit.values()){
                    cards.add(new Card(r, s));
                }
            }

        System.out.println(cards);
        Collections.shuffle(cards);
        System.out.println(cards);
    }
}

class Card {
    public final Suit suit;
    public final Rank rank;
    public final int cost;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
        this.cost = rank.getCost();
    }

    @Override
    public String toString() {
        return String.format("%s%s", rank.getName(), suit.getSymbol());
    }


}
enum Rank {
    Two("2", 2, 2),
    Three("3", 3, 3),
    Four("4", 4, 4),
    Five("5", 5, 5),
    Six("6", 6,6),
    Seven("7", 7, 7),
    Eight("8", 8, 8),
    Nine("9", 9, 9),
    Ten("10", 10, 10),
    Jack("J", 11, 10),
    Queen("Q", 12, 10),
    King("K", 13, 10),
    Ace("A", 14, 11);

    private final String name;
    private final int value;
    private final int cost;

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    Rank(String name, int value, int cost) {
        this.name = name;
        this.value = value;
        this.cost = cost;
    }
}

enum Suit {
    Hearts('♥'),
    Clubs('♣'),
    Spades('♠'),
    Diamonds('♦');

    private final char symbol;

    public char getSymbol() {
        return symbol;
    }

    Suit(char symbol){
        this.symbol = symbol;
    }
}