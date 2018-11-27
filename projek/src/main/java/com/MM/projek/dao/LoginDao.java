package com.MM.projek.dao;

import com.MM.projek.model.Login;

import java.util.List;

public interface LoginDao {
    public List<Login> getAllLogin();

    public Login getLoginById(long id);

    public void SaveOrUpdate(Login l);

    public void deleteLogin(long id);

    public void deleteLogin(Login l);
}
