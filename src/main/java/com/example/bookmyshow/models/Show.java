package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "shows")
public class Show  extends BaseModel{
    @OneToMany
    private List<ShowSeat> showSeats;
    private Date startTime;
    @ManyToOne
    private Screen screen;
    @ManyToOne
    private Movie movie;
    private Integer duration;
}
