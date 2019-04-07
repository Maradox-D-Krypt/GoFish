
public class Node {
	private Card data;
	private Node next;
	
	public Node() {
		data = null;
		next = null;
	}
	
	public Node(Card card){
		this.data = card;
		this.next = null;
	}
	
	public Node(Card data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Card getData() {
		return data;
	}
	
	public void setData(Card data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + (next == null ? "null" : "not null") + "]";
	}
	
	public void display(){
		System.out.println(toString());
	}
}
