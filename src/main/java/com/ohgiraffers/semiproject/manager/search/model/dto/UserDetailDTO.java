package com.ohgiraffers.semiproject.manager.search.model.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDetailDTO {
    private int userCode;
    private String userId;
    private String password;
    private String email;
    private Date registrationDate;
    private String address;
    private String userName;
    private Date dateBirth;
    private String phone;
    private char activityStatus;
    private int reportCount;
    private char couponStatus;

    private int projectCode;
    private String projectTitle;
    private ProjectCategoryDTO projectCategory;
    private String projectType;
    private PlanDTO projectPlan;
    private UserDTO sellerInfo;
    private int targetAmount;
    private Date projectEndDate;
    private String projectSummary;
    private char policyAgreement;
    private String sellerType;
    private char achievementStatus;
    private Date projectStartDate;
    private String progressStatus;
}
