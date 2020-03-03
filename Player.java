public class Player{
    private int id;
    private ArrayList<Card> hand;
    private Deck theDeck;

    public player(int id, Deck deck){
        this.id = id;
        theDeck = deck;
    }

}