package com.MM.projek.dao;

import com.MM.projek.model.Dompet;

import java.util.List;

public interface DompetDao {
        public List<Dompet> getAllDompet();

        public Dompet getDompetById(long id);

        public void SaveOrUpdate(Dompet d);

        public void deleteDomepet(long id);

        public void deleteDompet(Dompet d);
    }