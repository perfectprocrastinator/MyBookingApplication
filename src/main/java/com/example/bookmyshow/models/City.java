package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity  // City=> city
public class City extends BaseModel{
    private String name;
    @OneToMany
    private List<Theater> theaters=new ArrayList<>();
}
