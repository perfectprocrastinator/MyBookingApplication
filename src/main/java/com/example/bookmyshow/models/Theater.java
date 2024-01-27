package com.example.bookmyshow.models;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theater  extends BaseModel{
    private String name;
    @OneToMany
    private List<Screen> screens;
    private String address;
    @OneToMany
    private List<Show> shows;
}
