public class bst {
    private Node<Integer> l;
    
    public void insert(Node t, int i){
	Node<Integer> temp = new Node<Integer>(i);
	if (t.getData() == i){
	    return;
	}
	if (t.getData() > i){
	    if (t.getLeft() != null){
		insert(t.getLeft(), i);
	    } else {
		t.setLeft(temp);
	    }
	} else {
	    if (t.getRight() != null){
		insert(t.getRight(), i);
	    } else {
		t.setRight(temp);
	    }
	}
    }

    public String toString(){
	String s = "";
	
    }
    public Node search(Node t, int i){
    }
    
}
