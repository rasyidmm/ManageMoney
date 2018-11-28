package com.MM.projek.controller;

import com.MM.projek.model.Login;
import com.MM.projek.model.Member;
import com.MM.projek.service.LoginService;
import com.MM.projek.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    MemberService memberService;
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/membertambah",method = RequestMethod.POST,headers = "Accept=application/json")
    public Boolean tambahMember(@RequestParam("file") String File, @RequestParam("alamatMember") String alamtMember,
                                @RequestParam("firstName")String firstName, @RequestParam("lastName")String lastName,
                                @RequestParam("noHandphone")String noHandphone, @RequestParam("emailMember")String emailmember,
                                @RequestParam("password")String paswordMember){

        Member member = new Member();
        member.setFirstName(firstName);
        member.setLastName(lastName);
        member.setAlamatMember(alamtMember);
        member.setFile(File);
        member.setNoHandphone(noHandphone);
        Login login = new Login();
        login.setEmailMember(emailmember);
        login.setPasswordMember(paswordMember);
        memberService.SaveOrUpdate(member,login);
        return true;
    }
    @RequestMapping(value = "/memberall", method = RequestMethod.GET)
    public List<Login> memberAll(){
        return loginService.getAllLogin();

    }

    @RequestMapping(value = "/membergetid", method = RequestMethod.GET)
    public Member memberByid(@RequestParam("id")long id){
        return memberService.getMeemberById(id);
    }
}
