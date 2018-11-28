package com.MM.projek.controller;

import com.MM.projek.model.Kategory;
import com.MM.projek.service.KategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KategoryController {
    @Autowired
    KategoryService kategoryService;

    @RequestMapping(value =  "/insertKategory",method = RequestMethod.POST,headers = "Accept=application/json")
    public Boolean insertKategory(@RequestParam("jenisKategory") String jenisKategory,
                                  @RequestParam("namaKategory")String namaKategory,
                                  @RequestParam("gambarKategory")String gambarKategory){
        Kategory kategory = new Kategory();
        kategory.setJenisKategory(jenisKategory);
        kategory.setNamaKategory(namaKategory);
        kategory.setGambarKategory(gambarKategory);
        kategoryService.SaveOrUpdate(kategory);
        return true;
    }
    @RequestMapping(value = "/getkategoryall",method = RequestMethod.GET)
    public List<Kategory> kategoryall(){
        return kategoryService.getAllKategory();
    }

    @RequestMapping(value = "/getkategorybyid", method = RequestMethod.GET)
    public Kategory kategory(@RequestParam("id")long id){
        return kategoryService.getKategoryById(id);
    }

}
