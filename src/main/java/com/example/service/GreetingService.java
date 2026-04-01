// Service layer for business logic
package com.example.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String greet() {
        return "Hello, Quarkus!";
    }
}