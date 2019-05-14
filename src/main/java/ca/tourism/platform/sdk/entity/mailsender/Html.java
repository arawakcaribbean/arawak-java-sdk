package ca.tourism.platform.sdk.entity.mailsender  ;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ups on 2/09/18.
 */
public class Html {

    private Template  template ;
    private String subject;
    private List<String> attachments ;

    public Html() {
    }

    public Html(Template template, String subject, List<String> attachments) {
        this.template = template;
        this.subject = subject;
        this.attachments = attachments;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
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
        return "Html{" +
                "template=" + template.toString() +
                ", subject='" + subject + '\'' +
                ", attachments=" + attachments +
                '}';
    }
}
