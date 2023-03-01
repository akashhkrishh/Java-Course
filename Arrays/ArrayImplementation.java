class ArrayImplementation{

    public static void main(String a[]){

        System.out.println("Array Implementation ");
        int arr[] = {102,34,3,533,2};
        int arr1[] = new int[5];
        arr1[0] = 132;
        arr1[1] = 12;
        arr1[2] = 2;
        arr1[3] = 102;
        arr1[4] = 29;
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println(" ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(" "+arr1[i]);
        }

    }
}
