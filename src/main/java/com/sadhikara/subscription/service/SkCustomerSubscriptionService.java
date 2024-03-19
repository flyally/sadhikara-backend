package com.sadhikara.subscription.service;


import com.sadhikara.subscription.model.SkCustomerSubscriptionRequest;
import com.sadhikara.subscription.model.SkCustomerSubscriptionResponse;

public interface SkCustomerSubscriptionService {

    SkCustomerSubscriptionResponse createSubscription(SkCustomerSubscriptionRequest subscriptionRequest);

}
