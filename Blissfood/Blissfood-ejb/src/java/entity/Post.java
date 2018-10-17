/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aden
 */
@Entity
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String status = "Available"; //available, reserved, given
    @Temporal(TemporalType.DATE)
    private Date created;
    private String category;
    private String foodCondition; // New, Partially Used Up
    private String location;
    @Temporal(TemporalType.DATE)
    private Date expiry;
    private boolean extended;
    private int numLikes;
    private boolean deleted;
    private int numReports;

    @OneToMany
    private List<PostPhoto> postphotos;

    @ManyToOne
    private BlissfoodUser giver;

    @ManyToOne
    private BlissfoodUser receiver;

    @OneToMany(mappedBy="post")
    private List<ReportPost> reports;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Post[ id=" + id + " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public boolean isExtended() {
        return extended;
    }

    public void setExtended(boolean extended) {
        this.extended = extended;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getNumReports() {
        return numReports;
    }

    public void setNumReports(int numReports) {
        this.numReports = numReports;
    }

    public List<PostPhoto> getPostphotos() {
        return postphotos;
    }

    public void setPostphotos(List<PostPhoto> postphotos) {
        this.postphotos = postphotos;
    }

    public BlissfoodUser getGiver() {
        return giver;
    }

    public void setGiver(BlissfoodUser giver) {
        this.giver = giver;
    }

    public BlissfoodUser getReceiver() {
        return receiver;
    }

    public void setReceiver(BlissfoodUser receiver) {
        this.receiver = receiver;
    }

    /**
     * @return the foodCondition
     */
    public String getFoodCondition() {
        return foodCondition;
    }

    /**
     * @param foodCondition the foodCondition to set
     */
    public void setFoodCondition(String foodCondition) {
        this.foodCondition = foodCondition;
    }

    /**
     * @return the reports
     */
    public List<ReportPost> getReports() {
        return reports;
    }

    /**
     * @param reports the reports to set
     */
    public void setReports(List<ReportPost> reports) {
        this.reports = reports;
    }
}
