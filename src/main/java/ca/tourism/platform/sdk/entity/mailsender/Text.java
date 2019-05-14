package ca.tourism.platform.sdk.entity.mailsender  ;

import java.util.List;

/**
 * Created by ups on 2/09/18.
 */
public class Text {

    private String body ;
    String subject;
    List<String> attachments ;

    public Text() {
    }

    public Text(String body, String subject, List<String> attachments) {
        this.body = body;
        this.subject = subject;
        this.attachments = attachments;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + body + '\'' +
                ", subject='" + subject + '\'' +
                ", attachments=" + attachments +
                '}';
    }
}
