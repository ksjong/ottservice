package ottservice.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "MypageUser_table")
@Data
public class MypageUser {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long userId;
    private String serviceName;
    private String serviceId;
    private Date subscribeDate;
    private Date subscribeTime;
    private Date serviceDate;
    private Integer subscriberNumber;
}
