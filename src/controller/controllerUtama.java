package controller;

import java.util.List;

import dao.daoFilm;
import dao.interfaceFilm;
import model.Film;
import model.tableModelFilm;
import view.viewUtama;
import view.viewTambah;
import view.viewDetail;

public class controllerUtama
{
    viewUtama frame;
    interfaceFilm infcFilm;
    List<Film> list_film;
    
    public controllerUtama(viewUtama frame) {
        this.frame = frame;
        infcFilm = new daoFilm();
        list_film = infcFilm.getData();
    }
    
    public void load_table() {
        tableModelFilm tmf = new tableModelFilm(list_film);
        frame.getTabelFilm().setModel(tmf);
    }
    
    public void halaman_tambah(){
        frame.dispose();
        new viewTambah().setVisible(true);
    }
    
    public void halaman_detail(int row){
        Film film1 = list_film.get(row);
        frame.dispose();
        new viewDetail(film1).setVisible(true);
    }
}
