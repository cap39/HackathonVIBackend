package com.epicdevs.HealthPortalBackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Document(collection = "workouts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workout {
    @Id
    private String id;
    private String date;
    private String description;
}
