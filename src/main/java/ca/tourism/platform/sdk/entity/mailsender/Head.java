package ca.tourism.platform.sdk.entity.mailsender  ;

import java.util.List;

/**
 * Created by ups on 1/09/18.
 */
public class Head {

    private List<String> to ;
    private List<String> bcc ;
    private List<String> cc ;
    private String from ;

    public Head() {
    }

    public Head(List<String> to, List<String> bcc, List<String> cc, String from) {
        this.to = to;
        this.bcc = bcc;
        this.cc = cc;
        this.from = from;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
