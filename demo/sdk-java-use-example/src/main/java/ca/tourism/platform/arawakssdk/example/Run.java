package ca.tourism.platform.arawakssdk.example ;


import ca.tourism.platform.sdk.entity.country.Country;
import ca.tourism.platform.sdk.entity.page.CustomPage;
import ca.tourism.platform.sdk.exceptions.HttpException;
import ca.tourism.platform.sdk.services.CountryProvider;
import ca.tourism.platform.sdk.services.ResourceProvider;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * Created by ups on 4/10/18.
 */
public class Run {



    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper() ;

        // List countries
        try {
            CountryProvider countryProvider = new CountryProvider("") ;
            CustomPage<Country> customPage = countryProvider.getAllCountriesByPage(0,5) ;
            System.out.println(customPage.getPage());
            List<Country> list = customPage.getContent() ;
            System.out.println(list.size());
            for(int i=0; i<list.size();i++){
                System.out.println(list.get(i));
            }
        } catch (HttpException e) {
            System.out.println("[ERROR] - " + e.getMessage());
        }


        ResourceProvider resourceProvider = new ResourceProvider("") ;

        // Search entities
        try {
            List<Object> list = resourceProvider.search("great") ;

            for(Object o: list){
                JsonNode node = mapper.readTree(mapper.writeValueAsString(o));
                if(node.has("name")){
                    System.out.println(node.get("name").asText());
                }
            }
        } catch (HttpException e) {
            System.out.println("[ERROR] - " + e.getMessage());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get all attractions by page
        try {
            CustomPage<Object> list = resourceProvider.getAllResourcesByEntityName("Attraction",10,0) ;
            for(Object o: list.getContent()){
                JsonNode node = mapper.readTree(mapper.writeValueAsString(o));
                if(node.has("name")){
                    System.out.println(node.get("name").asText());
                }
            }
        } catch (HttpException e) {
            System.out.println("[ERROR] - " + e.getMessage());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Get all Transportation_Operators by page
        try {
            CustomPage<Object> list = resourceProvider.getAllResourcesByEntityName("Transportation_Operators",10,0) ;
            for(Object o: list.getContent()){
                JsonNode node = mapper.readTree(mapper.writeValueAsString(o));
                if(node.has("name")){
                    System.out.println(node.get("name").asText());
                }
            }
        } catch (HttpException e) {
            System.out.println("[ERROR] - " + e.getMessage());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get all Entities availables
        try {
            CustomPage<String> list = resourceProvider.getEntitiesAvailable(10,0) ;
            for(String name: list.getContent()){
                System.out.println(name);
            }
        } catch (HttpException e) {
            System.out.println("[ERROR] - " + e.getMessage());
        }

    }




}
