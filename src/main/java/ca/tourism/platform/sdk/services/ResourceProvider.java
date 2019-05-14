package ca.tourism.platform.sdk.services;

import ca.tourism.platform.sdk.core.RestClientProvider;
import ca.tourism.platform.sdk.entity.claim.ClaimStatus;
import ca.tourism.platform.sdk.entity.page.CustomPage;
import ca.tourism.platform.sdk.entity.resource.Resource;
import ca.tourism.platform.sdk.exceptions.HttpException;

import java.util.List;

/**
 * Created by ups on 14/05/19.
 */
public class ResourceProvider {

    private RestClientProvider restClientProvider ;

    public ResourceProvider(String secretToken) {
        this.restClientProvider = new RestClientProvider(secretToken) ;
    }

    public Object createResource(Resource resource) throws HttpException {
        return restClientProvider.post("/api/v1/resource/entities", Object.class, resource);
    }

    public Object getById(String id) throws HttpException {
        return restClientProvider.get("/api/v1/resource/entities/" + id, Object.class);
    }

    public boolean verifyIfResourceExist(String id) throws HttpException {
        return restClientProvider.get("/api/v1/resource/entities/exists/" + id, Boolean.class);
    }

    public CustomPage<Object> getAllResourcesByEntityName(String entityName, int size, int page) throws HttpException {
        return restClientProvider.get("/api/v1/resource/entities?name=" + entityName + "&size="+size + "&page="+page, CustomPage.class);
    }

    public Object updateResource(Object o) throws HttpException {
        return restClientProvider.put("/api/v1/resource/entities", Object.class, o);
    }

    public CustomPage<String> getEntitiesAvailable(int size, int page) throws HttpException {
        return restClientProvider.get("/api/v1/resource/entities/find?size="+size + "&page="+page, CustomPage.class);
    }

    public Boolean getIfEntityIsPresent(String entityName) throws HttpException {
        return restClientProvider.get("/api/v1/resource/entities/find/name?name="+entityName, Boolean.class);
    }

    public String deleteById(String id) throws HttpException {
        return restClientProvider.delete("/api/v1/resource/entities/" + id, String.class);
    }

    public Object enableById(String id) throws HttpException {
        return restClientProvider.get("/api/v1/resource/entities/enable/" + id, Object.class);
    }

    public Object disableById(String id) throws HttpException {
        return restClientProvider.get("/api/v1/resource/entities/disable/" + id, Object.class);
    }

    public List<Object> search(String query) throws HttpException {
        return restClientProvider.get("/api/v1/resource/entities/search?query=" + query, List.class);
    }

    public CustomPage<Object> search(String query, int size, int page) throws HttpException {
        return restClientProvider.get("/api/v1/resource/entities/page/search?query="+query+"&size="+size+"&page="+page, CustomPage.class);
    }

    public List<Object> getByIdsLists(List<String> ids) throws HttpException {
        return restClientProvider.post("/api/v1/resource/entities/ids", List.class, ids);
    }

    public CustomPage<Object> getByIdsLists(List<String> ids, int size, int page) throws HttpException {
        return restClientProvider.post("/api/v1/resource/entities/page/ids?size="+size+"&page="+page, CustomPage.class, ids);
    }

    public List<Object> searchByNameAndIdsLists(List<String> ids, String query) throws HttpException {
        return restClientProvider.post("/api/v1/resource/entities/search/ids?query="+query, List.class, ids);
    }



}
