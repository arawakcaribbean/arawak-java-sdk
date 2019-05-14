package ca.tourism.platform.sdk.entity.mailsender  ;

import java.util.HashMap;

/**
 * Created by ups on 3/09/18.
 */
public class BodyText {

    private Head head ;
    private Text details ;
    private HashMap<String,String> headers ;

    public BodyText() {
    }

    public BodyText(Head head, Text details, HashMap<String, String> headers) {
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

    public Text getDetails() {
        return details;
    }

    public void setDetails(Text details) {
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
        return "BodyText{" +
                "head=" + head +
                ", detailsBodyText=" + details.toString() +
                ", headers=" + headers +
                '}';
    }
}
