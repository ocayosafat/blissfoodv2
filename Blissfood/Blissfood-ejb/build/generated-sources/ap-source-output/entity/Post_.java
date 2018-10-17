package entity;

import entity.BlissfoodUser;
import entity.PostPhoto;
import entity.ReportPost;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T18:55:56")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile ListAttribute<Post, ReportPost> reports;
    public static volatile SingularAttribute<Post, BlissfoodUser> receiver;
    public static volatile SingularAttribute<Post, Date> created;
    public static volatile SingularAttribute<Post, String> description;
    public static volatile SingularAttribute<Post, Integer> numLikes;
    public static volatile SingularAttribute<Post, String> foodCondition;
    public static volatile SingularAttribute<Post, Boolean> extended;
    public static volatile SingularAttribute<Post, Boolean> deleted;
    public static volatile SingularAttribute<Post, Integer> numReports;
    public static volatile ListAttribute<Post, PostPhoto> postphotos;
    public static volatile SingularAttribute<Post, String> name;
    public static volatile SingularAttribute<Post, String> location;
    public static volatile SingularAttribute<Post, Long> id;
    public static volatile SingularAttribute<Post, Date> expiry;
    public static volatile SingularAttribute<Post, String> category;
    public static volatile SingularAttribute<Post, BlissfoodUser> giver;
    public static volatile SingularAttribute<Post, String> status;

}