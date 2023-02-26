public class NestedElseIfStatement{
    public static void main(String arg[]){
        System.out.println("Nested else-If Statement : ");
        int x=1010;
        int y=4599;
        int z=123;
        if(x>y){
            if(x>z){
                System.out.println("Greater Value is : "+x);    
            }
            else{
                System.out.println("Greater Value is : "+z);
            }
        }
        else if(y>z){
            System.out.println("Greater Value is : "+y);
        }
        else{
           System.out.println("Greater Value is : "+z); 
        }

    }
}
