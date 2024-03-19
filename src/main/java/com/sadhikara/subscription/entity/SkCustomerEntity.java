package com.sadhikara.subscription.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamoDbBean
public class SkCustomerEntity {

    private String id;

    private String firstName;

    private String lastName;

    private String customerMobileNumber;

    private String customerEmailId;

    private Date createdDate;


}
