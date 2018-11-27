package com.MM.projek.dao;

import com.MM.projek.model.Kategory;

import java.util.List;

public interface KategoryDao {
    public List<Kategory> getAllKategory();

    public Kategory getKategoryById(long id);

    public void SaveOrUpdate(Kategory k);

    public void deleteKategory(long id);

    public void deleteKategory(Kategory d);
}
