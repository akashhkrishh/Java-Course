class RelationalOperators{
    public static void main(String arg[]){
        
        System.out.println("\nRelational Operators :");

        int a = 20;
        int b = 20;
        System.out.println("\nA = "+a+" B = "+b); 
        boolean great = a > b;
        boolean less = a < b;
        boolean equal = a == b;
        boolean greatEqual = a <= b;
        boolean lessEqual = a >= b;
        boolean notEqual = a != b;

        System.out.println("\na > b : "+great);  
        System.out.println("a < b : "+less);  
        System.out.println("a == b : "+equal);  
        System.out.println("a >= b : "+greatEqual);  
        System.out.println("a <= b : "+lessEqual); 
        System.out.println("a != b : "+notEqual); 
        
    }
}
