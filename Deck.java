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
    public Arraylist<Card> getDeck(){
        return deck;
    }

    public void shuffle(){
        Collection.shuffle(deck);
    }

    public String toString(){
        return "Deck(" + ")";
    }
    public static void main(String[]args){
        Deck d = new Deck();
        System.out.println(d.getDeck);
    }
}