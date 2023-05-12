package uts13786;

public class MahasiswaBaru extends Mahasiswa 
{
    //atribut
    String asalSekolah;
    
    public void setAsalSekolah(String asalSekolah) 
    {
        this.asalSekolah = asalSekolah;
    }

    public boolean ikutOspek() 
    {
        return true;
    }
    
    public void infoMahasiswa() 
    {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah: " + asalSekolah);
    }  
    
}
