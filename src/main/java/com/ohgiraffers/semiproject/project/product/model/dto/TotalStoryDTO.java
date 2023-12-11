package com.ohgiraffers.semiproject.project.product.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TotalStoryDTO {
    private PrivateBusinessDTO privateBusinessDTO;
    private ProfileImageDTO profileImageDTO;
    private ProjectDTO projectDTO;
    private ProjectFileDTO projectFileDTO;
    private ProjectOptionDTO projectOptionDTO;
    private ProjectUserDTO projectUserDTO;


}
