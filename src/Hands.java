
public class Hands {
	private handNode head;
	private Deck data;
	
	public Hands() {
		head = null;
		data = null;
	}

	
	public handNode getHead() {
		return head;
	}

	
	public void setHead(handNode head) {
		this.head = head;
	}
	
	
	public boolean isEmpty() {
		return(head == null) ? true : false;
	}
	
	
	@SuppressWarnings("unused")
	public boolean isFull() {
		Node temp = new Node();
		if(temp == null)
			return true;
		else {
			temp = null;
			return false;
		}
	}
	
	//Accepts card from deck/dealer
	public void insert(Node deck) {
		if(isFull())
			System.out.println("List is full");
		else {
			handNode next = new handNode(deck);
			if(isEmpty())
				head = next;
			else {
				handNode temp = head;
				while(temp.getNext() != null)
					temp = temp.getNext();
				temp.setNext(next);
			}
		}
	}
	
	/*
	//Check in hand if there are any pairs
	public Card checkForPairs() {
		Card card = null;
		if(!isEmpty()) {
			Node temp = head;
			while(temp != null) {
				
				//Take each cards and compare them to each other to see if there are any pairs
				if(temp.getData().getFaceName().equalsIgnoreCase(key) || temp.getData().getColor().equalsIgnoreCase(key) || temp.getData().getLicenseNo().equalsIgnoreCase(key)) {
					card = temp.getData();
					break;
				}
				temp = temp.getNext();
			}
		}
		return card;
	}
	
	
	
	public Card checkForPairsV2(Card card) {
		Card data = null;
		int pair = 0;
		if(!isEmpty()) {
			Node temp = head;
			while(temp != null) {
				
				String FaceName = temp.getData().getFaceName();						
				temp = temp.getNext();
				
				//Check if card is equal to the first one chosen 
				if(temp.getData().getFaceName().equalsIgnoreCase(FaceName)) {
					System.out.print("There is a pair");
					pair++;
					break;
				}
				else {
					System.out.print("There is no pair");
				}
			}
		}
		return data;
	}
	
	*/
	
	public boolean remove() {
		if(isEmpty()) {
			System.out.println("Nothing to remove");
			return false;
		}
		else {
			if(head.getNext() == null)
				head = null;
			else {
				handNode temp = head.getNext();
				head = temp;
			}
			return true;
		}
	}
	
	
	public void destroy() {
		while(remove());
	}
	
	
	public void show() {
		if(isEmpty())
			System.out.println("Nothing to show");
		else {
			handNode temp = head;
			while(temp != null) {
				temp.display();
				temp = temp.getNext();
			}
		}
	}

	
}

