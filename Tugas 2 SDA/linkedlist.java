import java.util.LinkedList;
//Tugas 2 Struktur Data dan Algoritma
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();
        saya.add("R");
        saya.add("A");
        saya.add("F");
        saya.add("I");
        saya.add("Q");
        saya.add("A");
        saya.add("T");
        saya.add("U");
        saya.add("L");
        saya.add("");
        saya.add("U");
        saya.add("L");
        saya.add("Y");
        saya.add("A");
       
        
        System.out.println("Nama Lengkap :");
        System.out.println(saya);
        System.out.print("Ukuran : ");
        System.out.println(saya.size());
        System.out.println("");

        //1. Add karakter lain yang anda inginkan
        saya.addFirst("R");
        saya.add("U");
        saya.add(10,"T");
        saya.addLast("A");
        System.out.println("1. Output add karakter :");
        System.out.println(saya);
        System.out.print("Ukuran : ");
        System.out.println(saya.size());
        System.out.println("");

        //2. Sisipkan karakter lain yang anda inginkan
        saya.set(4,"V");
        saya.set(9,"S");
        System.out.println("2. Output sisip karakter :");
        System.out.println(saya);
        System.out.print("Ukuran : ");
        System.out.println(saya.size());
        System.out.println("");

        //3. Hapus beberapa karaker yang ingin anda hapus
        saya.removeFirst();
        saya.remove(13);
        saya.removeLast();
        System.out.println("3. Output hapus karakter :");
        System.out.println(saya);
        System.out.print("Ukuran : ");
        System.out.println(saya.size());
        System.out.println("");

        //4. Buat fungsi POP dan PUSH pada project anda
        saya.pop();
        System.out.println("4. Output POP : ");
        System.out.println(saya);
        System.out.print("Ukuran : ");
        System.out.println(saya.size());
        System.out.println("");

        saya.push("B");
        System.out.println("4. Output PUSH :");
        System.out.println(saya);
        System.out.print("Ukuran : ");
        System.out.print(saya.size());
        System.out.println("");

    }
}