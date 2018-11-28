package com.MM.projek.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author rasyid
 */
@Entity
public class Kategory extends Additional implements Serializable {
    @JsonIgnore
    @OneToMany(mappedBy = "kategory")
    private List<Pengeluaran> pengeluarans;
    @JsonIgnore
    @OneToMany(mappedBy = "kategory")
    private List<Dompet> dompets;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namaKategory;
    private String gambarKategory;
    private String jenisKategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kategory)) {
            return false;
        }
        Kategory other = (Kategory) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Kategory[ id=" + getId() + " ]";
    }

    /**
     * @return the dompets
     */
    public List<Dompet> getDompets() {
        return dompets;
    }

    /**
     * @param dompets the dompets to set
     */
    public void setDompets(List<Dompet> dompets) {
        this.dompets = dompets;
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return the namaKategory
     */
    public String getNamaKategory() {
        return namaKategory;
    }

    /**
     * @param namaKategory the namaKategory to set
     */
    public void setNamaKategory(String namaKategory) {
        this.namaKategory = namaKategory;
    }

    /**
     * @return the gambarKategory
     */
    public String getGambarKategory() {
        return gambarKategory;
    }

    /**
     * @param gambarKategory the gambarKategory to set
     */
    public void setGambarKategory(String gambarKategory) {
        this.gambarKategory = gambarKategory;
    }

    /**
     * @return the jenisKategory
     */
    public String getJenisKategory() {
        return jenisKategory;
    }

    /**
     * @param jenisKategory the jenisKategory to set
     */
    public void setJenisKategory(String jenisKategory) {
        this.jenisKategory = jenisKategory;
    }

    /**
     * @return the pengeluarans
     */
    public List<Pengeluaran> getPengeluarans() {
        return pengeluarans;
    }

    /**
     * @param pengeluarans the pengeluarans to set
     */
    public void setPengeluarans(List<Pengeluaran> pengeluarans) {
        this.pengeluarans = pengeluarans;
    }

}
