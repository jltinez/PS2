package base;
/*Joaquin Martinez PS2(LATE) CISC181*/
public class MyInteger {
	private int iValue;
	int i;
	
	public MyInteger(int iValue) {
	
	}
	public int getValue(){
		return iValue;
	
	}
	public boolean isEven(){
		if (iValue%2== 0)
			return true;
		else 
			return false;
	}
	public boolean isOdd(){
		if (iValue%2== 0)
			return false;
		else 
			return true;
	}
	public boolean isPrime() {
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int x){
		if (x== 0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(int x){
		if (x%2== 0)
			return false;
		else 
			return true;
	}
	public static boolean isPrime(int x){
	    if (x%2== 0) 
	    	return false;
	    for(int i= 3;i*i<=x;i+= 2) {
	        if(x%i== 0)
	            return false;
	    }
	    return true;
	}
	public static boolean isEven(MyInteger x){
		if (x.getValue()== 0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(MyInteger x){
		if (x.getValue()%2== 0)
			return false;
		else 
			return true;
	}
	public static boolean isPrime(MyInteger y){
	    if (y.getValue()%2== 0) 
	    	return false;
	    for(int i= 3;i*i<= y.getValue();i+= 2) {
	        if(y.getValue()%i== 0)
	            return false;
	    }
	    return true;
	}
}

