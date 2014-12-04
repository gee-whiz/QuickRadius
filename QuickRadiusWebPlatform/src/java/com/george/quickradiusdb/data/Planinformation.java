/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.george.quickradiusdb.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "planinformation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planinformation.findAll", query = "SELECT p FROM Planinformation p")})
public class Planinformation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "planInformationID")
    private Integer planInformationID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "userName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "plan")
    private String plan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "used")
    private double used;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allowedByPlan")
    private double allowedByPlan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "remaining")
    private Double remaining;
    @JoinColumn(name = "companyID", referencedColumnName = "companyID")
    @ManyToOne(optional = false)
    private Company companyID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "planInformation")
    private List<User> userList;

    public Planinformation() {
    }

    public Planinformation(Integer planInformationID) {
        this.planInformationID = planInformationID;
    }

    public Planinformation(Integer planInformationID, String userName, String plan, double used, double allowedByPlan) {
        this.planInformationID = planInformationID;
        this.userName = userName;
        this.plan = plan;
        this.used = used;
        this.allowedByPlan = allowedByPlan;
    }

    public Integer getPlanInformationID() {
        return planInformationID;
    }

    public void setPlanInformationID(Integer planInformationID) {
        this.planInformationID = planInformationID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public double getUsed() {
        return used;
    }

    public void setUsed(double used) {
        this.used = used;
    }

    public double getAllowedByPlan() {
        return allowedByPlan;
    }

    public void setAllowedByPlan(double allowedByPlan) {
        this.allowedByPlan = allowedByPlan;
    }

    public Double getRemaining() {
        return remaining;
    }

    public void setRemaining(Double remaining) {
        this.remaining = remaining;
    }

    public Company getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Company companyID) {
        this.companyID = companyID;
    }

    @XmlTransient
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planInformationID != null ? planInformationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planinformation)) {
            return false;
        }
        Planinformation other = (Planinformation) object;
        if ((this.planInformationID == null && other.planInformationID != null) || (this.planInformationID != null && !this.planInformationID.equals(other.planInformationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.george.quickradiusdb.data.Planinformation[ planInformationID=" + planInformationID + " ]";
    }
    
}
