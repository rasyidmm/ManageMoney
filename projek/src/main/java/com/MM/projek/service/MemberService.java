package com.MM.projek.service;

import com.MM.projek.dao.MemberDao;
import com.MM.projek.model.Login;
import com.MM.projek.model.Member;
import com.MM.projek.repository.LoginRepository;
import com.MM.projek.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService implements MemberDao {
    @Autowired
    LoginRepository loginRepository;
    @Autowired
    MemberRepository memberRepository;
    @Override
    public List<Member> getAllMember() {
        List<Member> la = new ArrayList<>();
        memberRepository.findAll().forEach(la::add);
        return la;
    }

    @Override
    public Member getMeemberById(long id) {
        Member m = memberRepository.findById(id).get();
        return  m;
    }

    @Override
    public void SaveOrUpdate(Member m, Login l) {
        try {
            m = memberRepository.save(m);
            l.setMember(m);
            loginRepository.save(l);
        }catch (Exception e){
            System.out.println("error bro : " +e);
        }
    }

    @Override
    public void deleteMember(long id) {
        memberRepository.deleteById(id);
    }

    @Override
    public void deleteMember(Member m) {
        memberRepository.delete(m);
    }
}
