package com.starzPlay.assignment.repository;

import com.starzPlay.assignment.entities.PaymentMethods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentMethodsRepo extends JpaRepository<PaymentMethods, Long> {

    Optional<PaymentMethods> findByName(String name);
}
