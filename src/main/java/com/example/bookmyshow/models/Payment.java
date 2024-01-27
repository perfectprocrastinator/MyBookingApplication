package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.PaymentMethodType;
import com.example.bookmyshow.enums.PaymentStatus;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private PaymentMethodType providerType;
    private PaymentStatus status;
    private Double amount;
    private String reference;
}
