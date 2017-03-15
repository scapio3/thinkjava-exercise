class Fermat{
	public static void main(String[] args){
		checkFermat(3,4,5,3);
	}

	public static void checkFermat(int a,int b,int c,int n){
        if(n > 2 ){
		    if(raiseToPow(a,n) + raiseToPow(b,n) == raiseToPow(c,n) ){
			    System.out.println("Holy smokes, Fermat was wrong!");
		    }
		    else{
		        System.out.println("No,that doesn't work.");
		    }
            
        }else{
            System.out.println("This works when n is 2!");
        }
    
	}
		
 public static int raiseToPow(int x,int n){
		int res = 1;
		for(int i = 0;i < n;i++){
		    res = res * x;	
		}
	    return res;
	}
    
}
