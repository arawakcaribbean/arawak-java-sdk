package ca.tourism.platform.sdk.services;

import ca.tourism.platform.sdk.core.RestClientProvider;
import ca.tourism.platform.sdk.entity.claim.Claim;
import ca.tourism.platform.sdk.entity.claim.ClaimStatus;
import ca.tourism.platform.sdk.exceptions.HttpException;

/**
 * Created by ups on 9/05/19.
 */
public class ClaimProvider {

    private RestClientProvider restClientProvider ;

    public ClaimProvider(String secretToken) {
        this.restClientProvider = new RestClientProvider(secretToken) ;
    }

    public Claim createClaim(Claim claim) throws HttpException {
        return restClientProvider.post("/api/v1/claim/claims", Claim.class, claim);
    }

    public Claim updateClaimStatus(String id, ClaimStatus status) throws HttpException {
        return restClientProvider.put("/api/v1/claim/claims/"+id+"/"+status, Claim.class, null);
    }

    public Claim getClaimInfo(String resourceId, String userId) throws HttpException {
        return restClientProvider.get("/api/v1/claim/claims/"+resourceId+"/"+userId, Claim.class);
    }

}
