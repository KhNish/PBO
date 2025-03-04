package PBO;

abstract class BangunDatar {
    abstract double luas ();
    abstract double keliling ();
}

class Persegi extends BangunDatar{
    double sisi;
    
    Persegi (double sisi) {
        this.sisi = sisi;
    }
    @Override
    double luas(){
        return sisi*sisi;
    }
    @Override
    double keliling(){
        return 4*sisi; 
    }
}

class Lingkaran extends BangunDatar{
    double r;
    
    Lingkaran (double r){
        this.r = r;
    }
    @Override
    double luas (){
        return Math.PI*r*r;
    }
    @Override
    double keliling (){
        return 2*Math.PI*r;
    }
}

class Segitiga extends BangunDatar {
    double alas, tinggi, sisiMiring;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }
    @Override
    double keliling() {
        return alas + tinggi + sisiMiring;
    }
}


public class TugasMinggu5 {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        Segitiga segitiga = new Segitiga(12, 16);
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}
