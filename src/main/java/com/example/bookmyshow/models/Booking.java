package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.BookingStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Booking extends BaseModel{
    @ManyToOne
    private User user;
    @ManyToOne
    private Show show;
    @ManyToMany
    //One show seat can be a part of multiple bookings in the sense that B1 -> 1,2,3(Status:Cancelled)  B2-> 2,3 (Confirmed) B3-> 1 (Confirmed)
    private List<ShowSeat> seats=new ArrayList<>();
    private Double amount;
    private Date bookedAt;
    private BookingStatus status;
    @OneToMany
    private List<Payment> payments=new ArrayList<>();

}
