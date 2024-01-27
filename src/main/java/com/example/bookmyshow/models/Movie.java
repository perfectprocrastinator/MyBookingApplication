package com.example.bookmyshow.models;
import com.example.bookmyshow.enums.Language;
import com.example.bookmyshow.enums.MovieFeature;
import com.example.bookmyshow.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private Double rating;
    @ElementCollection
    @Enumerated
    private List<Language> languages=new ArrayList<>();
    @ElementCollection
    @Enumerated
    private List<MovieFeature> features=new ArrayList<>();
}
