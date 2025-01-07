package com.af.carrsvt.mapper;

import com.af.carrsvt.dto.CustomerDto;
import com.af.carrsvt.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-06T17:28:31+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.41.0.v20241217-1506, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class FeedbackMapperImpl implements FeedbackMapper {

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setCustomerId( customer.getCustomerId() );
        customerDto.setDetailPaymentMethod1( customer.getDetailPaymentMethod1() );
        customerDto.setDetailPaymentMethod2( customer.getDetailPaymentMethod2() );
        customerDto.setEmail( customer.getEmail() );
        customerDto.setPassword( customer.getPassword() );
        customerDto.setPaymentMethod1( customer.getPaymentMethod1() );
        customerDto.setPaymentMethod2( customer.getPaymentMethod2() );
        customerDto.setPhoneNumber( customer.getPhoneNumber() );
        customerDto.setStatus( customer.getStatus() );
        customerDto.setUsername( customer.getUsername() );

        return customerDto;
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerId( customerDto.getCustomerId() );
        customer.setDetailPaymentMethod1( customerDto.getDetailPaymentMethod1() );
        customer.setDetailPaymentMethod2( customerDto.getDetailPaymentMethod2() );
        customer.setEmail( customerDto.getEmail() );
        customer.setPassword( customerDto.getPassword() );
        customer.setPaymentMethod1( customerDto.getPaymentMethod1() );
        customer.setPaymentMethod2( customerDto.getPaymentMethod2() );
        customer.setPhoneNumber( customerDto.getPhoneNumber() );
        customer.setStatus( customerDto.getStatus() );
        customer.setUsername( customerDto.getUsername() );

        return customer;
    }
}
