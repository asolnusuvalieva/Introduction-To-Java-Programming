public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //initialize the cards
        for(int i = 0; i < 52; i++){
            deck[i] = i;
        } //{0, 1, 2, 3, ..., 51}

    }
}
