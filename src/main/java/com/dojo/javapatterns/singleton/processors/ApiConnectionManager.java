package com.dojo.javapatterns.singleton.processors;

import com.dojo.javapatterns.singleton.processors.enums.ApiEnum;

import java.util.Optional;

public class ApiConnectionManager {

    public static final String BASE_URL = "http://www.thecoolservice.com";
    public static ApiConnectionManager INSTANCE;
    private String endpoint = ApiEnum.INFO.getEndpoint();
    private String token;

    private ApiConnectionManager() {
    }

    public static ApiConnectionManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApiConnectionManager();
        }
        return INSTANCE;
    }

    public Optional<String> makeRequest() {
        if (endpoint == null && token == null) {
            System.out.println("Either the url or the token are not set. Make sure to provide them");
            return Optional.empty();
        }
        String url = BASE_URL.concat(endpoint);
        Optional<ApiEnum> apiEndpoint = ApiEnum.getApiEnum(endpoint);
        if (apiEndpoint.isPresent()) {
            switch(apiEndpoint.get()) {
                case DATA:
                    return requestData(url);
                case LOGIN:
                    return requestLogin(url);
                case INFO:
                default:
                    return requestInfo(url);
            }
        }
        return errorRequest(url);
    }

    private Optional<String> requestInfo(String url) {
        System.out.println("Requesting information from " + url + " with token " + token);
        return Optional.of("Information retrieved successfully");
    }

    private Optional<String> requestData(String url) {
        System.out.println("Requesting data from " + url + " with token " + token);
        return Optional.of("Data retrieved successfully");
    }

    private Optional<String> requestLogin(String url) {
        System.out.println("Requesting login from " + url + " with token " + token);
        return Optional.of("The Log in was successful");
    }

    private Optional<String> errorRequest(String url) {
        System.out.println("Cannot request information to the API. the endpoint is unknown " + url + " with token " + token);
        return Optional.of("Wrong endpoint");
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return BASE_URL.concat(endpoint);
    }
}
