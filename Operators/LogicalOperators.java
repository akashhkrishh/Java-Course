class LogicalOperators{
    public static void main(String arg[]){
        
        System.out.println("\nLogical Operators :");
        int a = 10;
        int b = 20;
        boolean c ;
        System.out.println("\nA = "+a+" B = "+b);
        c = a !=b && a == b ; 
        System.out.println("\nA!=B && A==B : "+c);
        c = a !=b && a <= b ; 
        System.out.println("\nA!=B && A<=B : "+c);
        c = a !=b || a == b ; 
        System.out.println("\nA!=B || A==B : "+c);
        c = a !=b || a <= b ; 
        System.out.println("\nA!=B || A<=B : "+c);
    }
}
