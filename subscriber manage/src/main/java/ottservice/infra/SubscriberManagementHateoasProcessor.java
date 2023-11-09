package ottservice.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import ottservice.domain.*;

@Component
public class SubscriberManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SubscriberManagement>> {

    @Override
    public EntityModel<SubscriberManagement> process(
        EntityModel<SubscriberManagement> model
    ) {
        return model;
    }
}
