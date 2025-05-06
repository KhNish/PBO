package PBO;

//tugas1
class Kendaraan {
    String merk;
    int tahunPembuatan;
    
    public Kendaraan (String merk, int tahunPembuatan){
        this.merk = merk;
        this.tahunPembuatan = tahunPembuatan;
    }
}

class Mobeel extends Kendaraan {
    private int jumlahPintu;
    private String platNomor;

    public Mobeel(String merk, int tahunPembuatan,int jumlahPintu, String platNomor) {
        super(merk, tahunPembuatan);
        this.jumlahPintu = jumlahPintu;
        this.platNomor = platNomor;
    }
    public String getinfoMobil () {
        return "Mobil "+merk+ "\nTahun "+tahunPembuatan+"\nMemiliki "+jumlahPintu+" pintu"
                +"\nber-Plat Nomor : "+platNomor;
    }
}
//______________________________________________________________________________
//tugas2
class Hewan {
    String nama;
    int umur;
    
    public Hewan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    public void berbicara (){
        System.out.println("Suara Hewan");
    }
}

class Anjing extends Hewan implements AutoCloseable{
    public Anjing (String nama, int umur) {
        super(nama, umur);
    }
    @Override
    public void berbicara(){
        System.out.println("woof woof");
    }
    @Override
    public void close () {
        System.out.println("Objek Anjing yang bernama " +nama+ "telah dihapus");
    }
}
//______________________________________________________________________________
//tugas3
class AkunBank {
    protected double saldo;
    
    public AkunBank (double saldo){
        this.saldo = saldo;
    }
}

class AkunTabungan extends AkunBank{
    private double bunga;
    
    public AkunTabungan (double saldo, double bunga){
        super(saldo);
        this.bunga = bunga;
    }
    public double hitungBunga() {
        return this.saldo * (this.bunga/100);
    }
}


//saatnyaa kelas mainn
public class TugasMinggu04 {
    public static void main(String[] args) {
        //tugas1
        Mobeel myCar = new Mobeel ("Toyota", 2022, 4, "P 1403 AB");
        System.out.println("_______Informasi Mobil_______");
        System.out.println(myCar.getinfoMobil());
        System.out.println();
        
        //tugas2
        System.out.println("_______Suara Hewan_______");
        Hewan kewan = new Hewan ("Hewan Apa Aja", 4);
        kewan.berbicara();
        System.out.println();
        
        System.out.println("_______Suara Anjing_______");
        try (Anjing anjinkk = new Anjing("Trump ", 3)){
            anjinkk.berbicara();
        }
        System.out.println();
        
        //tugas3
        AkunTabungan myTabungan = new AkunTabungan(500000, 5.0);
        System.out.println("_______Info Akun Tabungan_______");
        System.out.println("Saldo : Rp " + myTabungan.saldo);
        System.out.println("Bunga yg diperoleh : Rp "+myTabungan.hitungBunga());
    }
}
