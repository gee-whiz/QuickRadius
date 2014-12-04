/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.george.quickradiusdb.data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "lastconnectionattempt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lastconnectionattempt.findAll", query = "SELECT l FROM Lastconnectionattempt l")})
public class Lastconnectionattempt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "lastConnectionAttemptID")
    private Integer lastConnectionAttemptID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "userName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @Size(max = 45)
    @Column(name = "startTime")
    private String startTime;
    @Size(max = 45)
    @Column(name = "radiusReply")
    private String radiusReply;
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    @ManyToOne(optional = false)
    private User userID;

    public Lastconnectionattempt() {
    }

    public Lastconnectionattempt(Integer lastConnectionAttemptID) {
        this.lastConnectionAttemptID = lastConnectionAttemptID;
    }

    public Lastconnectionattempt(Integer lastConnectionAttemptID, String userName, String password) {
        this.lastConnectionAttemptID = lastConnectionAttemptID;
        this.userName = userName;
        this.password = password;
    }

    public Integer getLastConnectionAttemptID() {
        return lastConnectionAttemptID;
    }

    public void setLastConnectionAttemptID(Integer lastConnectionAttemptID) {
        this.lastConnectionAttemptID = lastConnectionAttemptID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getRadiusReply() {
        return radiusReply;
    }

    public void setRadiusReply(String radiusReply) {
        this.radiusReply = radiusReply;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lastConnectionAttemptID != null ? lastConnectionAttemptID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lastconnectionattempt)) {
            return false;
        }
        Lastconnectionattempt other = (Lastconnectionattempt) object;
        if ((this.lastConnectionAttemptID == null && other.lastConnectionAttemptID != null) || (this.lastConnectionAttemptID != null && !this.lastConnectionAttemptID.equals(other.lastConnectionAttemptID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.george.quickradiusdb.data.Lastconnectionattempt[ lastConnectionAttemptID=" + lastConnectionAttemptID + " ]";
    }
    
}
