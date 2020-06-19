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
@Table(name = "pendaftaranrelawan")
@NamedQueries({
    @NamedQuery(name = "Pendaftaranrelawan.findAll", query = "SELECT p FROM Pendaftaranrelawan p")
    , @NamedQuery(name = "Pendaftaranrelawan.findByNama", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.nama = :nama")
    , @NamedQuery(name = "Pendaftaranrelawan.findByNoHP", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.noHP = :noHP")
    , @NamedQuery(name = "Pendaftaranrelawan.findByEmail", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.email = :email")
    , @NamedQuery(name = "Pendaftaranrelawan.findByJnsId", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.jnsId = :jnsId")
    , @NamedQuery(name = "Pendaftaranrelawan.findByNoId", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.noId = :noId")
    , @NamedQuery(name = "Pendaftaranrelawan.findByAlamatKId", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.alamatKId = :alamatKId")
    , @NamedQuery(name = "Pendaftaranrelawan.findByJenisKlmn", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.jenisKlmn = :jenisKlmn")
    , @NamedQuery(name = "Pendaftaranrelawan.findByTtl", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.ttl = :ttl")
    , @NamedQuery(name = "Pendaftaranrelawan.findByAgama", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.agama = :agama")
    , @NamedQuery(name = "Pendaftaranrelawan.findByStatusPerkawinan", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.statusPerkawinan = :statusPerkawinan")
    , @NamedQuery(name = "Pendaftaranrelawan.findByPekerjaan", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.pekerjaan = :pekerjaan")
    , @NamedQuery(name = "Pendaftaranrelawan.findByPendidikan", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.pendidikan = :pendidikan")
    , @NamedQuery(name = "Pendaftaranrelawan.findByGoldar", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.goldar = :goldar")
    , @NamedQuery(name = "Pendaftaranrelawan.findByAlamatDomisili", query = "SELECT p FROM Pendaftaranrelawan p WHERE p.alamatDomisili = :alamatDomisili")})
public class Pendaftaranrelawan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "Nama")
    private String nama;
    @Size(max = 50)
    @Column(name = "No_HP")
    private String noHP;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "Email")
    private String email;
    @Size(max = 50)
    @Column(name = "Jns_Id")
    private String jnsId;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "No_Id")
    private String noId;
    @Size(max = 600)
    @Column(name = "Alamat_KId")
    private String alamatKId;
    @Size(max = 50)
    @Column(name = "Jenis_Klmn")
    private String jenisKlmn;
    @Size(max = 100)
    @Column(name = "TTL")
    private String ttl;
    @Size(max = 50)
    @Column(name = "Agama")
    private String agama;
    @Size(max = 50)
    @Column(name = "Status_Perkawinan")
    private String statusPerkawinan;
    @Size(max = 100)
    @Column(name = "Pekerjaan")
    private String pekerjaan;
    @Size(max = 50)
    @Column(name = "Pendidikan")
    private String pendidikan;
    @Size(max = 20)
    @Column(name = "Goldar")
    private String goldar;
    @Size(max = 600)
    @Column(name = "Alamat_Domisili")
    private String alamatDomisili;

    public Pendaftaranrelawan() {
    }

    public Pendaftaranrelawan(String noId) {
        this.noId = noId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJnsId() {
        return jnsId;
    }

    public void setJnsId(String jnsId) {
        this.jnsId = jnsId;
    }

    public String getNoId() {
        return noId;
    }

    public void setNoId(String noId) {
        this.noId = noId;
    }

    public String getAlamatKId() {
        return alamatKId;
    }

    public void setAlamatKId(String alamatKId) {
        this.alamatKId = alamatKId;
    }

    public String getJenisKlmn() {
        return jenisKlmn;
    }

    public void setJenisKlmn(String jenisKlmn) {
        this.jenisKlmn = jenisKlmn;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }

    public String getAlamatDomisili() {
        return alamatDomisili;
    }

    public void setAlamatDomisili(String alamatDomisili) {
        this.alamatDomisili = alamatDomisili;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noId != null ? noId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pendaftaranrelawan)) {
            return false;
        }
        Pendaftaranrelawan other = (Pendaftaranrelawan) object;
        if ((this.noId == null && other.noId != null) || (this.noId != null && !this.noId.equals(other.noId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PendataanPendatangDanPendaftaranRelawan.Pendaftaranrelawan[ noId=" + noId + " ]";
    }
    
}
