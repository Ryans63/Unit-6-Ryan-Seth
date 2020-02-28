public class Card{
    public static final String[] RANK = ("A", "K", "Q", "J", "10", "9", "8", "7","6", "5", "4", "3", "2");

    public static final String[] SUIT = ("♧", "♡", "♢", "♤");

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank(){
        return rank;
    }

    public String getSuit(){
        return suit;
    }

    public int compareTo(Object other){

    }
    public String toString(){

    }
}