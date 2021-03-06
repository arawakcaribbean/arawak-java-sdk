package ca.tourism.platform.sdk.entity.mailsender  ;

import java.util.HashMap;

/**
 * Created by ups on 3/09/18.
 */
public class BodyTemplate {

    private Head head ;
    private Html details ;
    private HashMap<String,String> headers ;

    public BodyTemplate() {
    }

    public BodyTemplate(Head head, Html details, HashMap<String, String> headers) {
        this.head = head;
        this.details = details;
        this.headers = headers;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Html getDetails() {
        return details;
    }

    public void setDetails(Html details) {
        this.details = details;
    }

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    @Override
    public String toString() {
        return "BodyTemplate{" +
                "head=" + head +
                ", detailsBodyTemplate=" + details.toString() +
                ", headers=" + headers +
                '}';
    }
}
