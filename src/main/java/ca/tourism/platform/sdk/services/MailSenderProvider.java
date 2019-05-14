package ca.tourism.platform.sdk.services;

import ca.tourism.platform.sdk.core.RestClientProvider;
import ca.tourism.platform.sdk.entity.mailsender.BodyTemplate;
import ca.tourism.platform.sdk.entity.mailsender.BodyText;
import ca.tourism.platform.sdk.exceptions.HttpException;

/**
 * Created by ups on 8/05/19.
 */
public class MailSenderProvider {

    private RestClientProvider restClientProvider ;

    public MailSenderProvider(String secretToken) {
        this.restClientProvider = new RestClientProvider(secretToken) ;
    }

    public String sendSimple(BodyText bodyText) throws HttpException {
        return restClientProvider.post("/api/v1/mailsender/simple", String.class, bodyText);
    }

    public String sendTemplate(BodyTemplate bodyTemplate) throws HttpException {
        return restClientProvider.post("/api/v1/mailsender/template", String.class, bodyTemplate);
    }
}
