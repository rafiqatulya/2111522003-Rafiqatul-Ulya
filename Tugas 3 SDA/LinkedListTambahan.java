import java.util.LinkedList;

public class LinkedListTambahan
{
    public static void main(String[] args) {
        LinkedList <String> nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> no_bp = new LinkedList<String>();
        LinkedList <String> alamat = new LinkedList<String>();

        no_bp.add("2111522001");
        no_bp.add("2111522003");
        no_bp.add("2111522005");

        nama_mahasiswa.add("Niki Yulia Nada");
        nama_mahasiswa.add("Rafiqatul Ulya");
        nama_mahasiswa.add("Rakhilca Yanedika");

        alamat.add("Taeh Baruah");
        alamat.add("Kamang Hilia");
        alamat.add("Lubuak Basuang");

        System.out.println("Output Data Mahasiswa ");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        //menambahkan data mahasiswa
        System.out.println("1. Output add Data Mahasiswa : ");
        no_bp.addFirst("2111521010");
        no_bp.addLast("2111522009");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        nama_mahasiswa.addFirst("Novita Sari");
        nama_mahasiswa.addLast("Lesdina Manurung");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        alamat.addFirst("Jln. Ir. Soekarno No.3");
        alamat.addLast("Jln. Hatta No.20");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        //menghapus data mahasiswa
        System.out.println("2. Output remove Data Mahasiswa  ");
        no_bp.removeFirst();
        no_bp.removeLast();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        nama_mahasiswa.removeFirst();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        alamat.removeFirst();
        alamat.removeLast();
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        //menyisipkan data mahasiswa
        System.out.println("3. Output set Data Mahasiswa  ");
        no_bp.set(0,"2111522010");
        nama_mahasiswa.set(0,"Nur Laily");
        alamat.set(0,"Jln. Sudirman No.2");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        //mengambil data mahasiswa
        System.out.println("4. Output get Data Mahasiswa  ");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getLast());
        System.out.println("");

        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getLast());
        System.out.println("");

        System.out.println("Alamat Mahasiswa : " +alamat.getFirst());
        System.out.println("Alamat Mahasiswa : " +alamat.getLast());
        System.out.println("");

        //mengeluarkan daftar pertama data mahasiswa
        System.out.println("5. Output pop Data Mahasiswa  ");
        no_bp.pop();
        nama_mahasiswa.pop();
        alamat.pop();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        //menambahkan daftar pertama data mahasiswa
        System.out.println("6. Output push Data Mahasiswa : ");
        nama_mahasiswa.push("Nurmila");
        no_bp.push("2111521001");
        alamat.push("Jln. Ngurah Rai No.1");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        //mencari indeks suatu data mahasiswa
        System.out.println("7. Output indeksOf Data Mahasiswa : ");
        System.out.println(no_bp.indexOf("211523010"));
        System.out.println(nama_mahasiswa.indexOf("Rafiqatul Ulya"));
        System.out.println(alamat.indexOf("Jln. Ngurah Rai No.1"));
    }
}