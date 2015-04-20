public class Node {
    private int x,y;
    private Node prev;
    private double priority;
    private int step;
    
    public Node(int x, int y){
	this.x = x;
	this.y = y;;
    }

    public double getPriority(){
	return priority;
    }
    
    public void setPriority(double p){
	priority = p;
    }

    public int getStep(){
	return step;
    }
    
    public void setStep(int s){
	step=s;
    }
    
    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
    
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }
    
}

