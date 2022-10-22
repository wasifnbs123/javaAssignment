package com.starzPlay.assignment.mapper;

import com.starzPlay.assignment.dtos.PaymentMethodDto;
import com.starzPlay.assignment.dtos.PaymentMethodDto.PaymentMethodDtoBuilder;
import com.starzPlay.assignment.dtos.PaymentPlanDto;
import com.starzPlay.assignment.dtos.PaymentPlanDto.PaymentPlanDtoBuilder;
import com.starzPlay.assignment.entities.PaymentMethods;
import com.starzPlay.assignment.entities.PaymentMethods.PaymentMethodsBuilder;
import com.starzPlay.assignment.entities.PaymentPlans;
import com.starzPlay.assignment.entities.PaymentPlans.PaymentPlansBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-22T13:31:51+0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
@Component
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public PaymentMethods toPaymentMethods(PaymentMethodDto paymentMethodDto) {
        if ( paymentMethodDto == null ) {
            return null;
        }

        PaymentMethodsBuilder paymentMethods = PaymentMethods.builder();

        paymentMethods.id( paymentMethodDto.getId() );
        paymentMethods.name( paymentMethodDto.getName() );
        paymentMethods.displayName( paymentMethodDto.getDisplayName() );
        paymentMethods.paymentType( paymentMethodDto.getPaymentType() );
        paymentMethods.paymentPlans( paymentPlanDtoListToPaymentPlansList( paymentMethodDto.getPaymentPlans() ) );

        return paymentMethods.build();
    }

    @Override
    public PaymentMethodDto toPaymentMethodDto(PaymentMethods paymentMethods) {
        if ( paymentMethods == null ) {
            return null;
        }

        PaymentMethodDtoBuilder paymentMethodDto = PaymentMethodDto.builder();

        paymentMethodDto.id( paymentMethods.getId() );
        paymentMethodDto.name( paymentMethods.getName() );
        paymentMethodDto.displayName( paymentMethods.getDisplayName() );
        paymentMethodDto.paymentType( paymentMethods.getPaymentType() );
        paymentMethodDto.paymentPlans( paymentPlansListToPaymentPlanDtoList( paymentMethods.getPaymentPlans() ) );

        return paymentMethodDto.build();
    }

    @Override
    public List<PaymentMethodDto> toPaymentMethodDtoList(List<PaymentMethods> paymentMethods) {
        if ( paymentMethods == null ) {
            return null;
        }

        List<PaymentMethodDto> list = new ArrayList<PaymentMethodDto>( paymentMethods.size() );
        for ( PaymentMethods paymentMethods1 : paymentMethods ) {
            list.add( toPaymentMethodDto( paymentMethods1 ) );
        }

        return list;
    }

    protected PaymentPlans paymentPlanDtoToPaymentPlans(PaymentPlanDto paymentPlanDto) {
        if ( paymentPlanDto == null ) {
            return null;
        }

        PaymentPlansBuilder paymentPlans = PaymentPlans.builder();

        paymentPlans.id( paymentPlanDto.getId() );
        paymentPlans.netAmount( paymentPlanDto.getNetAmount() );
        paymentPlans.taxAmount( paymentPlanDto.getTaxAmount() );
        paymentPlans.grossAmount( paymentPlanDto.getGrossAmount() );
        paymentPlans.currency( paymentPlanDto.getCurrency() );
        paymentPlans.duration( paymentPlanDto.getDuration() );

        return paymentPlans.build();
    }

    protected List<PaymentPlans> paymentPlanDtoListToPaymentPlansList(List<PaymentPlanDto> list) {
        if ( list == null ) {
            return null;
        }

        List<PaymentPlans> list1 = new ArrayList<PaymentPlans>( list.size() );
        for ( PaymentPlanDto paymentPlanDto : list ) {
            list1.add( paymentPlanDtoToPaymentPlans( paymentPlanDto ) );
        }

        return list1;
    }

    protected PaymentPlanDto paymentPlansToPaymentPlanDto(PaymentPlans paymentPlans) {
        if ( paymentPlans == null ) {
            return null;
        }

        PaymentPlanDtoBuilder paymentPlanDto = PaymentPlanDto.builder();

        paymentPlanDto.id( paymentPlans.getId() );
        paymentPlanDto.netAmount( paymentPlans.getNetAmount() );
        paymentPlanDto.taxAmount( paymentPlans.getTaxAmount() );
        paymentPlanDto.grossAmount( paymentPlans.getGrossAmount() );
        paymentPlanDto.currency( paymentPlans.getCurrency() );
        paymentPlanDto.duration( paymentPlans.getDuration() );

        return paymentPlanDto.build();
    }

    protected List<PaymentPlanDto> paymentPlansListToPaymentPlanDtoList(List<PaymentPlans> list) {
        if ( list == null ) {
            return null;
        }

        List<PaymentPlanDto> list1 = new ArrayList<PaymentPlanDto>( list.size() );
        for ( PaymentPlans paymentPlans : list ) {
            list1.add( paymentPlansToPaymentPlanDto( paymentPlans ) );
        }

        return list1;
    }
}
