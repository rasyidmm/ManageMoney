package com.MM.projek.service;

import com.MM.projek.dao.PengeluaranDao;
import com.MM.projek.model.Pengeluaran;
import com.MM.projek.repository.PengeluaranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PengeluaranService implements PengeluaranDao {

    @Autowired
    PengeluaranRepository pengeluaranRepository;
    @Override
    public List<Pengeluaran> getAllPengeluaran() {
        List<Pengeluaran> la = new ArrayList<>();
        pengeluaranRepository.findAll().forEach(la::add);
        return la;
    }

    @Override
    public Pengeluaran getPengeluaranById(long id) {
        Pengeluaran p = pengeluaranRepository.findById(id).get();
        return  p;
    }

    @Override
    public void SaveOrUpdate(Pengeluaran p) {
        pengeluaranRepository.save(p);
    }

    @Override
    public void deletePengeluaranbyid(long id) {
        pengeluaranRepository.deleteById(id);
    }

    @Override
    public void deletePengeluaran(Pengeluaran p) {
        pengeluaranRepository.delete(p);
    }
}
