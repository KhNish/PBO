package PBO;

/**
 *
 * @author M.Khoiril
 */

//FUNGSI OVERLOADING
class Bola {
    void tendangBola(){
        System.out.println("Bola ditendang menggunakan cara yg biasa");
    }
    void tendangBola(String teknik){
        System.out.println("Bola ditendang menggunakan teknik " +teknik);
    }
    void tendangBola(String teknik, int kekuatan){
        System.out.println("Bola ditendang menggunakan teknik "+teknik+
                " dengan kekuatan sebesar "+kekuatan+ "%");
    }
}
//FUNGSI OVERRIDING
class PemainSepakBola {
    void cetakGoll(){
        System.out.println("Pemain mencetak gol dengan cara yg biasa");
    }
}
class Striker extends PemainSepakBola {
    @Override
    void cetakGoll(){
        System.out.println("Ronaldo mencetak gol dengan tendangan keras");
    }
}
class Playmaker extends PemainSepakBola {
    @Override
    void cetakGoll(){
        System.out.println("Messi mencetak gol dengan tendangan chip elegan");
    }
 }
public class TugasMinggu12 {
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.tendangBola();
        bola.tendangBola("Volley");
        bola.tendangBola("Rabona", 85);

        System.out.println("\n====================\n");

        PemainSepakBola Ronaldo = new Striker();
        PemainSepakBola LeoMessi = new Playmaker();
        
        Ronaldo.cetakGoll();
        LeoMessi.cetakGoll();
    }
}
