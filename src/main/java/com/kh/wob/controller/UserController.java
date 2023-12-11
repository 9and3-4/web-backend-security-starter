package com.kh.wob.controller;

import com.kh.wob.dto.UserSignUpDto;
import com.kh.wob.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/sign-up")
    public String signUp(@RequestBody UserSignUpDto userSignUpDto) throws Exception {
        userService.signUp(userSignUpDto);
        return "회원가입 성공";
    }

//    @GetMapping("/jwt-test")
//    public String jwtTest() {
//        return "jwtTest 요청 성공";
//    }
}