/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws1.tugas.kelasC;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus ROG
 */
@Entity
@Table(name = "produk")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produk.findAll", query = "SELECT p FROM Produk p"),
    @NamedQuery(name = "Produk.findByIdproduk", query = "SELECT p FROM Produk p WHERE p.idproduk = :idproduk"),
    @NamedQuery(name = "Produk.findByNamaProduk", query = "SELECT p FROM Produk p WHERE p.namaProduk = :namaProduk"),
    @NamedQuery(name = "Produk.findBySize", query = "SELECT p FROM Produk p WHERE p.size = :size"),
    @NamedQuery(name = "Produk.findByJumlah", query = "SELECT p FROM Produk p WHERE p.jumlah = :jumlah"),
    @NamedQuery(name = "Produk.findByHarga", query = "SELECT p FROM Produk p WHERE p.harga = :harga")})
public class Produk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idproduk")
    private Integer idproduk;
    @Column(name = "nama_produk")
    private String namaProduk;
    @Column(name = "size")
    private String size;
    @Column(name = "jumlah")
    private Integer jumlah;
    @Column(name = "harga")
    private String harga;

    public Produk() {
    }

    public Produk(Integer idproduk) {
        this.idproduk = idproduk;
    }

    public Integer getIdproduk() {
        return idproduk;
    }

    public void setIdproduk(Integer idproduk) {
        this.idproduk = idproduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduk != null ? idproduk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produk)) {
            return false;
        }
        Produk other = (Produk) object;
        if ((this.idproduk == null && other.idproduk != null) || (this.idproduk != null && !this.idproduk.equals(other.idproduk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pws1.tugas.kelasC.Produk[ idproduk=" + idproduk + " ]";
    }
    
}
