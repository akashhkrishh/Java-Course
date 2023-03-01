class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class ClassObject{
    public static void main(String a[]){
        System.out.println("Num");
        int n1=1024;
        int n2=102;
        Calc obj = new Calc();
        int res = obj.add(n1,n2);
        System.out.println(res);
    }
}
