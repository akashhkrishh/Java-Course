
class StaticMethod
{
    public static void main(String arg[])
    {
        System.out.println("Stati Method : ");
        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.Price = 120000;
        obj1.OS = "IOS";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Realme";
        obj2.Price = 20000;
        obj2.OS = "Android";
        Mobile.show(obj1);
        Mobile.show(obj2);
    }
}
class Mobile
{
    String Brand;
    int Price;
    String OS;

    public static void show(Mobile obj)
    {
        System.out.println(obj.Brand+" : "+obj.Price+" : "+obj.OS);
    }
}
