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
public class Dompet extends Additional implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namaDompet;
    private String jumlahUang;
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
        if (!(object instanceof Dompet)) {
            return false;
        }
        Dompet other = (Dompet) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Dompet[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the namaDompet
     */
    public String getNamaDompet() {
        return namaDompet;
    }

    /**
     * @param namaDompet the namaDompet to set
     */
    public void setNamaDompet(String namaDompet) {
        this.namaDompet = namaDompet;
    }

    /**
     * @return the jumlahUang
     */
    public String getJumlahUang() {
        return jumlahUang;
    }

    /**
     * @param jumlahUang the jumlahUang to set
     */
    public void setJumlahUang(String jumlahUang) {
        this.jumlahUang = jumlahUang;
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

}
