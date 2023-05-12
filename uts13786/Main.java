/*Nama : Bunga Dinda Endri Novita
 * Nim  : A11.2021.13786
 * Kelompok : A11.4412
 */
package uts13786;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        Mahasiswa mh = new Mahasiswa();
        
        while (true)
        {
            System.out.println("1. Daftar Mahasiswa");
            System.out.println("2. List Daftar Mahasiswa");
            System.out.print("Input Menu : ");
            int menu = input.nextInt();

            if (menu==1)
            {
                System.out.print("Input Jumlah Mahasiswa : ");
                int jumlahMahasiswa = input.nextInt();
                input.nextLine();

                for (int x = 0; x < jumlahMahasiswa; x++) 
                {
                    System.out.println("Data Mahasiswa ke-" + (x+1));

                    System.out.print("NIM       : ");
                    String nim = input.nextLine();

                    System.out.print("Nama      : ");
                    String nama = input.nextLine();

                    System.out.print("Semester  : ");
                    int semester = input.nextInt();

                    System.out.print("Usia      : ");
                    int usia = input.nextInt();

                    System.out.print("Jumlah mata kuliah yang diambil: ");
                    int jumlahMatkul = input.nextInt();
                    input.nextLine();

                    String[] krs = new String[jumlahMatkul];
                    int[] arr = new int[jumlahMatkul];
                    for (int y = 0; y < jumlahMatkul; y++) {
                        System.out.print("Mata kuliah " + (y+1) + ": ");
                        krs[y] = input.nextLine();
                        System.out.print("Nilai " + (y+1) + ": ");
                        int tambahNilai=input.nextInt();
                        input.nextLine();
                        mh.addNilai(tambahNilai);
                    }

                    System.out.println("1. Mahasiswa Aktif");
                    System.out.println("2. Mahasiswa Baru");
                    System.out.println("3. Mahasiswa Tranfer");
                    System.out.println("4. Mahasiswa Lulus");
                    System.out.print("Masukkan pilihan : ");
                    int pil = input.nextInt();
                    input.nextLine();

                    switch (pil)
                    {
                        case 1 :
                        {
                            Mahasiswa mhs = new Mahasiswa();
                            System.out.println("MAHASISWA AKTIF");
                            mhs.setNim(nim);
                            mhs.setNama(nama);
                            mhs.setSemester(semester);
                            mhs.setUsia(usia);
                            mhs.setKrs(krs);
                            mhs.hitungRataNilai();
                            
                            mahasiswa.add(mhs);
                            System.out.println();
                            break;
                        }  
                        case 2 :
                        {
                            MahasiswaBaru mhs = new MahasiswaBaru();
                            System.out.println("MAHASISWA BARU");
                            mhs.setNim(nim);
                            mhs.setNama(nama);
                            mhs.setSemester(semester);
                            mhs.setUsia(usia);
                            mhs.setKrs(krs);
                        
                            System.out.print("Asal Sekolah: ");
                            String asalSekolah = input.nextLine();
                            mhs.setAsalSekolah(asalSekolah);
                            
                            mahasiswa.add(mhs);
                            System.out.println();
                            break;
                        }  
                        case 3 :
                        {
                            MahasiswaTransfer mhs = new MahasiswaTransfer();
                            System.out.println("MAHASISWA TRANFER");
                            mhs.setNim(nim);
                            mhs.setNama(nama);
                            mhs.setSemester(semester);
                            mhs.setUsia(usia);
                            mhs.setKrs(krs);

                            System.out.print("Asal Sekolah: ");
                            String asalSekolah = input.nextLine();
                            mhs.setAsalSekolah(asalSekolah);
                            System.out.print("Asal Universitas  : ");
                            String asalUniversitas = input.nextLine();
                            mhs.setAsalUniversitas(asalUniversitas);

                            mahasiswa.add(mhs);
                            System.out.println();
                            break;
                        }
                        case 4 :
                        {
                            MahasiswaLulus mhs = new MahasiswaLulus();
                            System.out.println("MAHASISWA LULUS");
                            mhs.setNim(nim);
                            mhs.setNama(nama);
                            mhs.setUsia(usia);
                            mhs.setKrs(krs);

                            System.out.print("Tahun Wisuda : ");
                            int tahunWisuda = input.nextInt();
                            mhs.setTahunWisuda(tahunWisuda);
                            System.out.print("IPK : ");
                            float ipk = input.nextFloat();
                            mhs.setIpk(ipk);

                            mahasiswa.add(mhs);
                            System.out.println();
                            break;
                        }
                        default :
                            System.out.println("Maaf, pilihan anda salah");               
                    }
                    
                }
            }
            else if (menu ==2)
            {
                System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : mahasiswa) {
                        mhs.infoMahasiswa();
                        mhs.infoKrsMahasiswa();

                        //untuk menghitung nilai rata-rata
                        ArrayList<Float> nilai = mh.getNilai();
                        double rataNilai = 0.0;

                        for(int i=0; i<nilai.size(); i++)
                        {
                            float total = nilai.get(i);
                            //System.out.print(nilaiMataKuliah + " ");
                            rataNilai =rataNilai+total;
                        }
                        if(nilai.size() > 0)
                        {
                            rataNilai /= nilai.size();
                        }
                        System.out.println("Nilai Rata : "+rataNilai);
                        System.out.println();
                    }
            }  
            else 
            {
                System.out.println("Maaf, menu yang anda input salah");
            } 
                
            }
        }
    
}
