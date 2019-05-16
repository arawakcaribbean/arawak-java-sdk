package ca.tourism.platform.sdk.core ;


import ca.tourism.platform.sdk.exceptions.HttpException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by ups on 19/04/19.
 */
public class RestClientProvider {

    private final String HOST = "http://api.opencaribbean.org";
    private final ObjectMapper mapper = new ObjectMapper();

    private String secretToken ;

    public RestClientProvider(String secretToken) {
        this.secretToken = secretToken;
    }

    public <T> T post(String uri, Class<T> responseType, Object o) throws HttpException {
        T result = null;
        try {
            String url = HOST + uri;
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url);
            String json = mapper.writeValueAsString(o);
            StringEntity entity = new StringEntity(json);
            post.setEntity(entity);
            post.setHeader("Accept", "application/json");
            post.setHeader("Content-type", "application/json");
            post.setHeader("Authorization", "Bearer " + this.secretToken); // add the authorization header to the request
            HttpResponse response = client.execute(post);
            System.out.println("[INFO] Request : " + url);
            System.out.println("[INFO] Response code : " + response.getStatusLine().getStatusCode());
            if(response.getStatusLine().getStatusCode() >= 200 && response.getStatusLine().getStatusCode() <= 299) {
                String content = EntityUtils.toString(response.getEntity());
                result = mapper.readValue(content,responseType);
            } else {
                throw new HttpException("Http error",response.getStatusLine().getStatusCode(),"", response.getStatusLine().getReasonPhrase()) ;
            }
        } catch (JsonProcessingException e) {
            throw new HttpException("Error processing the json",-1,"JsonProcessingException", e.getMessage()) ;
        } catch (UnsupportedEncodingException e) {
            throw new HttpException("Unsupported encoding",-1,"UnsupportedEncodingException", e.getMessage()) ;
        } catch (ClientProtocolException e) {
            throw new HttpException("Client protocol",-1,"ClientProtocolException", e.getMessage()) ;
        } catch (IOException e) {
            throw new HttpException("IO exception",-1,"IOException", e.getMessage()) ;
        }
        return result ;
    }

    public <T> T get(String uri, Class<T> responseType) throws HttpException {
        T result = null;
        try {
            String url = HOST + uri;
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet get = new HttpGet(url) ;
            get.setHeader("Accept", "application/json");
            get.setHeader("Content-type", "application/json");
            get.setHeader("Authorization", "Bearer " + this.secretToken); // add the authorization header to the request
            HttpResponse response = client.execute(get);
            System.out.println("[INFO] Request : " + url);
            System.out.println("[INFO] Response code : " + response.getStatusLine().getStatusCode());
            if(response.getStatusLine().getStatusCode() >= 200 && response.getStatusLine().getStatusCode() <= 299) {
                String content = EntityUtils.toString(response.getEntity());
                result = mapper.readValue(content,responseType);
                System.out.println(content);
            } else {
                throw new HttpException("Http error",response.getStatusLine().getStatusCode(),"", response.getStatusLine().getReasonPhrase()) ;
            }
        } catch (JsonProcessingException e) {
            throw new HttpException("Error processing the json",-1,"JsonProcessingException", e.getMessage()) ;
        } catch (UnsupportedEncodingException e) {
            throw new HttpException("Unsupported encoding",-1,"UnsupportedEncodingException", e.getMessage()) ;
        } catch (ClientProtocolException e) {
            throw new HttpException("Client protocol",-1,"ClientProtocolException", e.getMessage()) ;
        } catch (IOException e) {
            throw new HttpException("IO exception",-1,"IOException", e.getMessage()) ;
        }
        return result ;
    }

    public <T> T put(String uri, Class<T> responseType, Object o) throws HttpException {
        T result = null;
        try {
            String url = HOST + uri;
            HttpClient client = HttpClientBuilder.create().build();
            HttpPut put = new HttpPut(url) ;
            String json = mapper.writeValueAsString(o);
            StringEntity entity = new StringEntity(json);
            put.setEntity(entity);
            put.setHeader("Accept", "application/json");
            put.setHeader("Content-type", "application/json");
            put.setHeader("Authorization", "Bearer " + this.secretToken); // add the authorization header to the request
            HttpResponse response = client.execute(put);
            System.out.println("[INFO] Request : " + url);
            System.out.println("[INFO] Response code : " + response.getStatusLine().getStatusCode());
            if(response.getStatusLine().getStatusCode() >= 200 && response.getStatusLine().getStatusCode() <= 299) {
                String content = EntityUtils.toString(response.getEntity());
                result = mapper.readValue(content,responseType);
            } else {
                throw new HttpException("Http error",response.getStatusLine().getStatusCode(),"", response.getStatusLine().getReasonPhrase()) ;
            }
        } catch (JsonProcessingException e) {
            throw new HttpException("Error processing the json",-1,"JsonProcessingException", e.getMessage()) ;
        } catch (UnsupportedEncodingException e) {
            throw new HttpException("Unsupported encoding",-1,"UnsupportedEncodingException", e.getMessage()) ;
        } catch (ClientProtocolException e) {
            throw new HttpException("Client protocol",-1,"ClientProtocolException", e.getMessage()) ;
        } catch (IOException e) {
            throw new HttpException("IO exception",-1,"IOException", e.getMessage()) ;
        }
        return result ;
    }

    public <T> T delete(String uri, Class<T> responseType) throws HttpException {
        T result = null;
        try {
            String url = HOST + uri;
            HttpClient client = HttpClientBuilder.create().build();
            HttpDelete delete = new HttpDelete(url) ;
            delete.setHeader("Accept", "application/json");
            delete.setHeader("Content-type", "application/json");
            delete.setHeader("Authorization", "Bearer " + this.secretToken); // add the authorization header to the request
            HttpResponse response = client.execute(delete);
            System.out.println("[INFO] Request : " + url);
            System.out.println("[INFO] Response code : " + response.getStatusLine().getStatusCode());
            if(response.getStatusLine().getStatusCode() >= 200 && response.getStatusLine().getStatusCode() <= 299) {
                String content = EntityUtils.toString(response.getEntity());
                result = mapper.readValue(content,responseType);
            } else {
                throw new HttpException("Http error",response.getStatusLine().getStatusCode(),"", response.getStatusLine().getReasonPhrase()) ;
            }
        } catch (JsonProcessingException e) {
            throw new HttpException("Error processing the json",-1,"JsonProcessingException", e.getMessage()) ;
        } catch (UnsupportedEncodingException e) {
            throw new HttpException("Unsupported encoding",-1,"UnsupportedEncodingException", e.getMessage()) ;
        } catch (ClientProtocolException e) {
            throw new HttpException("Client protocol",-1,"ClientProtocolException", e.getMessage()) ;
        } catch (IOException e) {
            throw new HttpException("IO exception",-1,"IOException", e.getMessage()) ;
        }
        return result ;
    }


}
