/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.sk.suratkeluarangular.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lab.sk.suratkeluarangular.entity.Surat;
import lab.sk.suratkeluarangular.repo.SuratRepo;

/**
 *
 * @author ulfah
 */
@RestController
public class ApiController {
    @Autowired
    private SuratRepo suratRepo;

    @RequestMapping("/get-daftar-surat-keluar")
    public List<Surat> getListSurat() {
        return suratRepo.findAll();
    }

    @RequestMapping(value = "/api/tambah", method = RequestMethod.POST)
    public void tambah(@RequestBody Surat surat) {
        //System.out.println("id : " + pegawai.getId());
        //System.out.println("nama : " + pegawai.getNama());
        //System.out.println("jabatan : " + pegawai.getJabatan());
        suratRepo.save(surat);
    }

    @RequestMapping(value = "/api/delete/{id}", method = RequestMethod.DELETE)
    public void hapus(@PathVariable("id") int id) {
        suratRepo.delete(id);
    }
    
}



