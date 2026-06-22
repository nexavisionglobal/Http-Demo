package com.kodegravity.httpdemo.service;

import org.springframework.beans.factory.annotation.Value;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class PostalService {
    @Value("${endpoint}")
    public String getPostalDetails() throws URISyntaxException {
        String response = null;

        String endPoint = "";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(endPoint))
                .version(HttpClient.Version.HTTP_2)
                .timeout(Duration.of(10, ChronoUnit.SECONDS))
                .build();
        return response;
    }

}
