class AssignmentOperators{
    public static void main(String arg[]){
        
        System.out.println("\nAssignment Operators :");
        int a = 10;
        int b = 10;
        System.out.println("\nA = "+a+" B = "+b);
        a += 10;
        b = b+10;
        System.out.println("\n+= : A = "+a+" B = "+b);
        a=b=10;
        a -= 10;
        b = b-10;
        System.out.println("\n-= : A = "+a+" B = "+b);
        a=b=10;
        a *= 10;
        b = b*10;
        System.out.println("\n*= : A = "+a+" B = "+b);
        a=b=10;
        a /= 10;
        b = b/10;
        System.out.println("\n/= : A = "+a+" B = "+b);
        a=b=10;
        a %= 10;
        b = b%10;
        System.out.println("\n%= : A = "+a+" B = "+b);
        a=b=10;
        a &= 10; //if a,b are equal gives a value otherwise 0
        b = b&10;
        System.out.println("\n&= : A = "+a+" B = "+b+"\n");
    }
}
