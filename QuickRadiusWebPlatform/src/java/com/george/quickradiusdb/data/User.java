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
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "userID")
    private Integer userID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "userName")
    private String userName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Size(max = 45)
    @Column(name = "groups")
    private String groups;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userID")
    private List<Onlineusers> onlineusersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userID")
    private List<Lastconnectionattempt> lastconnectionattemptList;
    @JoinColumn(name = "operatorID", referencedColumnName = "operatorID")
    @ManyToOne(optional = false)
    private Operators operatorID;
    @JoinColumn(name = "planInformationID", referencedColumnName = "planInformationID")
    @ManyToOne(optional = false)
    private Planinformation planInformationID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Billing> billingList;

    public User() {
    }

    public User(Integer userID) {
        this.userID = userID;
    }

    public User(Integer userID, String userName, String email, String password) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    @XmlTransient
    public List<Onlineusers> getOnlineusersList() {
        return onlineusersList;
    }

    public void setOnlineusersList(List<Onlineusers> onlineusersList) {
        this.onlineusersList = onlineusersList;
    }

    @XmlTransient
    public List<Lastconnectionattempt> getLastconnectionattemptList() {
        return lastconnectionattemptList;
    }

    public void setLastconnectionattemptList(List<Lastconnectionattempt> lastconnectionattemptList) {
        this.lastconnectionattemptList = lastconnectionattemptList;
    }

    public Operators getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(Operators operatorID) {
        this.operatorID = operatorID;
    }

    public Planinformation getPlanInformationID() {
        return planInformationID;
    }

    public void setPlanInformationID(Planinformation planInformationID) {
        this.planInformationID = planInformationID;
    }

    @XmlTransient
    public List<Billing> getBillingList() {
        return billingList;
    }

    public void setBillingList(List<Billing> billingList) {
        this.billingList = billingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.george.quickradiusdb.data.User[ userID=" + userID + " ]";
    }
    
}
