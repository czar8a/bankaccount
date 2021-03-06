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
public class TransactionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCOUNTIDFINANCIALCOMPANY")
    private BigInteger accountidfinancialcompany;
    @Basic(optional = false)
    @Column(name = "IDACCOUNT")
    private String idaccount;
    @Basic(optional = false)
    @Column(name = "IDTIPOTRANSACCION")
    private BigInteger idtipotransaccion;
    @Basic(optional = false)
    @Column(name = "TRANSACTIONDATE")
    private String transactiondate;

    public TransactionsPK() {
    }

    public TransactionsPK(BigInteger accountidfinancialcompany, String idaccount, BigInteger idtipotransaccion, String transactiondate) {
        this.accountidfinancialcompany = accountidfinancialcompany;
        this.idaccount = idaccount;
        this.idtipotransaccion = idtipotransaccion;
        this.transactiondate = transactiondate;
    }

    public BigInteger getAccountidfinancialcompany() {
        return accountidfinancialcompany;
    }

    public void setAccountidfinancialcompany(BigInteger accountidfinancialcompany) {
        this.accountidfinancialcompany = accountidfinancialcompany;
    }

    public String getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(String idaccount) {
        this.idaccount = idaccount;
    }

    public BigInteger getIdtipotransaccion() {
        return idtipotransaccion;
    }

    public void setIdtipotransaccion(BigInteger idtipotransaccion) {
        this.idtipotransaccion = idtipotransaccion;
    }

    public String getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(String transactiondate) {
        this.transactiondate = transactiondate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountidfinancialcompany != null ? accountidfinancialcompany.hashCode() : 0);
        hash += (idaccount != null ? idaccount.hashCode() : 0);
        hash += (idtipotransaccion != null ? idtipotransaccion.hashCode() : 0);
        hash += (transactiondate != null ? transactiondate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionsPK)) {
            return false;
        }
        TransactionsPK other = (TransactionsPK) object;
        if ((this.accountidfinancialcompany == null && other.accountidfinancialcompany != null) || (this.accountidfinancialcompany != null && !this.accountidfinancialcompany.equals(other.accountidfinancialcompany))) {
            return false;
        }
        if ((this.idaccount == null && other.idaccount != null) || (this.idaccount != null && !this.idaccount.equals(other.idaccount))) {
            return false;
        }
        if ((this.idtipotransaccion == null && other.idtipotransaccion != null) || (this.idtipotransaccion != null && !this.idtipotransaccion.equals(other.idtipotransaccion))) {
            return false;
        }
        if ((this.transactiondate == null && other.transactiondate != null) || (this.transactiondate != null && !this.transactiondate.equals(other.transactiondate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TransactionsPK[ accountidfinancialcompany=" + accountidfinancialcompany + ", idaccount=" + idaccount + ", idtipotransaccion=" + idtipotransaccion + ", transactiondate=" + transactiondate + " ]";
    }
    
}
