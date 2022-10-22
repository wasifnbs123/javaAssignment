package com.starzPlay.assignment.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentPlanDto {

    private Long id;
    private Double netAmount;
    private Double taxAmount;
    private Double grossAmount;
    private String currency;
    private String duration;
}
