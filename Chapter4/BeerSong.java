class BeerSong{
	public static void main(String[] args){
			makeSong(99);
	}
	
	public static void makeSong(int n){
		if (n==0){
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya' can't takeone down, ya' can't pass it around, 'cause there are no morebottles of beer on the wall!");
	}else{
		int n2 = n-1;
		System.out.println(n + "  bottles of beer on the wall,"+ n +" bottles of beer, ya' take onedown, ya' pass it around,"+ n2 + " bottles of beer on the wall.");
		makeSong(n-1);	
	}
	
}
}