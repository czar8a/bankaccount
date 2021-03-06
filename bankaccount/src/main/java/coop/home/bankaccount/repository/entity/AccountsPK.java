/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coop.home.bankaccount.repository.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author cochoa
 */
@Embeddable
public class AccountsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDACCOUNT")
    private String idaccount;
    @Basic(optional = false)
    @Column(name = "USERSIDFINANCIALCOMPANY")
    private BigInteger usersidfinancialcompany;

    public AccountsPK() {
    }

    public AccountsPK(String idaccount, BigInteger usersidfinancialcompany) {
        this.idaccount = idaccount;
        this.usersidfinancialcompany = usersidfinancialcompany;
    }

    public String getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(String idaccount) {
        this.idaccount = idaccount;
    }

    public BigInteger getUsersidfinancialcompany() {
        return usersidfinancialcompany;
    }

    public void setUsersidfinancialcompany(BigInteger usersidfinancialcompany) {
        this.usersidfinancialcompany = usersidfinancialcompany;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaccount != null ? idaccount.hashCode() : 0);
        hash += (usersidfinancialcompany != null ? usersidfinancialcompany.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountsPK)) {
            return false;
        }
        AccountsPK other = (AccountsPK) object;
        if ((this.idaccount == null && other.idaccount != null) || (this.idaccount != null && !this.idaccount.equals(other.idaccount))) {
            return false;
        }
        if ((this.usersidfinancialcompany == null && other.usersidfinancialcompany != null) || (this.usersidfinancialcompany != null && !this.usersidfinancialcompany.equals(other.usersidfinancialcompany))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.AccountsPK[ idaccount=" + idaccount + ", usersidfinancialcompany=" + usersidfinancialcompany + " ]";
    }
    
}
