package com.dojo.javapatterns.singleton.processors.enums;

import java.util.Optional;

public enum ApiEnum {
    INFO("/info"),
    DATA("/data"),
    LOGIN("/login");

    private String endpoint;

    ApiEnum(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public static Optional<ApiEnum> getApiEnum(String endpoint) {
        for (ApiEnum apiKey : ApiEnum.values()) {
            if (apiKey.getEndpoint().toLowerCase().equals(endpoint)) {
                return Optional.of(apiKey);
            }
        }
        return Optional.empty();
    }
}
