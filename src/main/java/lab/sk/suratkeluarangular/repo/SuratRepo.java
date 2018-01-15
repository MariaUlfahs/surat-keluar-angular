/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.sk.suratkeluarangular.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lab.sk.suratkeluarangular.entity.Surat;
/**
 *
 * @author ulfah
 */
@Repository
public interface SuratRepo extends JpaRepository<Surat, Integer> {
    
}
