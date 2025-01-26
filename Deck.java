public class Deck {
    private Card[] cards;
    private int size;

    public Deck(String[] ranks, String[] suits, int[] pointValues) {
        size = ranks.length*suits.length;
        this.size = size;
        cards = new Card[size];
        
        int x = 0;
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards[x] = new Card(ranks[i], suit, pointValues[i]);
                x++;
            }
        }
        this.cards = cards;

        shuffle(cards);
    }
    
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }
    
    public int size() {
        return size;
    }
    
    public Card deal() {
        if (size > 0) {
            return cards[size];
            size--;
        }
        else return null;
    }
    
    public String toString() {
        String toPrint = "Undealt cards: \n";
        for (int i = 0; i < size; i++) {
            toPrint += cards[i] + "\n";
        }
        
        toPrint += "Dealt cards: \n";
        for (int i = size; i < cards.length; i++) {
            toPrint += cards[i] + "\n";
        }
    }
}