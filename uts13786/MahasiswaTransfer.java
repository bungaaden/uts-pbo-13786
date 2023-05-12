package uts13786;

public class MahasiswaTransfer extends MahasiswaBaru
{
    //atribut
    String asalUniversitas;

    public void setAsalUniversitas(String asalUniversitas) 
    {
        this.asalUniversitas = asalUniversitas;
    }

    //method ikut ospek
    public boolean ikutOspek ()
    {
        return false;
    }

    //method untuk menampilkan info mahasiwa
    public void infoMahasiswa ()
    {
        super.infoMahasiswa();
        System.out.println("Asal Universitas: "+asalUniversitas);
    }
}
