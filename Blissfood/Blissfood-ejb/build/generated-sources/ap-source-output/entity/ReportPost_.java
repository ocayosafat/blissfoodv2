package entity;

import entity.BlissfoodUser;
import entity.Post;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T18:55:56")
@StaticMetamodel(ReportPost.class)
public class ReportPost_ { 

    public static volatile SingularAttribute<ReportPost, Post> post;
    public static volatile SingularAttribute<ReportPost, Date> created;
    public static volatile SingularAttribute<ReportPost, BlissfoodUser> reporter;
    public static volatile SingularAttribute<ReportPost, Long> id;
    public static volatile SingularAttribute<ReportPost, String> category;

}