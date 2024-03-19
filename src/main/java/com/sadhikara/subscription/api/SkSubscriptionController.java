package com.sadhikara.subscription.api;


import com.sadhikara.subscription.model.SkCustomerSubscriptionRequest;
import com.sadhikara.subscription.model.SkCustomerSubscriptionResponse;
import com.sadhikara.subscription.service.SkCustomerSubscriptionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkSubscriptionController {

    private final SkCustomerSubscriptionService subscriptionService;

    public SkSubscriptionController(SkCustomerSubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }
    @PostMapping("/subscription/customer")
    public ResponseEntity<SkCustomerSubscriptionResponse> customerSubscription(@RequestBody @Valid SkCustomerSubscriptionRequest subscriptionRequest){
        SkCustomerSubscriptionResponse subscriptionResponse = subscriptionService.createSubscription(subscriptionRequest);
        return new ResponseEntity<SkCustomerSubscriptionResponse>(HttpStatus.CREATED);
    }

}
