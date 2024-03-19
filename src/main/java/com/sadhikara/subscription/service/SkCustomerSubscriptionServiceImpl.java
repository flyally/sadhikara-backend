package com.sadhikara.subscription.service;

import com.sadhikara.subscription.mapper.SkCustomerSubscriptionMapper;
import com.sadhikara.subscription.model.SkCustomerSubscriptionRequest;
import com.sadhikara.subscription.model.SkCustomerSubscriptionResponse;
import com.sadhikara.subscription.repo.SkSubscriptionRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * All subscription related APIs stack here
 * @author Aditya Vardhan
 */

@Service
@Slf4j
public class SkCustomerSubscriptionServiceImpl implements SkCustomerSubscriptionService{

    private final SkCustomerSubscriptionMapper subscriptionMapper;

    private final SkSubscriptionRepo subscriptionRepo;
    public SkCustomerSubscriptionServiceImpl(SkCustomerSubscriptionMapper subscriptionMapper,
                                             SkSubscriptionRepo subscriptionRepo) {
        this.subscriptionMapper = subscriptionMapper;
        this.subscriptionRepo = subscriptionRepo;
    }

    @Override
    public SkCustomerSubscriptionResponse createSubscription(SkCustomerSubscriptionRequest subscriptionRequest) {
        log.info("Processing customer subscription request");
        return subscriptionMapper.setSubscriptionResponse(subscriptionRequest);
    }























}
