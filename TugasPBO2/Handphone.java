public class Handphone {

    String jenis_hp;
    int tahun_pembuatan;

    // Setter
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Getter
    public String getJenisHP(){
        return jenis_hp;
    }

    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }

    public static void main(String[] args){

       Handphone hp = new Handphone();

        hp.setDataHP("Iphone", 2026);

        System.out.println("Jenis HP: " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}