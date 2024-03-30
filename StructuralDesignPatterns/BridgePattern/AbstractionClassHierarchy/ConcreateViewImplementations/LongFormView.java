package AbstractionClassHierarchy.ConcreateViewImplementations;

import AbstractionClassHierarchy.View;
import ImplementationClassHierarchy.Resource;

public class LongFormView extends View {
    public LongFormView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        String response = resource.snippet() + " ," +
                resource.title() + " ," +
                resource.image() + " ," +
                resource.url();

        return "HTML-code in Long-Form-View : " + response;
    }
}
