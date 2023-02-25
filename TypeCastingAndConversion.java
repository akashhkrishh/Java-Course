class TypeCastingAndConversion{
    public static void main(String arg[]){
        
        System.out.print("Type Conversion : ");
        byte a = 123;
        int b = a;
        System.out.println(b);

        System.out.print("Type Conversion : ");
        int a1 = 257;
        byte b1 = (byte) a1; // a1 = 257 % 256 = 1
        System.out.println(b1);

        System.out.print("Type Promotion : ");
        byte a2 = 122;
        byte b2 = 123; 
        int result = a2 * b2; 
        System.out.println(result);
    }
}
