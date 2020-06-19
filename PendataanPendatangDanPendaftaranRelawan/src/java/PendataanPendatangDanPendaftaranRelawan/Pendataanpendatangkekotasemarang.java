/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PendataanPendatangDanPendaftaranRelawan;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "pendataanpendatangkekotasemarang")
@NamedQueries({
    @NamedQuery(name = "Pendataanpendatangkekotasemarang.findAll", query = "SELECT p FROM Pendataanpendatangkekotasemarang p")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByNik", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.nik = :nik")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByNama", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.nama = :nama")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByUmur", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.umur = :umur")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByNoHP", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.noHP = :noHP")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByJenisKelamin", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByAlamat", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.alamat = :alamat")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByAsalKeberangkatan", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.asalKeberangkatan = :asalKeberangkatan")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByLokasiKedatangan", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.lokasiKedatangan = :lokasiKedatangan")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByTanggalWaktuKedatangan", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.tanggalWaktuKedatangan = :tanggalWaktuKedatangan")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByKKKRTRWTujuan", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.kKKRTRWTujuan = :kKKRTRWTujuan")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByLamaBerkunjung", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.lamaBerkunjung = :lamaBerkunjung")
    , @NamedQuery(name = "Pendataanpendatangkekotasemarang.findByKondisiKesehatan", query = "SELECT p FROM Pendataanpendatangkekotasemarang p WHERE p.kondisiKesehatan = :kondisiKesehatan")})
public class Pendataanpendatangkekotasemarang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NIK")
    private String nik;
    @Size(max = 100)
    @Column(name = "Nama")
    private String nama;
    @Size(max = 100)
    @Column(name = "Umur")
    private String umur;
    @Size(max = 50)
    @Column(name = "No_HP")
    private String noHP;
    @Size(max = 50)
    @Column(name = "Jenis_Kelamin")
    private String jenisKelamin;
    @Size(max = 600)
    @Column(name = "Alamat")
    private String alamat;
    @Size(max = 200)
    @Column(name = "Asal_Keberangkatan")
    private String asalKeberangkatan;
    @Size(max = 200)
    @Column(name = "Lokasi_Kedatangan")
    private String lokasiKedatangan;
    @Size(max = 200)
    @Column(name = "TanggalWaktu_Kedatangan")
    private String tanggalWaktuKedatangan;
    @Size(max = 600)
    @Column(name = "KKKRTRW_Tujuan")
    private String kKKRTRWTujuan;
    @Size(max = 100)
    @Column(name = "Lama_Berkunjung")
    private String lamaBerkunjung;
    @Size(max = 500)
    @Column(name = "Kondisi_Kesehatan")
    private String kondisiKesehatan;

    public Pendataanpendatangkekotasemarang() {
    }

    public Pendataanpendatangkekotasemarang(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsalKeberangkatan() {
        return asalKeberangkatan;
    }

    public void setAsalKeberangkatan(String asalKeberangkatan) {
        this.asalKeberangkatan = asalKeberangkatan;
    }

    public String getLokasiKedatangan() {
        return lokasiKedatangan;
    }

    public void setLokasiKedatangan(String lokasiKedatangan) {
        this.lokasiKedatangan = lokasiKedatangan;
    }

    public String getTanggalWaktuKedatangan() {
        return tanggalWaktuKedatangan;
    }

    public void setTanggalWaktuKedatangan(String tanggalWaktuKedatangan) {
        this.tanggalWaktuKedatangan = tanggalWaktuKedatangan;
    }

    public String getKKKRTRWTujuan() {
        return kKKRTRWTujuan;
    }

    public void setKKKRTRWTujuan(String kKKRTRWTujuan) {
        this.kKKRTRWTujuan = kKKRTRWTujuan;
    }

    public String getLamaBerkunjung() {
        return lamaBerkunjung;
    }

    public void setLamaBerkunjung(String lamaBerkunjung) {
        this.lamaBerkunjung = lamaBerkunjung;
    }

    public String getKondisiKesehatan() {
        return kondisiKesehatan;
    }

    public void setKondisiKesehatan(String kondisiKesehatan) {
        this.kondisiKesehatan = kondisiKesehatan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nik != null ? nik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pendataanpendatangkekotasemarang)) {
            return false;
        }
        Pendataanpendatangkekotasemarang other = (Pendataanpendatangkekotasemarang) object;
        if ((this.nik == null && other.nik != null) || (this.nik != null && !this.nik.equals(other.nik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PendataanPendatangDanPendaftaranRelawan.Pendataanpendatangkekotasemarang[ nik=" + nik + " ]";
    }
    
}
