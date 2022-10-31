package provider.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageService {

    @Value("${link.generator.host}")
    private String host;

    @Value("${internal.link}")
    private String link;

    public String secureMessage(String request) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.postForEntity(host, request, String.class);
        return link +"/api/"+ response.getBody();
    }

    public String getSecretMessage(String id) {
        RestTemplate restTemplate = new RestTemplate();

        String url = host + "?id=" + id;
        ResponseEntity<String> response
                = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}
