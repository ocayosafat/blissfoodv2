package entity;

import entity.BlissfoodUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-07T18:55:56")
@StaticMetamodel(ReportUser.class)
public class ReportUser_ { 

    public static volatile SingularAttribute<ReportUser, BlissfoodUser> reportedUser;
    public static volatile SingularAttribute<ReportUser, Date> created;
    public static volatile SingularAttribute<ReportUser, BlissfoodUser> reporter;
    public static volatile SingularAttribute<ReportUser, Long> id;
    public static volatile SingularAttribute<ReportUser, String> category;

}