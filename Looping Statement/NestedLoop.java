public class NestedLoop{
    public static void main(String arg[]){
        System.out.println("Nested Loop : ");
        
        int num=5;
        
        for(int i=1;i<=num;i++){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j+=1;
            }
            System.out.println(" ");
        }
    }
}
