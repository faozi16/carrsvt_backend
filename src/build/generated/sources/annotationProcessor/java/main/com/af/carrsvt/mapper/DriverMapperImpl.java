package com.af.carrsvt.mapper;

import com.af.carrsvt.dto.CustomerDto;
import com.af.carrsvt.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-21T00:53:53+0700",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.11.1.jar, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class DriverMapperImpl implements DriverMapper {

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setCustomerId( customer.getCustomerId() );
        customerDto.setUsername( customer.getUsername() );
        customerDto.setPassword( customer.getPassword() );
        customerDto.setEmail( customer.getEmail() );
        customerDto.setPhoneNumber( customer.getPhoneNumber() );
        customerDto.setStatus( customer.getStatus() );
        customerDto.setPaymentMethod1( customer.getPaymentMethod1() );
        customerDto.setPaymentMethod2( customer.getPaymentMethod2() );
        customerDto.setDetailPaymentMethod1( customer.getDetailPaymentMethod1() );
        customerDto.setDetailPaymentMethod2( customer.getDetailPaymentMethod2() );

        return customerDto;
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerId( customerDto.getCustomerId() );
        customer.setUsername( customerDto.getUsername() );
        customer.setPassword( customerDto.getPassword() );
        customer.setEmail( customerDto.getEmail() );
        customer.setPhoneNumber( customerDto.getPhoneNumber() );
        customer.setStatus( customerDto.getStatus() );
        customer.setPaymentMethod1( customerDto.getPaymentMethod1() );
        customer.setPaymentMethod2( customerDto.getPaymentMethod2() );
        customer.setDetailPaymentMethod1( customerDto.getDetailPaymentMethod1() );
        customer.setDetailPaymentMethod2( customerDto.getDetailPaymentMethod2() );

        return customer;
    }
}
