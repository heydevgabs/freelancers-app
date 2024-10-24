package org.freelance.freelancersservice.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FreelancerDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String status;
    private Boolean markedForDeletion;
}