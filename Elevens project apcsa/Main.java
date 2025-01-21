public class Main{
    public static void main(String[] args){
        //CardGameGUI gui = new CardGameGUI(new ElevensBoard());
        //gui.displayGame();

        Card fiveS = new Card("five", "spades", 5);
        Card threeH = new Card("three", "hearts", 3);
        System.out.println(fiveS.getRank());
        System.out.println(fiveS.equal(threeH));
    }
}