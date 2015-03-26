public class Driver{
    public static void main(String[] args){
	myQueue<Integer> a = new myQueue<Integer>();
	a.enqueue(10);
	a.enqueue(9);
	a.enqueue(5);
	a.enqueue(8);
	a.enqueue(7);
	System.out.println(a);
    }
}
