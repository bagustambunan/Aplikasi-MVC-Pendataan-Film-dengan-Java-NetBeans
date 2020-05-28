package controller;

import java.util.List;

import dao.daoFilm;
import dao.interfaceFilm;
import model.Film;
import view.viewDetail;
import view.viewEdit;
import view.viewUtama;

public class controllerDetail
{
    viewDetail frame;
    interfaceFilm infcFilm;
    List<Film> list_film;
    
    public controllerDetail(viewDetail frame) {
        this.frame = frame;
        infcFilm = new daoFilm();
        list_film = infcFilm.getData();
    }
    
    public void tampilkanData(Film film1){
        frame.setOutJudul(film1.getJudul());
        frame.setOutSinopsis(film1.getSinopsis());
        frame.setOutTahun(film1.getTahun());
    }
    
    public void kembali(){
        frame.dispose();
        new viewUtama().setVisible(true);
    }
    
    public void halaman_edit(Film film1){
        frame.dispose();
        new viewEdit(film1).setVisible(true);
    }
    
    public void hapusData(int id_film){
        infcFilm.delete(id_film);
        
        kembali();
    }
}
