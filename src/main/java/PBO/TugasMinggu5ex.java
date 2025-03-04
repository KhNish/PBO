package PBO;

abstract class PemainSepakbola{
    abstract void posisi();
    abstract void tugas();
    abstract void gayaBermain();
}

class Kiper extends PemainSepakbola{
    @Override
    void posisi() {
        System.out.println("Posisi: Penjaga Gawang");
    }
    @Override
    void tugas() {
        System.out.println("Tugas: Menjaga gawang agar tidak kebobolan");
    }
    @Override
    void gayaBermain() {
        System.out.println("Gaya Bermain: Refleks cepat dan positioning yang baik");
    }
}

class Bek extends PemainSepakbola {
    @Override
    void posisi() {
        System.out.println("Posisi: Bek");
    }
    @Override
    void tugas() {
        System.out.println("Tugas: Menghentikan serangan lawan");
    }
    @Override
    void gayaBermain() {
        System.out.println("Gaya Bermain: Kuat dalam duel dan tackling yang baik");
    }
}

class Gelandang extends PemainSepakbola {
    @Override
    void posisi() {
        System.out.println("Posisi: Gelandang");
    }
    @Override
    void tugas() {
        System.out.println("Tugas: Mengatur permainan dan memberikan umpan");
    }
    @Override
    void gayaBermain() {
        System.out.println("Gaya Bermain: Visioner dengan umpan akurat");
    }
}

class Penyerang extends PemainSepakbola {
    @Override
    void posisi() {
        System.out.println("Posisi: Penyerang");
    }
    @Override
    void tugas() {
        System.out.println("Tugas: Mencetak gol");
    }
    @Override
    void gayaBermain() {
        System.out.println("Gaya Bermain: Cepat dan tajam dalam penyelesaian akhir");
    }
}

public class TugasMinggu5ex {
    public static void main(String[] args) {
        PemainSepakbola Stegen = new Kiper();
        PemainSepakbola Cubarsi = new Bek();
        PemainSepakbola Pedri = new Gelandang();
        PemainSepakbola Lewandowski = new Penyerang();

        Stegen.posisi();
        Stegen.tugas();
        Stegen.gayaBermain();
        System.out.println();

        Cubarsi.posisi();
        Cubarsi.tugas();
        Cubarsi.gayaBermain();
        System.out.println();

        Pedri.posisi();
        Pedri.tugas();
        Pedri.gayaBermain();
        System.out.println();

        Lewandowski.posisi();
        Lewandowski.tugas();
        Lewandowski.gayaBermain();
    }
}

