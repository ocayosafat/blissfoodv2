package entity;

import entity.Chatlog;
import entity.Post;
import entity.ReportUser;
import entity.Review;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T18:55:56")
@StaticMetamodel(BlissfoodUser.class)
public class BlissfoodUser_ { 

    public static volatile SingularAttribute<BlissfoodUser, byte[]> displayPicture;
    public static volatile ListAttribute<BlissfoodUser, Chatlog> chatlogsAsGiver;
    public static volatile SingularAttribute<BlissfoodUser, String> lastName;
    public static volatile ListAttribute<BlissfoodUser, ReportUser> reports;
    public static volatile SingularAttribute<BlissfoodUser, String> gender;
    public static volatile SingularAttribute<BlissfoodUser, String> city;
    public static volatile SingularAttribute<BlissfoodUser, Date> created;
    public static volatile ListAttribute<BlissfoodUser, Review> reviewsAsReceiver;
    public static volatile ListAttribute<BlissfoodUser, Post> receiverPosts;
    public static volatile ListAttribute<BlissfoodUser, Post> giverPosts;
    public static volatile SingularAttribute<BlissfoodUser, String> firstName;
    public static volatile SingularAttribute<BlissfoodUser, String> password;
    public static volatile SingularAttribute<BlissfoodUser, Integer> numReports;
    public static volatile ListAttribute<BlissfoodUser, Review> reviewsAsGiver;
    public static volatile SingularAttribute<BlissfoodUser, Date> dob;
    public static volatile ListAttribute<BlissfoodUser, Chatlog> chatlogsAsReceiver;
    public static volatile SingularAttribute<BlissfoodUser, String> contactNumber;
    public static volatile SingularAttribute<BlissfoodUser, Long> id;
    public static volatile SingularAttribute<BlissfoodUser, Boolean> banned;
    public static volatile SingularAttribute<BlissfoodUser, String> email;
    public static volatile SingularAttribute<BlissfoodUser, String> username;

}