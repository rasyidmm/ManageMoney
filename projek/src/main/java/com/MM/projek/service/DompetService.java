package com.MM.projek.service;

import com.MM.projek.dao.DompetDao;
import com.MM.projek.model.Dompet;
import com.MM.projek.repository.DompetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DompetService implements DompetDao{

    @Autowired
    DompetRepository dompetRepository;
    @Override
    public List<Dompet> getAllDompet() {
        List<Dompet> la = new ArrayList<>();
        dompetRepository.findAll().forEach(la::add);
        return la;
    }

    @Override
    public Dompet getDompetById(long id) {
        Dompet d = dompetRepository.findById(id).get();
        return d;
    }

    @Override
    public void SaveOrUpdate(Dompet d) {
        dompetRepository.save(d);
    }

    @Override
    public void deleteDomepet(long id) {
        dompetRepository.deleteById(id);
    }

    @Override
    public void deleteDompet(Dompet d) {
        dompetRepository.delete(d);
    }
}
