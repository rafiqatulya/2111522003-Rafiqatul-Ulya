import java.util.ArrayList;
//Soal 5
//5. remove()
public class Soal5 {
    public static void main(String[] args) 
{
ArrayList<String> nama = new ArrayList<String>();
nama.add("u");
nama.add("l");
nama.add("y");
nama.add("a");
System.out.println(" ");
System.out.println("ArrayList sebelum dihapus:");
for(String var : nama)
{
System.out.println(var);
}
nama.remove(0);
//nama.remove(3);
nama.remove(2);
System.out.println("ArrayList sesudah dihapus:");
for(String var1 : nama)
{
System.out.println(var1);
}
System.out.println(" ");

}
}
