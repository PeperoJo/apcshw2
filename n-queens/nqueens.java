import java.io.*;
import java.util.*;

public class nqueens {

    //--------------------------------
    private char[][] board;
    private int maxX, maxY;

    private char space = 'o';
    private char queen = 'Q';

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    //--------------------------------

    public nqueens() {

	maxX = 5;
	maxY = 5;
	board = new char[maxX][maxY];
	filler();
    }

    public void filler() {
	for(int a=0;a<maxX;a++){
	    for(int b=0;b<maxY;b++)
		board[a][b] = space;
	}
    }

    public String toString(){
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    public static void main(String[] args){
	nqueens q = new nqueens();
	System.out.println(q);
    }
}
