package com.credable.lms.controller;

import java.util.concurrent.Flow.Subscription;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/subscriptions")
public class SubscriptionController {
    @PostMapping
    public ResponseEntity<SubscriptionResponse> subscribe(
        @RequestBody SubscriptionRequest request) {

        }
    
}
