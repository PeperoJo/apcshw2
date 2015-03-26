public class myQueue<E>{
    Node<E> front,back;
    

    public myQueue(){
	front = new Node<E>();
	back = new Node<E>();
	front.setNext(back);
    }

    public String toString(){
	String result = "";
	Node<E> temp = front.getNext();
	while(temp != back){
	    temp = temp.getNext();
	    result = result + temp.getData() + "--->";
	}
	return result;
    }
    
    public void enqueue(E data){
        Node<E> temp = new Node<E>(data);
	back.setNext(temp);
	back = temp;
    }

    /*public E dequeue(){
       
        // remove and return the head/front item from the stack
	}*/

    public boolean empty(){
	return front == null;
    }

    public E head() {
        return front.getNext().getData();
    }
}
