
public class Deck {
	private Node top;

	public Deck() {
		top = null;
	}

	public Node getTop() {
		return top;
	}
	
	public Boolean isEmpty(){
		return (top == null ? true : false);
	}
	
	public Boolean isFull(){
		Node temp = new Node();
		return (temp == null ? true : false);
	}
	
	public Node pop(){
		Node data = null;
		if(isEmpty())
			System.out.println("Stack is empty, nothing to pop.");
		else{
			@SuppressWarnings("unused")
			Node temp = top;
			data = top;
			top = top.getNext();
			temp = null;
		}

		return data;
	}
	
	public void push(Node temp){
		if(isFull())
			System.out.println("Stack is currently full, unable to add new node/book");
		else{
			if(isEmpty()){
				top = temp;
			}
			else{
				temp.setNext(top);
				top = temp;
			}
		}
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
	
	public void show() {
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
			
		}
	}
	
	public void destroy(){
		while(pop() != null);
	}
	
}
