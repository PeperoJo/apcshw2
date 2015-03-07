
import java.io.*;
import java.util.*;

public class ctravel{
    public static void main (String [] args) throws IOException {
	BufferedReader f = new BufferedReader(new FileReader("ctravel.in"));
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ctravel.out")));
	
	String s = f.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
	boolean[][] trees = new boolean[N][M];

        for(int i=0; i<N; i++){
            s=f.readLine();
	    for(int j=0; j<M; j++){
		if(s.charAt(j)=='*'){
                    trees[i][j]=true;
		}
	    }
	}
        
        s = f.readLine();
        StringTokenizer st2 = new StringTokenizer(s);
        int startx = Integer.parseInt(st2.nextToken());
        int starty = Integer.parseInt(st2.nextToken());
        int endx = Integer.parseInt(st2.nextToken());
        int endy = Integer.parseInt(st2.nextToken());
        
        int[][][] ways = new int[N+2][M+2][T+1];
        ways[startx][starty][0]=1; 
        for(int t=1; t<=T; t++){
            for(int n=1; n<=N; n++){
                for(int m=1; m<=M; m++){
                    if(!trees[n-1][m-1]){
                        ways[n][m][t]=ways[n-1][m][t-1]+ways[n+1][m][t-1]+ways[n][m-1][t-1]+ways[n][m+1][t-1];
                    }
                }
            }
        }

	out.println(ways[endx][endy][T]);           
	out.close();                                  
	System.exit(0);                             
    }
}
