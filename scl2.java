class Scl2
{
String scl_name;
char scl_grade;
int scl_strength;
Scl2(String a, char b, int c)
{
scl_name=a;
scl_grade=b;
scl_strength=c;
}
public static void main (String[] args)
{
Scl2 s1=new Scl2("kps",'A',900);
System.out.println(s1.scl_name);
System.out.println(s1.scl_grade);
System.out.println(s1.scl_strength);
}
}