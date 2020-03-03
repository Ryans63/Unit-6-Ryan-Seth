import java.util.ArrayList;

public class Deck{
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
        for(String rank; Card.RANK) {
            for (String suit; Card.SUIT) {
                deck.add(new Card(rank, suit));
            }
        }
    }
    public Arraylist<Card>;
}