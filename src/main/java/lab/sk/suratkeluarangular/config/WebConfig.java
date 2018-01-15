/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.sk.suratkeluarangular.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author ulfah
 */
@Configuration 
public class WebConfig extends WebMvcConfigurerAdapter{
    
    @Override
    public void addViewControllers(ViewControllerRegistry reg) {
        reg.addViewController("/")
            .setViewName("daftar-surat-keluar");
        reg.addViewController("tambah-ui")
            .setViewName("tambah");
        reg.addViewController("edit-ui")
            .setViewName("edit");
    }
    
}

