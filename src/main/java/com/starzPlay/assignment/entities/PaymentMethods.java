package com.starzPlay.assignment.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "payment_methods")
public class PaymentMethods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String displayName;
    private String paymentType;

    @OneToMany(cascade = CascadeType.ALL)
    private List<PaymentPlans> paymentPlans;
}
