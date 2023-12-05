package com.ohgiraffers.semiproject.sellerManage;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class SellerManageController {

    @GetMapping("sellerUserManage")
    public String sellerUserLocation(){
        return "content/seller Manage/sellerbuyerManage/sellerUserManage";
    }


    @GetMapping("sellerProject")
    public String sellerProjectLocation(){
        return "content/seller Manage/sellerProject/sellerProjectSearch";
    }





}
