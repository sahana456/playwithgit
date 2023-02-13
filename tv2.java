class Tv2
{
	int tv_cost;
String tv_brand;
String tv_type;
Tv2(int a, String b, String c)
{
tv_cost=a;
tv_brand=b;
tv_type=c;
}
public static void main (String[] args)
{
Tv2 t1=new Tv2(50000,"samsung","led");
System.out.println(t1.tv_cost);
System.out.println(t1.tv_brand);
System.out.println(t1.tv_type);
}
}