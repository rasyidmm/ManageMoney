package com.MM.projek.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author rasyid
 */
@Entity
public class Member extends Additional implements Serializable {

    @OneToMany(mappedBy = "member")
    private List<Pengeluaran> pengeluarans;

    @OneToMany(mappedBy = "member")
    private List<Dompet> dompets;

    @OneToOne(mappedBy = "member")
    private Login login;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String alamatMember;
    private String File;
    private String noHandphone;


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
        if (!(object instanceof Member)) {
            return false;
        }
        Member other = (Member) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Member[ id=" + getId() + " ]";
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the alamatMember
     */
    public String getAlamatMember() {
        return alamatMember;
    }

    /**
     * @param alamatMember the alamatMember to set
     */
    public void setAlamatMember(String alamatMember) {
        this.alamatMember = alamatMember;
    }

    /**
     * @return the File
     */
    public String getFile() {
        return File;
    }

    /**
     * @param File the File to set
     */
    public void setFile(String File) {
        this.File = File;
    }

    /**
     * @return the noHandphone
     */
    public String getNoHandphone() {
        return noHandphone;
    }

    /**
     * @param noHandphone the noHandphone to set
     */
    public void setNoHandphone(String noHandphone) {
        this.noHandphone = noHandphone;
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

}
