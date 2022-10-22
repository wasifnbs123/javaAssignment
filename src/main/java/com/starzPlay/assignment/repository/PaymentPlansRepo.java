package com.starzPlay.assignment.repository;

import com.starzPlay.assignment.entities.PaymentPlans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentPlansRepo extends JpaRepository<PaymentPlans, Long> {
}
