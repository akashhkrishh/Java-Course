class UnaryOperators{
    public static void main(String arg[]){
        
        System.out.println("\nUnary Operators :");

        System.out.println("\nIncrement Operators :"); 
    
        int num = 10;
        int post = num++;
        int pre = ++num;
        
        System.out.println("\n\tPost-Increment :"+post);
        System.out.println("\tPre-Increment :"+pre);
        System.out.println("\nDecrement Operators :");

        int numd = 10;
        int postd = numd--;
        int pred = --numd;
        System.out.println("\n\tPre-Decrement :"+pred);
        System.out.println("\tPost-Decrement :"+postd);
    }
}
