package org.freelance.freelancersservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Freelancer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;

    @Enumerated( EnumType.STRING)
    private FreelancerStatus status;

    private Boolean markedForDeletion = false;
    private LocalDate deletionDate;  // To track when the freelancer marked for deletion

    public Freelancer() {
        this.status = FreelancerStatus.NEW_FREELANCER; // Default status
    }
}