package com.MM.projek.controller;


import com.MM.projek.model.Dompet;
import com.MM.projek.model.Kategory;
import com.MM.projek.service.DompetService;
import com.MM.projek.service.KategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class DompetController {
    @Autowired
    KategoryService kategoryService;
    @Autowired
    DompetService dompetService;
    @RequestMapping(value =  "/insertDompet",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean insertDompet(@RequestParam("namaDompet")String namaDompet,@RequestParam("idKategory") Long id){
        UUID uuid = UUID.randomUUID();
        String iduuid = String.valueOf(uuid);
        Dompet dompet = new Dompet();
        dompet.setNamaDompet("namaDompet");
        Kategory kategory = kategoryService.getKategoryById(id);
        dompet.setKategory(kategory);
        dompetService.SaveOrUpdate(dompet);
        return true;
    }
    @RequestMapping(value = "/deleteDompet",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean deleteDompet(@RequestParam("id")long id){
        dompetService.deleteDomepet(id);
        return true;
    }

    @RequestMapping(value = "/getdompetall", method = RequestMethod.GET)
    public List<Dompet> dompetsall(){
        return dompetService.getAllDompet();
    }

    @RequestMapping(value = "/getdompetbyid", method = RequestMethod.GET)
    public Dompet dompet(@RequestParam("id")long id){
        return dompetService.getDompetById(id);
    }
}
