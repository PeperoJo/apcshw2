mport java.io.*;
import java.util.*;

public class Maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
    
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public Maze() 
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
	
	try {
	    
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
	
    }

    public String toString()
    {
	String s = "\n";
	
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    public void copy(char[][] something){
	for(int r = 0; r<board.length; r++){
	    for (int c = 0 ;c<board[0].length;c++){
		something[r][c]=board[r][c];
	    }
	}
    }

    public void solve(int x, int y){
	
	char[][] blah = new char[board.length][board[0].length];
	copy(blah);
	delay(1000);
	Coor current = new Coor(x,y);
	myStack<Coor> q = new myStack<Coor>(current);
	Coor exit = null;
	   

	while (!q.empty()){
	    System.out.println(this); 
	    delay(10);
	    current = q.pop();
	    int xval = current.getX();
	    int yval = current.getY();
	        
	    if(yval>0 && (board[xval][yval-1] == '#' ||  board[xval][yval-1] == '$')){
		if (board[xval][yval-1] == '$'){
		    exit = new Coor(xval,yval-1,current);
		    break;
		}
		q.push(new Coor(xval,yval-1,current));
		
	    }
	    if(xval < board.length && (board[xval+1][yval] == '#' || board[xval+1][yval] == '$')){
		if (board[xval+1][yval] == '$'){
		    exit = new Coor(xval+1,yval,current);
		    break;
		}
		q.push(new Coor(xval+1,yval,current));
		
	    }
	    if(yval < board[0].length && (board[xval][yval+1] == '#' || board[xval][yval+1] == '$')){
		if (board[xval][yval+1] == '$'){
		    exit = new Coor(xval,yval+1,current);
		    break;
		}
		q.push(new Coor(xval,yval+1,current));
		
	    }
	    if(xval > 0 && (board[xval-1][yval] == '#' || board[xval-1][yval] == '$')){
		if (board[xval-1][yval] == '$'){
		    exit = new Coor(xval-1,yval,current);
		    break;
		}
		q.push(new Coor(xval-1,yval,current));
		
	    }
	    board[xval][yval] = 'Z';    
	}
	if(exit == null){
	    return;
	}
	else{
	    board = blah;
	    Coor ph = current;
	    while(ph.getPrev()!= null){
		board[ph.getX()][ph.getY()]='Z';
		ph=ph.getPrev();
	    }
	    board[ph.getX()][ph.getY()]='Z';
	    
	}

	
	
    }
    
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
	
    }
}