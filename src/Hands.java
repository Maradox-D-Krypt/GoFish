
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
	
	
	//accept a card and search through hand
	public boolean checkForPairs(Node card) {
		
		boolean pair = false;
		if(!isEmpty()) {
			handNode temp = head;
			while(temp != null) {
				temp = temp.getNext();
				//Take each cards and compare them to each other to see if there are any pairs
				if(temp.getData().getData().getFaceName().equalsIgnoreCase(card.getData().getFaceName())) {
					System.out.print("\nThere is a match");
					break;
				}
				else {
					System.out.print("No match");
					pair = false;
				}
			}
		}
		return pair;
		
	}
	
	
	public void sortHand() {
		
		if(!isEmpty()) {
			handNode temp = head;
			while(temp != null) {
				
				if(temp.getData().getData().getFaceValue() > (temp.getNext().getData().getData().getFaceValue())) {
					
				//	int temp1 = temp.getNext();
					
				}
			}
		}
	}
	
	
	//Check in hand if there are any pairs
	public void checkForPairsV2() {
		
		Node node = null;
		boolean pair;
		
		if(!isEmpty()) {
			handNode temp = head;
			handNode temp1 = null;
			while(temp != null) {
			
				if(temp.getData().getData().getFaceName().equalsIgnoreCase(temp.getNext().getData().getData().getFaceName())) {
					temp1 = temp.getNext().getNext();
					System.out.println("\n\nThere is a present");
					if(temp1 == null) {
						temp = temp.getNext();
						temp = null;
					}
					
				}else {
					temp = temp.getNext();
					System.out.println("\n\nNo Pair");
				}					
			}
		}
	}
	
	
	
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

