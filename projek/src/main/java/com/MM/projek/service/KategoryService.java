package com.MM.projek.service;

import com.MM.projek.dao.KategoryDao;
import com.MM.projek.model.Kategory;
import com.MM.projek.repository.KategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KategoryService implements KategoryDao {

    @Autowired
    KategoryRepository kategoryRepository;

    @Override
    public List<Kategory> getAllKategory() {
        List<Kategory> la = new ArrayList<>();
        kategoryRepository.findAll().forEach(la::add);
        return la;
    }

    @Override
    public Kategory getKategoryById(long id) {
        Kategory k = kategoryRepository.findById(id).get();
        return  k;
    }

    @Override
    public void SaveOrUpdate(Kategory k) {
        kategoryRepository.save(k);

    }

    @Override
    public void deleteKategory(long id) {
        kategoryRepository.deleteById(id);
    }

    @Override
    public void deleteKategory(Kategory d) {
        kategoryRepository.delete(d);
    }
}
