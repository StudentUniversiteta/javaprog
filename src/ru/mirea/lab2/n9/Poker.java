package ru.mirea.lab2.n9;


import java.util.*;


public class Poker {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int playerCount = Integer.parseInt(input);
        if (playerCount > 9) {
            throw new  IndexOutOfBoundsException("Количество игроков не может быть больше 9.");
        }

        Deck deck = new Deck();
        deck.Shuffle();

        List<List<Card>> cards = new ArrayList<List<Card>>();
        for (int i = 0; i < playerCount; i++) {
            cards.add(new ArrayList<Card>());
        }
        for (Card card : deck.getDeck()) {
            for (int i = 0; i < playerCount; i++) {
                if (cards.get(i).size() < 5) {
                    cards.get(i).add(card);
                    break;
                }
            }
        }
        for (List<Card> hand : cards) {
            for (Card card : hand) {
                if (card.getRank().equals("10")) {
                    System.out.print(card + "    ");
                }
                else {
                    System.out.print(card + "     ");
                }
            }
            System.out.println();
        }

    }
}


class Deck {
    private final List<Card> deck = new ArrayList<>();
    String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Deck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(i, ranks[j]));
            }
        }
    }

    public void Shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> getDeck() {
        return deck;
    }
}

class Card {
    private final CardSuit suit;
    private final String rank;

    public Card() {
        suit = new CardSuit();
        rank = getRandomRank();
    }

    public Card(int index, String rank){
        suit = new CardSuit(index);
        this.rank = rank;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    private String getRandomRank() {
        Random random = new Random();
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int index = random.nextInt(ranks.length);
        return ranks[index];
    }

    @Override
    public String toString() {
        return "[" + suit.getSuitSymbol() + "][" + rank + "]";
    }
}

class CardSuit {
    private final String suitName;
    private final String suitSymbol;

    private final String[] suitNames = {"Pikes", "Clovers", "Diamonds", "Hearts"};
    private final String[] suitSymbols = {"♠\uFE0F", "♣\uFE0F", "♦\uFE0F", "♥\uFE0F"};

    public CardSuit() {
        Random random = new Random();
        int index = random.nextInt(suitNames.length);
        suitName = suitNames[index];
        suitSymbol = suitSymbols[index];
    }

    public CardSuit(int index){
        suitName = suitNames[index];
        suitSymbol = suitSymbols[index];
    }

    public String getSuitName() {
        return suitName;
    }

    public String getSuitSymbol() {
        return suitSymbol;
    }
}