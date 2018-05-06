package sit.model;

public class Deck {

    private int size;
    private Card[] cards;

    public Deck() {
        this.cards = new Card[52];
        this.size = 52;
        int count = 0;

        for (int a = 0; a < 4; a++) {
            for (int b = 1; b < 14; b++) {
                int suit = -1, rank = -1;
                switch (a) {
                    case 0:suit = Card.SPADES;break;
                    case 1:suit = Card.HEARTS;break;
                    case 2:suit = Card.DIAMONDS;break;
                    case 3:suit = Card.CLUBS;break;
                }

                switch (b) {
                    case 1:rank = Card.ACE;break;
                    case 11:rank = Card.JACK;break;
                    case 12:rank = Card.QUEEN;break;
                    case 13:rank = Card.KING;break;
                    default:rank = b;
                }
                cards[count] = new Card(rank, suit);
                count++;
            }
        }
    }

    /**
     * Return the number of Cards currently in the Deck.
     */
    public int size() {
        return size;
    }

    /**
     * Remove one Card from the Deck and return it.
     */
    public Card deal() {
        size--;
        return cards[size];
    }

    /**
     * Return true if the Deck contains no Cards.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        String cardInDecks = "";
        for (Card c : cards) {
            cardInDecks += c + "\n";
        }
        return cardInDecks;
    }

    /**
     * Randomly rearrange the Cards in the Deck.
     */
    public void shuffle() {
        int rand1 = (int) (Math.random() * (52));
        int rand2 = (int) (Math.random() * (52));
        swap(rand1, rand2);
    }

    public void swap(int a, int b) {
        Card card1 = this.cards[a];
        Card card2 = this.cards[b];

        this.cards[a] = card2;
        this.cards[b] = card1;
    }

    /**
     * Swap the Cards at indices i and j.
     */
    public Card getMaxCard() {
        if (size > 0) {
            Card maxcard = this.cards[0];
            for (int i = 0; i < size; i++) {
                if (this.cards[i].getSuit() > maxcard.getSuit()) {
                    maxcard = this.cards[i];
                } else if (this.cards[i].getSuit() == maxcard.getSuit()) {
                    if (this.cards[i].getRank() > maxcard.getRank()) {
                        maxcard = this.cards[i];
                    }
                }
            }
            return maxcard;
        } else {
            return null;
        }
    }
}
