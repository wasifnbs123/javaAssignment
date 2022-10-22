package com.starzPlay.assignment.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "payment_plans")
public class PaymentPlans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double netAmount;
    private Double taxAmount;
    private Double grossAmount;
    private String currency;
    private String duration;
}
