
public class handNode {
	private Node data;
	private handNode nextHand;
	
	public handNode() {
		data = null;
		nextHand = null;
	}
	
	public handNode(Node card){
		this.data = card;
		this.nextHand = null;
	}
	
	public handNode(Node data, handNode next) {
		this.data = data;
		this.nextHand = next;
	}
	
	public Node getData() {
		return data;
	}
	
	public void setData(Node data) {
		this.data = data;
	}
	
	public handNode getNext() {
		return nextHand;
	}
	
	public void setNext(handNode next) {
		this.nextHand = next;
	}
	
	@Override
	public String toString() {
		return "handNode [data=" + data + ", next=" + (nextHand == null ? "null" : "not null") + "]";
	}
	
	public void display(){
		System.out.println(toString());
	}
}
