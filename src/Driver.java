import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Driver {

	public static void main(String[] args) throws IOException {

		Card[] cards = new Card[]{
				
				new Card(1, "Heart", "Ace", ImageIO.read(new File("Deck/AH.png"))),
				new Card(1, "Spade", "Ace", ImageIO.read(new File("Deck/AS.png"))),
				new Card(1, "Diamond", "Ace", ImageIO.read(new File("Deck/AD.png"))),
				new Card(1, "Club", "Ace", ImageIO.read(new File("Deck/AC.png"))),
				
				new Card(2, "Heart", "Two", ImageIO.read(new File("Deck/2H.png"))),
				new Card(2, "Spade", "Two", ImageIO.read(new File("Deck/2S.png"))),
				new Card(2, "Diamond", "Two", ImageIO.read(new File("Deck/2D.png"))),
				new Card(2, "Club", "Two", ImageIO.read(new File("Deck/2C.png"))),
				
				new Card(3, "Heart", "Three", ImageIO.read(new File("Deck/3H.png"))),
				new Card(3, "Spade", "Three", ImageIO.read(new File("Deck/3S.png"))),
				new Card(3, "Diamond", "Three", ImageIO.read(new File("Deck/3D.png"))),
				new Card(3, "Club", "Three", ImageIO.read(new File("Deck/3C.png"))),
				
				new Card(4, "Heart", "Four", ImageIO.read(new File("Deck/4H.png"))),
				new Card(4, "Spade", "Four", ImageIO.read(new File("Deck/4S.png"))),
				new Card(4, "Diamond", "Four", ImageIO.read(new File("Deck/4D.png"))),
				new Card(4, "Club", "Four", ImageIO.read(new File("Deck/4C.png"))),
				
				new Card(5, "Heart", "Five", ImageIO.read(new File("Deck/5H.png"))),
				new Card(5, "Spade", "Five", ImageIO.read(new File("Deck/5S.png"))),
				new Card(5, "Diamond", "Five", ImageIO.read(new File("Deck/5D.png"))),
				new Card(5, "Club", "Five", ImageIO.read(new File("Deck/5C.png"))),
				
				new Card(6, "Heart", "Six", ImageIO.read(new File("Deck/6H.png"))),
				new Card(6, "Spade", "Six", ImageIO.read(new File("Deck/6S.png"))),
				new Card(6, "Diamond", "Six", ImageIO.read(new File("Deck/6D.png"))),
				new Card(6, "Club", "Six", ImageIO.read(new File("Deck/6C.png"))),
				
				new Card(7, "Heart", "Seven", ImageIO.read(new File("Deck/7H.png"))),
				new Card(7, "Spade", "Seven", ImageIO.read(new File("Deck/7S.png"))),
				new Card(7, "Diamond", "Seven", ImageIO.read(new File("Deck/7D.png"))),
				new Card(7, "Club", "Seven", ImageIO.read(new File("Deck/7C.png"))),
				
				new Card(8, "Heart", "Eight", ImageIO.read(new File("Deck/8H.png"))),
				new Card(8, "Spade", "Eight", ImageIO.read(new File("Deck/8S.png"))),
				new Card(8, "Diamond", "Eight", ImageIO.read(new File("Deck/8D.png"))),
				new Card(8, "Club", "Eight", ImageIO.read(new File("Deck/8C.png"))),
				
				new Card(9, "Heart", "Nine", ImageIO.read(new File("Deck/9H.png"))),
				new Card(9, "Spade", "Nine", ImageIO.read(new File("Deck/9S.png"))),
				new Card(9, "Diamond", "Nine", ImageIO.read(new File("Deck/9D.png"))),
				new Card(9, "Club", "Nine", ImageIO.read(new File("Deck/9C.png"))),
				
				new Card(10, "Heart", "Ten", ImageIO.read(new File("Deck/10H.png"))),
				new Card(10, "Spade", "Ten", ImageIO.read(new File("Deck/10S.png"))),
				new Card(10, "Diamond", "Ten", ImageIO.read(new File("Deck/10D.png"))),
				new Card(10, "Club", "Ten", ImageIO.read(new File("Deck/10C.png"))),
				
				new Card(11, "Heart", "Jack", ImageIO.read(new File("Deck/JH.png"))),
				new Card(11, "Spade", "Jack", ImageIO.read(new File("Deck/JS.png"))),
				new Card(11, "Diamond", "Jack", ImageIO.read(new File("Deck/JD.png"))),
				new Card(11, "Club", "Jack", ImageIO.read(new File("Deck/JC.png"))),
				
				new Card(12, "Heart", "Queen", ImageIO.read(new File("Deck/QH.png"))),
				new Card(12, "Spade", "Queen", ImageIO.read(new File("Deck/QS.png"))),
				new Card(12, "Diamond", "Queen", ImageIO.read(new File("Deck/QD.png"))),
				new Card(12, "Club", "Queen", ImageIO.read(new File("Deck/QC.png"))),
				
				new Card(13, "Heart", "King", ImageIO.read(new File("Deck/KH.png"))),
				new Card(13, "Spade", "King", ImageIO.read(new File("Deck/KS.png"))),
				new Card(13, "Diamond", "King", ImageIO.read(new File("Deck/KD.png"))),
				new Card(13, "Club", "King", ImageIO.read(new File("Deck/KC.png"))),
		};
		
				//Deck Object
				Deck deck = new Deck();
				Hands hand = new Hands();
				Node node = new Node();
				
				//Shuffles the deck
				deck.Shuffle(cards);
		
				//Insert the cards from the array into the Deck linear list
				for(Card card : cards)
					deck.push(new Node(card));
				
				
				deck.show();
				System.out.println("\n");
				
				
				hand.insert(deck.pop());
				hand.insert(deck.pop());
				hand.insert(deck.pop());
				hand.insert(deck.pop());
				hand.show();
				

	}

}
