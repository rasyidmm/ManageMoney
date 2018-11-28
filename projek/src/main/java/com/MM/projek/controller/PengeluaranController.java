package com.MM.projek.controller;

import com.MM.projek.model.Kategory;
import com.MM.projek.model.Member;
import com.MM.projek.model.Pengeluaran;
import com.MM.projek.service.KategoryService;
import com.MM.projek.service.MemberService;
import com.MM.projek.service.PengeluaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PengeluaranController {

    @Autowired
    PengeluaranService pengeluaranService;
    @Autowired
    MemberService memberService;
    @Autowired
    KategoryService kategoryService;

    @RequestMapping(value = "/insertpengeluaran",method = RequestMethod.POST)
    public Boolean insertPengeluaran(@RequestParam("namaPengeluaran")String namaPengeluaran,
                                     @RequestParam("jumlahPengeluaran")String jumlahPengeluaran,
                                     @RequestParam("kategoryId")long kategoryid,@RequestParam("memberid")long memberid){
        Pengeluaran pengeluaran = new Pengeluaran();
        pengeluaran.setNamaPengeluaran(namaPengeluaran);
        pengeluaran.setJumlahUang(jumlahPengeluaran);
        Member member = memberService.getMeemberById(memberid);
        pengeluaran.setMember(member);
        Kategory kategory =  kategoryService.getKategoryById(kategoryid);
        pengeluaran.setKategory(kategory);
        pengeluaranService.SaveOrUpdate(pengeluaran);
        return true;
    }

    @RequestMapping(value = "/deletepengeluaran",method = RequestMethod.POST)
    public boolean pengeluarandelete(@RequestParam("id ")long id){
        pengeluaranService.deletePengeluaranbyid(id);
        return true;
    }

    @RequestMapping(value = "/getpengeluaranall",method = RequestMethod.GET)
    public List<Pengeluaran> pengeluaranList(){
        return pengeluaranService.getAllPengeluaran();
    }

    @RequestMapping(value = "/getpengeluranbyid",method = RequestMethod.GET)
    public Pengeluaran pengeluaran(@RequestParam("id")long id){
        return pengeluaranService.getPengeluaranById(id);
    }
}
