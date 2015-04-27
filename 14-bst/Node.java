public class Node<E>{
    private E data;
    private Node<E> left,right,parent;
    
    public Node (E s){
	data = s;
	left = null;
	right = null;
	parent = null;
    }
    public void setData(E s){
	data = s;
    }
    public E getData(){
	return data;
    }
    public void setLeft(Node<E> n){
	left = n;
    }
    public void setRight(Node<E> n){
	right = n;
    }
    public void setParent(Node<E> n){
	parent = n;
    }
    public void getLeft(){
	return left;
    }
    public void getRight(){
	return right;
    }
    public void getParent(){
	return parent;
    }
    public String toString(){
	return ""+data;
    }
}

