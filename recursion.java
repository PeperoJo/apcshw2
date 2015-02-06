public class recursion{

    public int factorial(int n){
	if (n==1){
	    return 1;}
	return n*factorial(n-1);
    }

    public int fibo(int n){
	if (n<=2){
	    return 1;}
	return fibo(n-1)+fibo(n-2);
    }

    public int len(String s){
	if (s.equals("")){
	    return 0;}
	return 1 + len(s.substring(1));
    }

    public int count(String s, String c){
	if (s.equals("")){
	    return 0;}
	else if (s.substring(0,1).equals(c)){
	    return 1 + count(s.substring(1), c);}
	return count(s.substring(1), c);
    }

    public static void main(String[] args){
	recursion e = new recursion();
	System.out.println(e.factorial(5));
	System.out.println(e.fibo(7));
	System.out.println(e.len("hello"));
	System.out.println(e.count("hello", "l"));
    }
}
