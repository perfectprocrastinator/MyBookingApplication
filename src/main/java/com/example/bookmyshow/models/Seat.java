package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private Integer rowNumber;
    private Integer columnNumber;
    @Enumerated
    private SeatType seatType;

}
