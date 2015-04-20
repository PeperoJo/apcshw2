public class Coor{
    private int x;
    private int y;
    private Coor prev;
    public Coor(int n, int m, Coor o){
	x= n;
	y = m;
	prev = o;
    }
    public Coor(int n, int m){
	x= n;
	y = m;
	prev = null;
    }
    public Coor getPrev(){
	return prev;
    }
    public int getX(){
	return x;
    }
    public int getY(){
	return y;
    }
      

}