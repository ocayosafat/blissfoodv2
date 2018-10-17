/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.BlissfoodUser;
import entity.Chatlog;
import entity.Post;
import entity.PostPhoto;
import entity.ReportPost;
import entity.ReportUser;
import entity.Review;
import error.NoResultException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author DELL
 */
@Stateless
public class userSessionBean implements userSessionBeanLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void createUser(BlissfoodUser user) {
        em.persist(user);
        em.flush();
    }

    @Override
    public void updateUser(BlissfoodUser user) {
        em.merge(user);
        em.flush();
    }

    @Override
    public void changeUserBanStatus(Long uId) throws NoResultException {
        BlissfoodUser user = retrieveUser(uId);
        if (user == null) {
            throw new NoResultException("There is no such user");
        }
        user.setBanned(!user.isBanned());
    }

    @Override
    public BlissfoodUser retrieveUser(Long uId) {
        return em.find(BlissfoodUser.class, uId);
    }

    @Override
    public BlissfoodUser retrieveUserByEmail(String email) {
        Query q;

        q = em.createQuery("SELECT u FROM BlissfoodUser u WHERE " + "LOWER(u.email) LIKE :email");
        q.setParameter("email", email.toLowerCase());

        return (BlissfoodUser) q.getSingleResult();
    }

    @Override
    public BlissfoodUser verifyLogin(String email, String password) throws NoResultException {
        BlissfoodUser user = retrieveUserByEmail(email);

        if (user != null) {
            String passwordToCompare = user.getPassword();
            if (passwordToCompare.equals(password)) {  //password match
                return user;
            } else {
                throw new NoResultException("Wrong password");
            }
        } else {
            throw new NoResultException("User is not registered");
        }
    }

    @Override
    public List<BlissfoodUser> retrieveAllUsers() {
        Query q;
        q = em.createQuery("SELECT b FROM BlissfoodUser b");
        List<BlissfoodUser> listOfUsers = q.getResultList();

        return listOfUsers;
    }

    @Override
    public void createPost(Long gId, Post post) throws NoResultException {
        BlissfoodUser giver = em.find(BlissfoodUser.class, gId);

        if (giver != null) {
            em.persist(post);
            post.setGiver(giver); //set giver for post
            giver.getGiverPosts().add(post); //add post for giver
            em.merge(giver);
            em.flush();
        } else {
            throw new NoResultException("User is not found");
        }

    }

    @Override
    public void updatePost(Post post) {
        em.merge(post);
        em.flush();
    }

    @Override
    public void deletePost(Long pId) throws NoResultException {
        Post postToBeDeleted = em.find(Post.class, pId);

        if (postToBeDeleted != null) {
            postToBeDeleted.setDeleted(true);
        } else {
            throw new NoResultException("Post is not found");
        }
    }

    @Override
    public List<Post> retrievePostsByGiver(Long uId) throws NoResultException {
        BlissfoodUser user = em.find(BlissfoodUser.class, uId);

        if (user != null) {
            return user.getGiverPosts();
        } else {
            throw new NoResultException("User is not found");
        }

    }

    @Override
    public List<Post> retrievePostByReceiver(Long uId) throws NoResultException {
        BlissfoodUser user = em.find(BlissfoodUser.class, uId);

        if (user != null) {
            return user.getReceiverPosts();
        } else {
            throw new NoResultException("User is not found");
        }
    }

    @Override
    public Post retrievePost(Long pId) {
        return em.find(Post.class, pId);
    }

    @Override
    public List<Post> retrieveAllPost() {
        Query q;

        q = em.createQuery("SELECT p FROM Post p");
        List<Post> listOfPosts = q.getResultList();

        return listOfPosts;
    }

    @Override
    public void increasePostLikes(Long pId) throws NoResultException {
        Post post = em.find(Post.class, pId);

        if (post != null) {
            post.setNumLikes(post.getNumLikes() + 1);
            em.merge(post);
        } else {
            throw new NoResultException("Post is not found");
        }
    }

    @Override
    public void increasePostReports(Long pId) throws NoResultException {
        Post post = em.find(Post.class, pId);

        if (post != null) {
            post.setNumReports(post.getNumReports() + 1);
            em.merge(post);
        } else {
            throw new NoResultException("Post is not found");
        }
    }

    @Override
    public void addPhotoToPost(Long pId, PostPhoto photo) throws NoResultException {
        Post post = em.find(Post.class, pId);

        if (post != null) {
            post.getPostphotos().add(photo);
            em.merge(post);
        } else {
            throw new NoResultException("Post is not found");
        }
    }

    @Override
    public void removePhotoFromPost(Long pId, Long photoId) throws NoResultException {
        Post post = em.find(Post.class, pId);
        PostPhoto photoToBeRemoved = em.find(PostPhoto.class, photoId);
        if (post != null && photoToBeRemoved != null) {
            post.getPostphotos().remove(photoToBeRemoved);
            em.merge(post);
        } else {
            throw new NoResultException("Photo/post is not found");
        }
    }

    @Override
    public PostPhoto retrievePostPhoto(Long photoId) {
        PostPhoto photo = em.find(PostPhoto.class, photoId);
        return photo; //return null if invalid photoId
    }

    @Override
    public void createChat(Long gId, Long rId, Long pId, Chatlog chat) throws NoResultException {
        BlissfoodUser giver = em.find(BlissfoodUser.class, gId);
        BlissfoodUser receiver = em.find(BlissfoodUser.class, rId);
        Post post = em.find(Post.class, pId);

        if (giver != null && receiver != null && post != null) {
            em.persist(chat);
            chat.setGiver(giver);
            chat.setReceiver(receiver);
            giver.getChatlogsAsGiver().add(chat);
            receiver.getChatlogsAsReceiver().add(chat);
            em.merge(giver);
            em.merge(receiver);
        } else {
            throw new NoResultException("Giver/receiver/post is not found");
        }

    }

    @Override
    public void updateChat(Chatlog chat) {
        em.merge(chat);
        em.flush();
    }

    @Override
    public void writeReview(Long gId, Long rId, Review review) throws NoResultException {
        BlissfoodUser giver = em.find(BlissfoodUser.class, gId);
        BlissfoodUser receiver = em.find(BlissfoodUser.class, rId);

        if (giver != null && receiver != null) {
            em.persist(review);
            giver.getReviewsAsGiver().add(review);
            receiver.getReviewsAsReceiver().add(review);
        } else {
            throw new NoResultException("Giver/receiver is not found");
        }
    }

    @Override
    public List<Post> retrievePostByName(String name) {
        Query q;
        if (name != null) {
            q = em.createQuery("SELECT p FROM Post p WHERE "
                    + "LOWER(p.name) LIKE :name");
            q.setParameter("name", "%" + name.toLowerCase() + "%");
            return q.getResultList();
        }

        return null; //return null if name is null
    }

    @Override
    public List<Post> retrievePostByDescription(String description) {
        Query q;
        if (description != null) {
            q = em.createQuery("SELECT p FROM Post p WHERE " + "LOWER(p.description) LIKE :description");
            q.setParameter("description", "%" + description.toLowerCase() + "%");
            return q.getResultList();
        }

        return null; //return null if name is null
    }

    @Override
    public void createUserReport(Long uId1, Long uId2, ReportUser userReport) {
        BlissfoodUser reporter = em.find(BlissfoodUser.class, uId1);
        BlissfoodUser reportedUser = em.find(BlissfoodUser.class, uId2);

        if (reporter != null && reportedUser != null) {
            em.persist(userReport);
            userReport.setReporter(reporter);
            reporter.getReports().add(userReport);
            userReport.setReportedUser(reportedUser);
        }
    }

    @Override
    public void createReportPost(Long rId, Long pId, ReportPost reportPost) {
        BlissfoodUser reporter = em.find(BlissfoodUser.class, rId);
        Post post = em.find(Post.class, pId);

        if (reporter != null && post != null) {
            em.persist(reportPost);
            post.getReports().add(reportPost);
            reportPost.setPost(post);
            reportPost.setReporter(reporter);
        }
    }

}
