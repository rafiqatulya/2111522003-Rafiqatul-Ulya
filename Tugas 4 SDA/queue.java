import java.util.Scanner;
public class queue{
    int id;
    String nama,barang;
    queue next;
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan nomor id        : ");
        id=in.nextInt();
        System.out.print("Masukkan nama      : ");
        nama=str.nextLine();
        System.out.print("Masukkan barang : ");
        barang=str.nextLine();
        next=null;
    }
    public void read(){
        System.out.println("|| "+id+" \t|| "+nama+" \t|| "+barang+" \t||");
    }
    public static void main(String[] args){
        int menu=0;
        linked que=new linked();
        while(menu!=4){
            System.out.print("1. Tambah Pelanggan(Enqueue)\n2. Kurangi pelanggan (Dequeue)\n3. Lihat daftar pelanggan\n4. Keluar\n : ");
            menu=in.nextInt();
            if(menu==1)que.enque();
            else if(menu==2)que.deque();
            else if(menu==3)que.view();
            else if(menu==4)System.out.println("- keluar -");
            else System.out.println("- Salah -");
            System.out.println("");
        }
    }
}
class linked{
    queue head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void enque(){
        queue baru=new queue();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("Keluar Data Dengan Id : "+head.id);
            head=head.next;
        }
    }
    public void view(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("|| Id \t|| Nama \t|| Barang \t||");
            System.out.println("==========================================");
            for(queue a=head; a!=null; a=a.next) a.read();
        }
    }
}