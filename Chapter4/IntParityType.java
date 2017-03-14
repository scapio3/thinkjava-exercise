class IntParityType {
    public static void main(String[ ] args) {
        System.out.println("Hello Java");
        printParity(-3);
        printIntType(0);
    }
    public static void printParity(int x){
        if(x % 2 == 0){
            System.out.println(x + " is even number");
        }
        else{
            System.out.println(x + " is odd number");
        }
        
        
    }
    
    public static void printIntType(int x){
        if(x > 0){
            System.out.println(x + " is positive integer");
        }
        else if(x < 0){
            System.out.println(x + " is negative integer");
            
        }
        else{
            System.out.println(x + " is zero");
        }
    }
}