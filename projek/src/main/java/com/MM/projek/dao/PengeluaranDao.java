package com.MM.projek.dao;

import com.MM.projek.model.Pengeluaran;

import java.util.List;

public interface PengeluaranDao {
    public List<Pengeluaran> getAllPengeluaran();

    public Pengeluaran getPengeluaranById(long id);

    public void SaveOrUpdate(Pengeluaran p);

    public void deletePengeluaran(long id);

    public void deletePengeluaran(Pengeluaran p);
}
