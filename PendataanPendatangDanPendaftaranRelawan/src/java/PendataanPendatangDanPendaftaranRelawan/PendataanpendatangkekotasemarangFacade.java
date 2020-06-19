/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PendataanPendatangDanPendaftaranRelawan;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class PendataanpendatangkekotasemarangFacade extends AbstractFacade<Pendataanpendatangkekotasemarang> {

    @PersistenceContext(unitName = "PendataanPendatangDanPendaftaranRelawanPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PendataanpendatangkekotasemarangFacade() {
        super(Pendataanpendatangkekotasemarang.class);
    }
    
}
