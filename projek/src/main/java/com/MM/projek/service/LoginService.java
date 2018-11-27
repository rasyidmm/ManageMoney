package com.MM.projek.service;

import com.MM.projek.dao.LoginDao;
import com.MM.projek.model.Login;
import com.MM.projek.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService implements LoginDao {
    @Autowired
    LoginRepository loginRepository;
    @Override
    public List<Login> getAllLogin() {
        List<Login> la = new ArrayList<>();
        loginRepository.findAll().forEach(la::add);
        return la;
    }

    @Override
    public Login getLoginById(long id) {
        Login l = loginRepository.findById(id).get();
        return  l;
    }

    @Override
    public void SaveOrUpdate(Login l) {
        loginRepository.save(l);
    }

    @Override
    public void deleteLogin(long id) {
        loginRepository.deleteById(id);
    }

    @Override
    public void deleteLogin(Login l) {
        loginRepository.delete(l);
    }
}
