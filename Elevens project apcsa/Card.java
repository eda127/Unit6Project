public class Card {
    private String rank;
    private String suit;
    private int pointValue;

    public Card(String rank, String suit, int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank() {
        return rank;
    }
    public String getSuit() {
        return suit;
    }
    public int getPointValue() {
        return pointValue;
    }

    public boolean equal(Card c) {
        if (this.equals(c)) return true;
        else return false;
    }

    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
