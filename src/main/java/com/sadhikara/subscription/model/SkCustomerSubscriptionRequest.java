package com.sadhikara.subscription.model;

import com.sadhikara.utils.StringPattern;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkCustomerSubscriptionRequest{

    @NotBlank(message = "Customer email address can't be blank")
    @Pattern(regexp = StringPattern.EMAIL)
    private String customerEmailAddress;

    @NotBlank(message = "Customer first name can't be blank")
    @Pattern(regexp = StringPattern.NAME)
    private String firstName;

    private String lastName;

    @NotBlank(message = "customer mobile number can't be blank")
    @Pattern(regexp = StringPattern.MOBILE_NUMBER)
    private String customerMobileNumber;

}
