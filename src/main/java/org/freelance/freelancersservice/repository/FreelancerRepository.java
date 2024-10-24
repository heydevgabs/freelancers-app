package org.freelance.freelancersservice.repository;

import org.freelance.freelancersservice.entity.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FreelancerRepository extends JpaRepository< Freelancer, Long> {

    List<Freelancer> findAllFreelancersByMarkedForDeletion( LocalDate deletedDay);
}
