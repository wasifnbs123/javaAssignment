package com.starzPlay.assignment.web.rest;

import com.starzPlay.assignment.dtos.PaymentMethodDto;
import com.starzPlay.assignment.entities.PaymentMethods;
import com.starzPlay.assignment.service.PaymentMethodsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1.0/configuration/payment-methods")
public class PaymentMethodsController {

    private final PaymentMethodsService service;

    public PaymentMethodsController(PaymentMethodsService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<PaymentMethodDto>> getPaymentMethods(@RequestParam(required = false) String name,
                                               @RequestParam(required = false) Long id){
        Optional<List<PaymentMethodDto>> response = service.getPaymentMethods(name, id);
        return response.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NO_CONTENT).build());
    }

    @PostMapping
    public ResponseEntity<?> createPaymentMethod(@RequestBody PaymentMethodDto method){
        Optional<PaymentMethods> response = service.createPaymentMethod(method);
        return response.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build());
    }
}
