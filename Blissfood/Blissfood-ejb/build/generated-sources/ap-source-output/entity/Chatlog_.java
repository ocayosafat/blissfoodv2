package entity;

import entity.BlissfoodUser;
import entity.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T18:55:56")
@StaticMetamodel(Chatlog.class)
public class Chatlog_ { 

    public static volatile SingularAttribute<Chatlog, Post> post;
    public static volatile SingularAttribute<Chatlog, BlissfoodUser> receiver;
    public static volatile SingularAttribute<Chatlog, String> chat;
    public static volatile SingularAttribute<Chatlog, Long> id;
    public static volatile SingularAttribute<Chatlog, BlissfoodUser> giver;

}