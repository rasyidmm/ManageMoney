package com.MM.projek.model;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author rasyid
 */
@Entity
public class Pengeluaran extends Additional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namaPengeluaran;
    private String JumlahUang;
    @ManyToOne
    private Kategory kategory;
    @ManyToOne
    private Member member;


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
        if (!(object instanceof Pengeluaran)) {
            return false;
        }
        Pengeluaran other = (Pengeluaran) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pengeluaran[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return the namaPengeluaran
     */
    public String getNamaPengeluaran() {
        return namaPengeluaran;
    }

    /**
     * @param namaPengeluaran the namaPengeluaran to set
     */
    public void setNamaPengeluaran(String namaPengeluaran) {
        this.namaPengeluaran = namaPengeluaran;
    }

    /**
     * @return the JumlahUang
     */
    public String getJumlahUang() {
        return JumlahUang;
    }

    /**
     * @param JumlahUang the JumlahUang to set
     */
    public void setJumlahUang(String JumlahUang) {
        this.JumlahUang = JumlahUang;
    }

    /**
     * @return the kategory
     */
    public Kategory getKategory() {
        return kategory;
    }

    /**
     * @param kategory the kategory to set
     */
    public void setKategory(Kategory kategory) {
        this.kategory = kategory;
    }

    /**
     * @return the member
     */
    public Member getMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * @return the kategory
     */


}
