package com.ohgiraffers.semiproject.project.projectMake.model.dto;

import lombok.*;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProjectMakeDTO {

    private String title;
    private String category;
    private String type;
    private String plan;
    private String targetAmount;
    private Date endDate;
    private Date startDate;
    private String summary;
    private String sellerType;
    private int sellerCode;
    private String tag;
    private char policy;
    private List<ProjectMakeFileDTO> attachmentList;
    private String content;

    public ProjectMakeDTO(int sellerCode, String content) {
        this.sellerCode = sellerCode;
        this.content = content;
    }
}
