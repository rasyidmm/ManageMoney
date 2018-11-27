package com.MM.projek.dao;

import com.MM.projek.model.Login;
import com.MM.projek.model.Member;

import java.util.List;

public interface MemberDao {
    public List<Member> getAllMember();
    public Member getMeemberById(long id);
    public void SaveOrUpdate(Member m, Login p);
    public void deleteMember(long id);
    public void deleteMember(Member m);

}
