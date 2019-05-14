package ca.tourism.platform.sdk.entity.mailsender  ;

import java.util.HashMap;

/**
 * Created by ups on 2/09/18.
 */
public class Template {

    private String url ;
    private HashMap<String,String> vars ;

    public Template() {
    }

    public Template(String url, HashMap<String, String> vars) {
        this.url = url;
        this.vars = vars;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HashMap<String, String> getVars() {
        return vars;
    }

    public void setVars(HashMap<String, String> vars) {
        this.vars = vars;
    }

    @Override
    public String toString() {
        return "Template{" +
                "url='" + url + '\'' +
                ", vars=" + vars +
                '}';
    }
}
