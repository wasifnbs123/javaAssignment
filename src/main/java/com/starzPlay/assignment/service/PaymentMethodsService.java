package com.starzPlay.assignment.service;

import com.starzPlay.assignment.dtos.PaymentMethodDto;
import com.starzPlay.assignment.entities.PaymentMethods;
import com.starzPlay.assignment.mapper.PaymentMapper;
import com.starzPlay.assignment.repository.PaymentMethodsRepo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodsService {

    private final PaymentMethodsRepo repo;
    private final PaymentMapper mapper;

    public PaymentMethodsService(PaymentMethodsRepo repo, PaymentMapper mapper){
        this.repo = repo;
        this.mapper = mapper;
    }

    public Optional<List<PaymentMethodDto>> getPaymentMethods(String name, Long id){

        if(id != null){
            Optional<PaymentMethods> response = repo.findById(id);
            return response.map(paymentMethods -> Collections.singletonList(
                    mapper.toPaymentMethodDto(paymentMethods)));
        }
        if(name != null){
            Optional<PaymentMethods> response = repo.findByName(name);
            return response.map(paymentMethods -> Collections.singletonList(
                    mapper.toPaymentMethodDto(paymentMethods)));
        }
        return Optional.of(
                mapper.toPaymentMethodDtoList(
                        repo.findAll()));
    }

    public Optional<PaymentMethods> createPaymentMethod(PaymentMethodDto method){
        return Optional.of(
                repo.save(
                        mapper.toPaymentMethods(method)));
    }
}
