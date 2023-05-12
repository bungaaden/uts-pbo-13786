package uts13786;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa
{
    //atribut
    String nim;
    String nama;
    String krs[];
    int semester, usia;
    private ArrayList<Float> nilai;

    public void setNim(String nim) 
    {
        this.nim = nim;
    }
    
    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    public void setSemester(int semester) 
    {
        this.semester = semester;
    }
    
    public void setUsia(int usia) 
    {
        this.usia = usia;
    }
    
    public void setKrs(String[] krs) 
    {
        this.krs = krs;
    }

    public Mahasiswa()
    {
        nilai = new ArrayList<>();
    }

    //Method untuk menghitung nilai rata-rata
    public float hitungRataNilai ()
    {
        int total=0;
        for (int i=0; i<nilai.size(); i++)
        {
            total=(int) (total+nilai.get(i));
        }
        return (float) total / nilai.size();
    }

    public void addNilai(float nilai) {
        this.nilai.add(nilai);
    }

    public ArrayList<Float> getNilai() {
        return nilai;
    }


    //method untuk menampilkan info mahasiswa
    public void infoMahasiswa ()
    {
        System.out.println("NIM         : "+nim);
        System.out.println("Nama        : "+nama);
        System.out.println("Semester    : "+semester);
        System.out.println("Usia        : "+usia);
    }

    //method untuk menampilkan krs mahasiswa
    public void infoKrsMahasiswa ()
    {
        System.out.println("KRS         : ");
        for (int i=0; i<krs.length; i++)
        {
            System.out.println("- "+krs[i]);
        }
    }
    
}