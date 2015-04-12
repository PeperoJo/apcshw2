import java.util.*;
import java.io.*;

public class QuickSort{
    
    private int[] a,b;
    Random rnd = new Random();

    public QuickSort() {
	this(20);
    }
    public QuickSort( int n ) {
	Random r = new Random();
	a = new int[n];
	for (int i = 0; i < a.length; i++) {
	    a[i] = r.nextInt(100);
	}
    }
    
    public String toString() {
	return Arrays.toString(a);
    }
    
    public int partition( int[] a, int l, int r ) {
	int tmp;
	int pivotIndex=l;
	int pivot = a[pivotIndex];
	int wall=l;
	int pcount=1;
	for (int i=l;i<r;i++) {
	    if (a[i]<pivot) {
		tmp = a[i];
		a[i]=a[wall];
		a[wall]=tmp;
		wall++;
	    }
	    if (a[i]==pivot)
		pcount++;
	}
	int rwall=wall;
	tmp = a[rwall];
	a[wall]=a[r];
	a[r]=tmp;
	rwall++;
	for (int i=rwall+1;i<=r;i++) {
	    if (a[i]==pivot) {
		tmp = a[rwall];
		a[rwall]=a[i];
		a[i]=tmp;
		rwall++;
	    }
	}
	return (wall+rwall)/2;
    }
    
    public int qsort( int[] a, int k, int l, int h ) {
	int pi,pval;
	pi = partition(a,l,h);
	pval = a[pi];
	if (k==pi) {
	    return pval;
	}
	else if (k > pi) {
	    qselect(a,k,pi+1,h);
	    qselect(a,k,l,pi-1);
	}
    }
    
    public void sort() {
	int[] end = new int[a.length];
	for (int i=0;i<a.length;i++) {
	    end[i] = select(i);
	}
	for (int j=0;j<a.length;j++) {
	    a[j] = end[j];
	}
    }
    
    public static void main(String[] args) {
	QuickSort q = new QuickSort();
	System.out.println(q);
	System.out.println(q.select(0));
	q.sort();
	System.out.println(q);
	
    }
}