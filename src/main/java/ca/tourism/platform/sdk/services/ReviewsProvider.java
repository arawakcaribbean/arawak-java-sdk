package ca.tourism.platform.sdk.services;

import ca.tourism.platform.sdk.core.RestClientProvider;
import ca.tourism.platform.sdk.entity.reviews.Evaluation;
import ca.tourism.platform.sdk.exceptions.HttpException;

/**
 * Created by ups on 14/05/19.
 */
public class ReviewsProvider {

    private RestClientProvider restClientProvider ;

    public ReviewsProvider(String secretToken) {
        this.restClientProvider = new RestClientProvider(secretToken) ;
    }

    public Evaluation registerEvaluation(Evaluation evaluation) throws HttpException {
        return restClientProvider.post("/api/v1/review/evaluations", Evaluation.class, evaluation);
    }

    public Evaluation getEvaluationResourceByUser(String idResource, String idUser) throws HttpException {
        return restClientProvider.get("/api/v1/review/evaluations/resource/" + idResource + "/user/" + idUser, Evaluation.class);
    }

    public Float getEvaluationAverageForAResource(String idResource) throws HttpException {
        return restClientProvider.get("/api/v1/review/evaluations/resource/" + idResource, Float.class);
    }

    public String delete(String id) throws HttpException {
        return restClientProvider.delete("/api/v1/review/evaluations/" + id, String.class);
    }

}
