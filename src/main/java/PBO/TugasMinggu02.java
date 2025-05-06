package PBO;

//TUGAS 1
class Mobil {
    String merk,warna;
    int kecepatan;
    
    public Mobil (String Merk, String Warna) {
        this.merk = Merk;
        this.warna = Warna;
        this.kecepatan = 0;
    }
    
    public void start() {
        System.out.println("Mobil " +merk+ " berwarna " +warna+ " telah berjalan");
    }
    
    public void accelerate (int tambahKecepatan) {
        kecepatan += tambahKecepatan;
        System.out.println("Kecepatan mobil sekarang = " +kecepatan+ " KM/jam");
    }
    
    public void stop() {
        System.out.println("Mobil " +merk+ " telah berhenti");
    }
}

//TUGASS 2
class Pesepakbola {
    String nama, kewarganegaraan, klub;
    int nomorPunggung;
    
    public Pesepakbola(String nama, String kewarganegaraan, String klub, int nomorPunggung){
        this.nama = nama;
        this.kewarganegaraan = kewarganegaraan;
        this.klub = klub;
        this.nomorPunggung = nomorPunggung;
    }
    
    public void infoPemain (){
        System.out.println("Pesepakbola bernama " +nama+ " berkewarganegaraan " 
                +kewarganegaraan+ " saat ini bermain untuk klub "+klub+ 
                " dan bernomor punggung " +nomorPunggung);
    }
    
    public void transferKlub(String klubBaru){
        klub = klubBaru;
        System.out.println(nama+ " telah pindah ke klub " +klub);
    }
    
    public void gantiNomor(int nomorBaru){
        nomorPunggung = nomorBaru;
        System.out.println(nama+ " sekarang memakai nomor punggung baru, yaitu " +nomorPunggung);
    }
    
    public void cetakGol(){
        System.out.println(nama+ " telah mencetak gol debut untuk " +klub+ "!!!");
    }
}

public class TugasMinggu02 {
    public static void main(String[] args) {
        Mobil lamborghini = new Mobil("Lamborghini Revuelto", "Putih");
        lamborghini.start();
        lamborghini.accelerate(150);
        lamborghini.stop();
        
        Pesepakbola Messi = new Pesepakbola ("Lionel Messi", "Argentina", "Newell’s Old Boys", 10);
        Pesepakbola Ronaldo = new Pesepakbola ("Cristiano Ronaldo", "Portugal", "Sporting CP", 28);
        Pesepakbola Alexis = new Pesepakbola ("Alexis Sanchez", "Chile", "Udinese", 7);
        
        Messi.infoPemain();
        Messi.transferKlub("FC Barcelona");
        Messi.gantiNomor(14);
        Messi.cetakGol();
    }
}
