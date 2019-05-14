package ca.tourism.platform.sdk.entity.bookeable ;


import java.util.List;

/**
 * Created by ups on 1/05/19.
 */
public class ResourceWithVirtualBookeables {

    private String id;
    List<VirtualBookable> virtualBookables;

    public ResourceWithVirtualBookeables() {
    }

    public ResourceWithVirtualBookeables(String id, List<VirtualBookable> virtualBookables) {
        this.id = id;
        this.virtualBookables = virtualBookables;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<VirtualBookable> getVirtualBookables() {
        return virtualBookables;
    }

    public void setVirtualBookables(List<VirtualBookable> virtualBookables) {
        this.virtualBookables = virtualBookables;
    }
}
