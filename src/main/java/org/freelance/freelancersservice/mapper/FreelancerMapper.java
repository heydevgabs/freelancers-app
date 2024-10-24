package org.freelance.freelancersservice.mapper;

import org.freelance.freelancersservice.dto.FreelancerDTO;
import org.freelance.freelancersservice.entity.Freelancer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FreelancerMapper {

    FreelancerDTO toFreelancerDTO( Freelancer freelancer);

    @Mapping(target = "status", ignore = true)
    @Mapping(target = "markedForDeletion", ignore = true)
    Freelancer toFreelancer(FreelancerDTO freelancerDTO);
}