package AbstractionClassHierarchy;

import ImplementationClassHierarchy.Resource;

public abstract class View {
    public Resource resource;

    public View(Resource resource) {
        this.resource = resource;
    }

    public abstract String show(); //some JSON data in the string format
}
