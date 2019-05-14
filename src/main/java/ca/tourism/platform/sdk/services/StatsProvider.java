package ca.tourism.platform.sdk.services;

import ca.tourism.platform.sdk.core.RestClientProvider;
import ca.tourism.platform.sdk.entity.stats.DataPoint;
import ca.tourism.platform.sdk.exceptions.HttpException;

/**
 * Created by ups on 8/05/19.
 */
public class StatsProvider {

    private RestClientProvider restClientProvider ;

    public StatsProvider(String secretToken) {
        this.restClientProvider = new RestClientProvider(secretToken) ;
    }

    /**
     * Allows you to write a one data point (a statistic)
     * @param dataPoint
     * @return
     * @throws HttpException
     */
    public String write(DataPoint dataPoint) throws HttpException {
        return restClientProvider.post("/api/v1/influxdb/write", String.class, dataPoint);
    }

}
