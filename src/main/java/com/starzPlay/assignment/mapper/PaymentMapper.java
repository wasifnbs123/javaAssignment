package com.starzPlay.assignment.mapper;

import com.starzPlay.assignment.dtos.PaymentMethodDto;
import com.starzPlay.assignment.entities.PaymentMethods;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentMethods toPaymentMethods(PaymentMethodDto paymentMethodDto);

    PaymentMethodDto toPaymentMethodDto(PaymentMethods paymentMethods);

    List<PaymentMethodDto> toPaymentMethodDtoList(List<PaymentMethods> paymentMethods);
}
