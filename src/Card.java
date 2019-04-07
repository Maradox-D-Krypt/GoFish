import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card {

	private String faceName;
	private String suit;
	private int faceValue;
	private BufferedImage cardImage;
	
	public Card(String suit, String face, int value, BufferedImage card) {
		
		this.suit = suit;
		this.faceName = face;
		this.faceValue = value;
		this.cardImage = card;
	}
	
	
	
	/*
	 * public Card(String suit, String face, int value) {
		
		this.suit = suit;
		this.faceName = face;
		this.faceValue = value;
	}
	 * 
	 * */
	
	
	public String getFaceName() {
		return faceName;
	}



	public void setFaceName(String faceName) {
		this.faceName = faceName;
	}



	public String getSuit() {
		return suit;
	}



	public void setSuit(String suit) {
		this.suit = suit;
	}



	public int getFaceValue() {
		return faceValue;
	}



	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}



	public BufferedImage getCardImage() {
		return cardImage;
	}



	public void setCardImage(BufferedImage cardImage) {
		this.cardImage = cardImage;
	}



	public String toString() {
		
		return faceName + " of " + suit + " with value of " + faceValue;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Card aceOfSpades = new Card("Spades","Ace",14, ImageIO.read(new File("Deck/AS.png")));
		Card queenOfHearts = new Card("Hearts","Queen",12, ImageIO.read(new File("Deck/QH.png")));
		
		System.out.print(aceOfSpades.toString() + "\n\n");
		System.out.print(queenOfHearts.toString());
		
		
		//Create a JFrame to display card
		
		JFrame window = new JFrame("Display for a Card Object");
		window.setSize(900,1200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create a JPanel
		JPanel contentPane = new JPanel(new BorderLayout());
		
		//Create a JLabel
		JLabel cardLabel = new JLabel(new ImageIcon(aceOfSpades.getCardImage()));
		cardLabel.setSize(300,400);
		
		contentPane.add(cardLabel);
		window.add(contentPane);
		
		window.setVisible(true);
		
	}
	
}
