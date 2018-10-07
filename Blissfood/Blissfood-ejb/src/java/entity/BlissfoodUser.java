/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author DELL
 */
@Entity
public class BlissfoodUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String contactNumber;
    private String firstName;
    private String lastName;
    private String city;
    private Date dob;
    private String gender;
    private byte[] displayPicture;
    private Date created;
    private int numReports;
    private boolean banned;

//    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "giver")
//    private List<Review> reviewsAsGiver;
//
//    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "receiver")
//    private List<Review> reviewsAsReceiver;
//
//    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "giver")
//    private List<Chatlog> chatlogsAsGiver;
//
//    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "receiver")
//    private List<Chatlog> chatlogsAsReceiver;
//
//    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "giver")
//    private List<Post> giverPosts;
//
//    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "receiver")
//    private List<Post> receiverPosts;

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
        if (!(object instanceof BlissfoodUser)) {
            return false;
        }
        BlissfoodUser other = (BlissfoodUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.BlissfoodUser[ id=" + id + " ]";
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the displayPicture
     */
    public byte[] getDisplayPicture() {
        return displayPicture;
    }

    /**
     * @param displayPicture the displayPicture to set
     */
    public void setDisplayPicture(byte[] displayPicture) {
        this.displayPicture = displayPicture;
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
     * @return the numReports
     */
    public int getNumReports() {
        return numReports;
    }

    /**
     * @param numReports the numReports to set
     */
    public void setNumReports(int numReports) {
        this.numReports = numReports;
    }

    /**
     * @return the banned
     */
    public boolean isBanned() {
        return banned;
    }

    /**
     * @param banned the banned to set
     */
    public void setBanned(boolean banned) {
        this.banned = banned;
    }

//    /**
//     * @return the reviewsAsGiver
//     */
//    public List<Review> getReviewsAsGiver() {
//        return reviewsAsGiver;
//    }
//
//    /**
//     * @param reviewsAsGiver the reviewsAsGiver to set
//     */
//    public void setReviewsAsGiver(List<Review> reviewsAsGiver) {
//        this.reviewsAsGiver = reviewsAsGiver;
//    }
//
//    /**
//     * @return the reviewsAsReceiver
//     */
//    public List<Review> getReviewsAsReceiver() {
//        return reviewsAsReceiver;
//    }
//
//    /**
//     * @param reviewsAsReceiver the reviewsAsReceiver to set
//     */
//    public void setReviewsAsReceiver(List<Review> reviewsAsReceiver) {
//        this.reviewsAsReceiver = reviewsAsReceiver;
//    }
//
//    /**
//     * @return the chatlogsAsGiver
//     */
//    public List<Chatlog> getChatlogsAsGiver() {
//        return chatlogsAsGiver;
//    }
//
//    /**
//     * @param chatlogsAsGiver the chatlogsAsGiver to set
//     */
//    public void setChatlogsAsGiver(List<Chatlog> chatlogsAsGiver) {
//        this.chatlogsAsGiver = chatlogsAsGiver;
//    }
//
//    /**
//     * @return the chatlogsAsReceiver
//     */
//    public List<Chatlog> getChatlogsAsReceiver() {
//        return chatlogsAsReceiver;
//    }
//
//    /**
//     * @param chatlogsAsReceiver the chatlogsAsReceiver to set
//     */
//    public void setChatlogsAsReceiver(List<Chatlog> chatlogsAsReceiver) {
//        this.chatlogsAsReceiver = chatlogsAsReceiver;
//    }
//
//    /**
//     * @return the giverPosts
//     */
//    public List<Post> getGiverPosts() {
//        return giverPosts;
//    }
//
//    /**
//     * @param giverPosts the giverPosts to set
//     */
//    public void setGiverPosts(List<Post> giverPosts) {
//        this.giverPosts = giverPosts;
//    }
//
//    /**
//     * @return the receiverPosts
//     */
//    public List<Post> getReceiverPosts() {
//        return receiverPosts;
//    }
//
//    /**
//     * @param receiverPosts the receiverPosts to set
//     */
//    public void setReceiverPosts(List<Post> receiverPosts) {
//        this.receiverPosts = receiverPosts;
//    }

}
