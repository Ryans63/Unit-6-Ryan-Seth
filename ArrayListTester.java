import java.util.ArrayList;

public class ArrayListTester{
    public static void main(String[] args) {

        public static void removeZeros(ArrayList<Integer> list) {
            for(int i = 0){
                E remove int(i);
            }
        }

        System.out.println("Test Remove Zeros");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,1,4,0,6,0));
        System.out.println("Starting List: " + nums);
        removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);

        System.out.println();

        public int countLetters(ArrayList list) {
            int sum = 0;
            for(int i = 0; i < list.size(); i++){
                sum += list.get(i).length;
            }
            return sum;
        }

            ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
        System.out.println("Test Letter Counter:");
        System.out.println(words);
        System.out.println("Expected: 18 \n Actual: " + countLetters(words));

        System.out.println();


        public findPosition(keyValue, list){
            int keyValue = 3;
            for(int i = 0; i < list.size(); i++){
                if(int[i] = keyValue)
                    return keyValue;
                else
                    return -1;
            }
        }
        
        System.out.println("Test keyPosition: find a 1");
        System.out.println(nums);
        System.out.println("Expected: 2 \n Actual: " + findPosition(1, nums));

        System.out.println();
        
        public parseIntoArrayList(){
            for(int i = 0; i < list.size(); i++){
                return int[i] + " "
            }    
        }

        System.out.println("Test parse into array");
        System.out.println("Expected: [W, e, s, t, , L, i, n, n] \n Actual: " + parseIntoArrayList("West Linn"));

        System.out.println();
        
        public findMin(){
         for(int i = 0; i < list.size(); i++){
             if(int[i] = myAge)
                    int [i] = this.name
                 return Name;
         }
        }

        System.out.println("Test FindMin for Personobjects");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person(32, "Abe"),
                new Person(14, "Betty"), new Person(18, "Cris")));
        System.out.println(people);
        System.out.println("Expected: BETTY \n Actual: " + findMin(people));

        System.out.println();
        public class Coin { 
 
private double myValue; 
private String myName; 
 
public Coin(double value, String name) { 
myValue = value; 
myName = name; 
} 
 
public double getValue() { 
return myValue; 
} 
 
public String getName() { 
return myName;
} 
 
// returns true if this coin is equal to aCoin, 
// which means the name and the value are both equal 
public boolean equals(Coin aCoin) { 
    if (this.coin = aCoin)
        return true;
}
} 

        public class Purse {
    private ArrayList coins;

    public Purse() {
        coins = new ArrayList();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        return total;
    }

    // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
    public int count(Coin aCoin) {
        if(myName = myValue)
            return Coin;
        if(Coin = aCoin)
            return aCoin;
    }

        

        System.out.println("Purse Test:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.25, "quarter"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.25, "quarter"));

        System.out.println(myPurse);
        System.out.println("# of Quarters = " + myPurse.count(new Coin(.25, "quarter")));
        System.out.println("Smallest Coin = " + myPurse.findSmallest());
        System.out.println("Total of Purse = $" + myPurse.getTotal());

    }
}
