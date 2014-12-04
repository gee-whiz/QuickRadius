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
@Table(name = "onlineusers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Onlineusers.findAll", query = "SELECT o FROM Onlineusers o")})
public class Onlineusers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "onlineUserID")
    private Integer onlineUserID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "userName")
    private String userName;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ipAddress")
    private Double ipAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "startTime")
    private String startTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "totalTime")
    private String totalTime;
    @Column(name = "hotSpot")
    private Double hotSpot;
    @Column(name = "totalTraffic")
    private Double totalTraffic;
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    @ManyToOne(optional = false)
    private User userID;

    public Onlineusers() {
    }

    public Onlineusers(Integer onlineUserID) {
        this.onlineUserID = onlineUserID;
    }

    public Onlineusers(Integer onlineUserID, String userName, String startTime, String totalTime) {
        this.onlineUserID = onlineUserID;
        this.userName = userName;
        this.startTime = startTime;
        this.totalTime = totalTime;
    }

    public Integer getOnlineUserID() {
        return onlineUserID;
    }

    public void setOnlineUserID(Integer onlineUserID) {
        this.onlineUserID = onlineUserID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(Double ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public Double getHotSpot() {
        return hotSpot;
    }

    public void setHotSpot(Double hotSpot) {
        this.hotSpot = hotSpot;
    }

    public Double getTotalTraffic() {
        return totalTraffic;
    }

    public void setTotalTraffic(Double totalTraffic) {
        this.totalTraffic = totalTraffic;
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
        hash += (onlineUserID != null ? onlineUserID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Onlineusers)) {
            return false;
        }
        Onlineusers other = (Onlineusers) object;
        if ((this.onlineUserID == null && other.onlineUserID != null) || (this.onlineUserID != null && !this.onlineUserID.equals(other.onlineUserID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.george.quickradiusdb.data.Onlineusers[ onlineUserID=" + onlineUserID + " ]";
    }
    
}
