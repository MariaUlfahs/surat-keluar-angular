/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.sk.suratkeluarangular.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ulfah
 */
@Entity
public class Surat {
 
    @Id @Getter @Setter
    private int id;
    @Getter @Setter
    private String tgl_surat;
    @Getter @Setter
    private String judul;
    @Getter @Setter
    private String tujuan;
    
}
