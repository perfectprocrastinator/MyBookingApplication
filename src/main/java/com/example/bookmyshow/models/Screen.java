package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection
    @Enumerated
    private List<MovieFeature> features;
}
