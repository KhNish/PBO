package PBO;
/**
 *
 * @author M.Khoiril
 */
class PesepaqBola implements AutoCloseable {
    private String nama;

    public PesepaqBola(String nama) {
        this.nama = nama;
        System.out.println(nama + " mulai latihan di lapangan.");
    }

    public void latihan() {
        System.out.println(nama + " sedang menggiring bola dan menendang ke gawang.");
    }

    @Override
    public void close() {
        System.out.println(nama + " membersihkan bola, melepas sepatu, dan meninggalkan lapangan.");
    }
}

public class TugasMinggu13 {
    public static void main(String[] args) {
        try (PesepaqBola pemain = new PesepaqBola("Aril")) {
            pemain.latihan();
        }
        System.out.println("Sesi latihan selesai.\n");
    }
}
