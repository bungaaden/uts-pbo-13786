package uts13786;

public class MahasiswaLulus extends Mahasiswa 
{
    //atribut
    int tahunWisuda;
    float ipk;

    public void setTahunWisuda(int tahunWisuda) 
    {
        this.tahunWisuda = tahunWisuda;
    }
    
    public void setIpk(float ipk) 
    {
        this.ipk = ipk;
    }

    //method ikut wisuda
    public boolean ikutWisuda ()
    {
        return true;
    }

    //method untuk menampilkan info mahasiswa
    public void infoMahasiswa ()
    {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda    : "+tahunWisuda);
        System.out.println("IPK             : "+ipk);
    }
    
    public void infoKrsMahasiswa() 
    {
        System.out.println("KRS tidak tersedia karena sudah lulus.");
    }
}
