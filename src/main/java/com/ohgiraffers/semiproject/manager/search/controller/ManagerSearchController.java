package com.ohgiraffers.semiproject.manager.search.controller;

import com.ohgiraffers.semiproject.manager.search.model.dto.UserDTO;
import com.ohgiraffers.semiproject.manager.search.model.service.SearchUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/manager/search")
public class ManagerSearchController {
    private final SearchUserService searchUserService;

    public ManagerSearchController(SearchUserService searchUserService) {
        this.searchUserService = searchUserService;
    }

    @GetMapping("/complaintDetail")
    public String complaintDetail(){
        return "/content/manager/search/complaintDetail";
    }
    @GetMapping("/complaintMain")
    public String complaintMain(){ return "/content/manager/search/complaintMain";}
    @GetMapping("/sellerDetail")
    public String sellerDetail(){
        return "/content/manager/search/sellerDetail";
    }
    @GetMapping("/sellerMain")
    public String sellerMain(){
        return "/content/manager/search/sellerMain";
    }
    @GetMapping("/userDetail")
    public String userDetail(){
        return "/content/manager/search/userDetail";
    }
    @GetMapping("/userMain")
    public ModelAndView userMain(){
        List<UserDTO> userDTOS = searchUserService.findAllUser();


        return new ModelAndView("searchUser").addObject
                ("viewpage","/userMain.html").addObject("userDTOS",userDTOS);
//        "/content/manager/search/userMain";
    }
}

