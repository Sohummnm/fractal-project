package com.company.frontend.service;

import com.company.frontend.model.Employee;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.*;
import java.util.List;

public class ApiClient {

    private static final String BASE_URL = "http://localhost:8080/employees";
    private final HttpClient client = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    public List<Employee> listEmployees() {
        try {
            HttpRequest req = HttpRequest.newBuilder(URI.create(BASE_URL)).GET().build();
            String resp = client.send(req, HttpResponse.BodyHandlers.ofString()).body();
            return mapper.readValue(resp, new TypeReference<List<Employee>>() {});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void addEmployee(String name, String role) {
        try {
            Employee emp = new Employee(null, name, role);
            String body = mapper.writeValueAsString(emp);

            HttpRequest req = HttpRequest.newBuilder(URI.create(BASE_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

            client.send(req, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
