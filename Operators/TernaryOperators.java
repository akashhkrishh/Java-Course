class TernaryOperators{
    public static void main(String arg[]){
        
        System.out.println("\nTernary Operators :");
    
        int a = 101;
        int b = 15;
        char out = (a>b)?'A':'B';
        int value = (a>b)?a:b;

        System.out.println("\nA = "+a+" B = "+b);
        System.out.println("Greater Value is "+out+" = "+value);
    }
