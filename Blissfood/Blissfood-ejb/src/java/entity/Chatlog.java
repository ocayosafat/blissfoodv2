/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author DELL
 */
@Entity
public class Chatlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String chat;

    @OneToOne
    private Post post;

    @ManyToOne
    private BlissfoodUser giver;

    @ManyToOne
    private BlissfoodUser receiver;

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
        if (!(object instanceof Chatlog)) {
            return false;
        }
        Chatlog other = (Chatlog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Chatlog[ id=" + id + " ]";
    }

    /**
     * @return the chat
     */
    public String getChat() {
        return chat;
    }

    /**
     * @param chat the chat to set
     */
    public void setChat(String chat) {
        this.chat = chat;
    }

    /**
     * @return the giver
     */
    public BlissfoodUser getGiver() {
        return giver;
    }

    /**
     * @param giver the giver to set
     */
    public void setGiver(BlissfoodUser giver) {
        this.giver = giver;
    }

    /**
     * @return the receiver
     */
    public BlissfoodUser getReceiver() {
        return receiver;
    }

    /**
     * @param receiver the receiver to set
     */
    public void setReceiver(BlissfoodUser receiver) {
        this.receiver = receiver;
    }

    /**
     * @return the post
     */
    public Post getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(Post post) {
        this.post = post;
    }

}
