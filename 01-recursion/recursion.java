//first homework

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

    public int bunnyEars2(int n){
	if (n==0){
	    return 0;}
	else if(n%2==0){
	    return 3 + bunnyEars2(n-1);}
	else {return 2 + bunnyEars2(n-1);} 
    }

    public int strCount(String str, String sub) {
	if(str.length() < sub.length()){
	    return 0;
	}
	else if(str.substring(0,sub.length()).equals(sub)){
	    return 1 + strCount(str.substring(sub.length(),str.length()),sub);
	}
	else{
	    return 0 + strCount(str.substring(1,str.length()),sub);
	}
    }

    public int sumDigits(int n) {
	if(n / 10 == 0){
	    return n;
	}
	else{
	    return n % 10 + sumDigits(n / 10);
	}
    }

    public String allStar(String str) {
	if(str.length() <= 1){
	    return str;
	}
	else{
	    return str.substring(0,1) + "*" + allStar(str.substring(1));
	}
    }

    public static void main(String[] args){
	recursion e = new recursion();
	System.out.println(e.factorial(5));
	System.out.println(e.fibo(7));
	System.out.println(e.len("hello"));
	System.out.println(e.count("hello", "l"));
	System.out.println(e.bunnyEars2(0));
	System.out.println(e.bunnyEars2(1));
	System.out.println(e.bunnyEars2(2));
	System.out.println(e.strCount("catcowcat", "cat"));
	System.out.println(e.strCount("catcowcat", "cow"));
        System.out.println(e.strCount("catcowcat", "dog"));
    }
}
