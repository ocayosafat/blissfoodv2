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
import javax.ejb.Local;

/**
 *
 * @author DELL
 */
@Local
public interface userSessionBeanLocal {

    public void createUser(BlissfoodUser user);

    public void updateUser(BlissfoodUser user);

    public void changeUserBanStatus(Long uId) throws NoResultException;

    public BlissfoodUser retrieveUser(Long uId);

    public BlissfoodUser retrieveUserByEmail(String email);

    public BlissfoodUser verifyLogin(String email, String password) throws NoResultException;

    public List<BlissfoodUser> retrieveAllUsers();

    public void createPost(Long gId, Post post) throws NoResultException;

    public void updatePost(Post post);

    public void deletePost(Long pId) throws NoResultException;

    public List<Post> retrievePostsByGiver(Long uId) throws NoResultException;

    public List<Post> retrievePostByReceiver(Long uId) throws NoResultException;

    public Post retrievePost(Long pId);

    public List<Post> retrieveAllPost();

    public void increasePostLikes(Long pId) throws NoResultException;

    public void increasePostReports(Long pId) throws NoResultException;

    public void addPhotoToPost(Long pId, PostPhoto photo) throws NoResultException;

    public void removePhotoFromPost(Long pId, Long photoId) throws NoResultException;

    public PostPhoto retrievePostPhoto(Long photoId);

    public void createChat(Long gId, Long rId, Long pId, Chatlog chat) throws NoResultException;

    public void updateChat(Chatlog chat);

    public void writeReview(Long gId, Long rId, Review review) throws NoResultException;

    public void createUserReport(Long gId, Long rId, ReportUser userReport);

    public void createReportPost(Long rId, Long pId, ReportPost reportPost);

    public List<Post> retrievePostByName(String name);

    public List<Post> retrievePostByDescription(String name);
}
