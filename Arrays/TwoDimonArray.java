class TwoDimonArray{

    public static void main(String a[]){

        System.out.println("\n2D -Array Implementation ");
        int arr[][] = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=(int) (Math.random()*100);//Random Values
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.print("\n");
        }

    }
}
