package ottservice.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ottservice.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/subscriberManagements")
@Transactional
public class SubscriberManagementController {

    @Autowired
    SubscriberManagementRepository subscriberManagementRepository;
}
//>>> Clean Arch / Inbound Adaptor
