/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasya;

/**
 *
 * @author User
 */
public class GajiExample {
    public static void main(String[] args){
        GajiRecord pegawai1=new GajiRecord();
        //isi object
        
        pegawai1.setKode("001");
        pegawai1.setTgl("11 Nov 2022");
        pegawai1.setNama("Andi");
        pegawai1.setGol(1);
        pegawai1.setTunjanganAnak(1000000);
        pegawai1.setTunjanganIstri(2000000);
        
        System.out.println("Kode Slip : "+pegawai1.getKode());
        System.out.println("Tanggal : "+pegawai1.getTgl());
        System.out.println("Nama : "+pegawai1.getNama());
        System.out.println("Golongan : "+pegawai1.getGol());
        System.out.println("Gaji Pokok : "+pegawai1.getGaji());
        System.out.println("Tunjangan Anak : "+pegawai1.getTunjanganAnak());
        System.out.println("Tunjangan Istri : "+pegawai1.getTunjanganIstri());
        System.out.println("Total Gaji : "+pegawai1.getTotal());
        
        GajiRecord pegawai2=new GajiRecord();
     
        pegawai2.setKode("002");
        pegawai2.setTgl("13 Nov 2022");
        pegawai2.setNama("Andre");
        pegawai2.setGol(2);
        pegawai2.setTunjanganAnak(2000000);
        pegawai2.setTunjanganIstri(3000000);
        
        System.out.print("\n");
        System.out.println("Kode Slip : "+pegawai2.getKode());
        System.out.println("Tanggal : "+pegawai2.getTgl());
        System.out.println("Nama : "+pegawai2.getNama());
        System.out.println("Golongan : "+pegawai2.getGol());
        System.out.println("Gaji Pokok : "+pegawai2.getGaji());
        System.out.println("Tunjangan Anak : "+pegawai2.getTunjanganAnak());
        System.out.println("Tunjangan Istri : "+pegawai2.getTunjanganIstri());
        System.out.println("Total Gaji : "+pegawai2.getTotal());
        
        GajiRecord pegawai3=new GajiRecord();
     
        pegawai3.setKode("003");
        pegawai3.setTgl("16 Nov 2022");
        pegawai3.setNama("Ridho");
        pegawai3.setGol(1);
        pegawai3.setTunjanganAnak(1000000);
        pegawai3.setTunjanganIstri(3000000);
        
        System.out.print("\n");
        System.out.println("Kode Slip : "+pegawai3.getKode());
        System.out.println("Tanggal : "+pegawai3.getTgl());
        System.out.println("Nama : "+pegawai3.getNama());
        System.out.println("Golongan : "+pegawai3.getGol());
        System.out.println("Gaji Pokok : "+pegawai3.getGaji());
        System.out.println("Tunjangan Anak : "+pegawai3.getTunjanganAnak());
        System.out.println("Tunjangan Istri : "+pegawai3.getTunjanganIstri());
        System.out.println("Total Gaji : "+pegawai3.getTotal());
    }
    
}
