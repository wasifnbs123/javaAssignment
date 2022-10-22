package com.starzPlay.assignment.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentMethodDto {

    private Long id;
    private String name;
    private String displayName;
    private String paymentType;
    private List<PaymentPlanDto> paymentPlans;
}
