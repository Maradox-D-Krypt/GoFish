
public class Deck {
	private Node head;
	
	
	public Deck() {
		head = null;
	}

	
	public Node getHead() {
		return head;
	}

	
	public void setHead(Node head) {
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
	
	public void insert(Card card) {
		if(isFull())
			System.out.println("List is full");
		else {
			Node next = new Node(card);
			if(isEmpty())
				head = next;
			else {
				Node temp = head;
				while(temp.getNext() != null)
					temp = temp.getNext();
				temp.setNext(next);
			}
		}
	}
	
	
	public Card retrieve(int value) {
		Card data = null;
		if(!isEmpty()) {
			Node temp = head;
			while(temp != null) {
				if(temp.getData().getFaceValue() == value){
					data = temp.getData();
					break;
				}
				temp = temp.getNext();
			}
		}
		return data;
	}
	
	public void Shuffle(Object[] array) {
		
		int noOfCards = array.length;
		
		for(int i = 0; i < noOfCards; i++) {
			
			int s = i + (int)(Math.random() * (noOfCards - i));
			
			Object temp = array[s];
			array[s] = array[i];
			array[i] = temp;
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
				Node temp = head.getNext();
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
			Node temp = head;
			while(temp != null) {
				temp.display();
				temp = temp.getNext();
			}
		}
	}
	
}

