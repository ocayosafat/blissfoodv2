/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DELL
 */
@Entity
public class ReportUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String category;
    @Temporal(TemporalType.DATE)
    private Date created;

    @OneToOne
    private BlissfoodUser reporter;

    @ManyToOne
    private BlissfoodUser reportedUser;

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
        if (!(object instanceof ReportUser)) {
            return false;
        }
        ReportUser other = (ReportUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ReportUser[ id=" + id + " ]";
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the reporter
     */
    public BlissfoodUser getReporter() {
        return reporter;
    }

    /**
     * @param reporter the reporter to set
     */
    public void setReporter(BlissfoodUser reporter) {
        this.reporter = reporter;
    }

    /**
     * @return the reportedUser
     */
    public BlissfoodUser getReportedUser() {
        return reportedUser;
    }

    /**
     * @param reportedUser the reportedUser to set
     */
    public void setReportedUser(BlissfoodUser reportedUser) {
        this.reportedUser = reportedUser;
    }

}
