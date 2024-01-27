package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.TicketStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private String movie;
    private Integer amount;
    private TicketStatus status;
}
