package com.sadhikara.configManagement;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DynamoDb configuration
 * @author Aditya Vardhan
 */

@Configuration
public class DynamoDbConfiguration {

    @Bean
    public DynamoDBMapper dynamoDBMapper(){

        return new DynamoDBMapper();
    }
}
