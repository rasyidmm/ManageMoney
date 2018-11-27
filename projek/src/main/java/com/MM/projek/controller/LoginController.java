package com.MM.projek.controller;

import com.MM.projek.model.Member;
import com.MM.projek.service.LoginService;
import com.MM.projek.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @Autowired
    MemberService memberService;

    public boolean tambahMember (@RequestParam("file") String File,@RequestParam("alamatMember") String alamtMember,
                                 @RequestParam("firstName")String firstName,@RequestParam("lastName")String lastName,
                                 @RequestParam("noHandphone")String noHandphone,@RequestParam("emailMember")String emailmember,
                                 @RequestParam("password")String paswordMember){

        Member member = new Member();
        member.setFile(File);

        return true;
    }
}
