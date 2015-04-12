import java.util.*;
import java.io.*;

public class Selection {

    public int split( int[] a, int l, int h ) {
	int temp;
	int pi = 1;
	int pivot = a[pi];
	int wall = 1;
	for (int i=0;i<a.length;i++) {
	    if ( A[i] > pivot ) {
		temp = a[i];
		a[i] = a[wall];
		a[wall] = temp;
		wall++;
	    }
	}
	if ( temp[k] == pivot ) {
	    return temp[k];
	}
	return temp[k];
    }

    public static void main(String[] args) {
	int[] a = { 1, 0, 9, 8, 5};
	Selection s = new Selection();
	System.out.println(s.select(3,a, 0, a.length - 1));
    }

}