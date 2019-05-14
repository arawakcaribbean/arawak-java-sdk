package ca.tourism.platform.sdk.entity.stats ;

import java.util.HashMap;

/**
 * Created by ups on 23/10/18.
 */
public class DataPoint {

    private String measurement ;
    private HashMap<String, String> tags ;
    private HashMap<String, Object> fields ;

    public DataPoint() {
    }

    public DataPoint(String measurement, HashMap<String, String> tags, HashMap<String, Object> fields) {
        this.measurement = measurement;
        this.tags = tags;
        this.fields = fields;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public HashMap<String, String> getTags() {
        return tags;
    }

    public void setTags(HashMap<String, String> tags) {
        this.tags = tags;
    }

    public HashMap<String, Object> getFields() {
        return fields;
    }

    public void setFields(HashMap<String, Object> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "DataPoint{" +
                "measurement='" + measurement + '\'' +
                ", tags=" + tags +
                ", fields=" + fields +
                '}';
    }
}
