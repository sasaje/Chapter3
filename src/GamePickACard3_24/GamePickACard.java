package GamePickACard3_24;

public class GamePickACard {
    //Write a program that simulates picking a card from a deck of 52(56) cards.
    //Your program should display the rank (Ace, 2345678910, Jack, Queen, King)
    //And suit (Clubs,Diamonds,Hearts,Spades) of the card.

    public static void main(String[] args) {
        int card = (int)(Math.random()*56);

        switch (card % 56){
            case 0: System.out.println("The card you picked is Ace of Clubs");break;
            case 1: System.out.println("The card you picked is 1 of Clubs");break;
            case 2: System.out.println("The card you picked is 2 of Clubs");break;
            case 3: System.out.println("The card you picked is 3 of Clubs");break;
            case 4: System.out.println("The card you picked is 4 of Clubs");break;
            case 5: System.out.println("The card you picked is 5 of Clubs");break;
            case 6: System.out.println("The card you picked is 6 of Clubs");break;
            case 7: System.out.println("The card you picked is 7 of Clubs");break;
            case 8: System.out.println("The card you picked is 8 of Clubs");break;
            case 9: System.out.println("The card you picked is 9 of Clubs");break;
            case 10: System.out.println("The card you picked is 10 of Clubs");break;
            case 11: System.out.println("The card you picked is Jack of Clubs");break;
            case 12: System.out.println("The card you picked is Queen of Clubs");break;
            case 13: System.out.println("The card you picked is King of Clubs");break;
            case 14: System.out.println("The card you picked is Ace of Diamonds");break;
            case 15: System.out.println("The card you picked is 1 of Diamonds");break;
            case 16: System.out.println("The card you picked is 2 of Diamonds");break;
            case 17: System.out.println("The card you picked is 3 of Diamonds");break;
            case 18: System.out.println("The card you picked is 4 of Diamonds");break;
            case 19: System.out.println("The card you picked is 5 of Diamonds");break;
            case 20: System.out.println("The card you picked is 6 of Diamonds");break;
            case 21: System.out.println("The card you picked is 7 of Diamonds");break;
            case 22: System.out.println("The card you picked is 8 of Diamonds");break;
            case 23: System.out.println("The card you picked is 9 of Diamonds");break;
            case 24: System.out.println("The card you picked is 10 of Diamonds");break;
            case 25: System.out.println("The card you picked is Jack of Diamonds");break;
            case 26: System.out.println("The card you picked is Queen of Diamonds");break;
            case 27: System.out.println("The card you picked is King of Diamonds");break;
            case 28: System.out.println("The card you picked is Ace of Hearts");break;
            case 29: System.out.println("The card you picked is 1 of Hearts");break;
            case 30: System.out.println("The card you picked is 2 of Hearts");break;
            case 31: System.out.println("The card you picked is 3 of Hearts");break;
            case 32: System.out.println("The card you picked is 4 of Hearts");break;
            case 33: System.out.println("The card you picked is 5 of Hearts");break;
            case 34: System.out.println("The card you picked is 6 of Hearts");break;
            case 35: System.out.println("The card you picked is 7 of Hearts");break;
            case 36: System.out.println("The card you picked is 8 of Hearts");break;
            case 37: System.out.println("The card you picked is 9 of Hearts");break;
            case 38: System.out.println("The card you picked is 10 of Hearts");break;
            case 39: System.out.println("The card you picked is Jack of Hearts");break;
            case 40: System.out.println("The card you picked is Queen of Hearts");break;
            case 41: System.out.println("The card you picked is King of Hearts");break;
            case 42: System.out.println("The card you picked is Ace of Spades");break;
            case 43: System.out.println("The card you picked is 1 of Spades");break;
            case 44: System.out.println("The card you picked is 2 of Spades");break;
            case 45: System.out.println("The card you picked is 3 of Spades");break;
            case 46: System.out.println("The card you picked is 4 of Spades");break;
            case 47: System.out.println("The card you picked is 5 of Spades");break;
            case 48: System.out.println("The card you picked is 6 of Spades");break;
            case 49: System.out.println("The card you picked is 7 of Spades");break;
            case 50: System.out.println("The card you picked is 8 of Spades");break;
            case 51: System.out.println("The card you picked is 9 of Spades");break;
            case 52: System.out.println("The card you picked is 10 of Spades");break;
            case 53: System.out.println("The card you picked is Jacks of Spades");break;
            case 54: System.out.println("The card you picked is Queen of Spades");break;
            case 55: System.out.println("The card you picked is King of Spades");
        }
    }
}
