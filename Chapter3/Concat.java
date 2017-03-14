class Concat {
    public static void main(String[ ] args) {
        System.out.println("Hello Java");
        zool(11,"Mile","Zeleznicka S1-5");
        printAmerican("Saturday","March",11,2017);
        printEuropean("Monday","January",1,2000);
    }
    public static void zool(int num,String pet,String street){
        
        System.out.println(num + " ," + pet + ", " + street);
    }
    
    public static void printAmerican(String day,String month,int date,int year){
        System.out.println(day + ","+month+" "+date+","+year);
    }
    public static void printEuropean(String day,String month,int date,int year){
        System.out.println(day + "," + date + " "+month+","+year);
    }
}