package com.sadhikara.subscription.mapper;

import com.sadhikara.subscription.model.SkCustomerSubscriptionRequest;
import com.sadhikara.subscription.model.SkCustomerSubscriptionResponse;
import org.springframework.stereotype.Component;

@Component
public class SkCustomerSubscriptionMapper {

    public SkCustomerSubscriptionResponse setSubscriptionResponse(SkCustomerSubscriptionRequest subscriptionRequest){

        return SkCustomerSubscriptionResponse.builder()
                .message("Subscription successfully done for the -->"+subscriptionRequest.getFirstName())
                .build();
    }

}
