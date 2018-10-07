package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T14:59:11")
@StaticMetamodel(Review.class)
public class Review_ { 

    public static volatile SingularAttribute<Review, Date> created;
    public static volatile SingularAttribute<Review, String> description;
    public static volatile SingularAttribute<Review, Long> id;
    public static volatile SingularAttribute<Review, String> title;
    public static volatile SingularAttribute<Review, Boolean> liked;

}