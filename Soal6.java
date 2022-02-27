import java.util.ArrayList;
//Soal 6
//6. add()
public class Soal6 {
    public static void main(String[] args) 
    {
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("u");
    nama.add("l");
    nama.add("y");
    nama.add("a");

    nama.add(0,"e");
    System.out.println(" ");
    System.out.println("Nama setelah penambahan huruf e ");
    System.out.println(nama);
    nama.add(2,"f");
    System.out.println("Nama setelah penambahan huruf f ");
    System.out.println(nama);
    nama.add(3,"g");
    System.out.println("Nama setelah penambahan huruf g ");
    System.out.println(nama);
    nama.add(4,"h"); 
    System.out.println("Nama setelah penambahan huruf h ");
    System.out.println(nama);
    nama.add(6,"h");
    System.out.println("Nama setelah penambahan huruf h ");
    System.out.println(nama);
    nama.add(-3,"j");
    System.out.println("Nama setelah penambahan huruf j ");
    System.out.println(nama);
    System.out.println(" ");

    }   
}
