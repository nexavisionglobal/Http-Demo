package com.kodegravity.httpdemo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kodegravity.httpdemo.model.StudentResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class HttpStudentService {

    public StudentResponse getAllStudents() throws URISyntaxException, IOException, InterruptedException {
        String endPoint ="http://localhost:9012/mock/getStudents";

        HttpRequest httpRequest =HttpRequest.newBuilder()
                 .uri(new URI(endPoint))
                 .GET()
                 .build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String>httpResponse= client.send(httpRequest,HttpResponse.BodyHandlers.ofString());
        return getStudentResponseFromStr(httpResponse.body());

    }

    private StudentResponse getStudentResponseFromStr(String body) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        final StudentResponse studentResponse = mapper.readValue(body, StudentResponse.class);
        return studentResponse;

    }

}
