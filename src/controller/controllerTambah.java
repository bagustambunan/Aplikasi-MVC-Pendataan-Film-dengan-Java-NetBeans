package controller;

import java.util.List;
import javax.swing.JOptionPane;

import dao.daoFilm;
import dao.interfaceFilm;
import model.Film;
import view.viewUtama;
import view.viewTambah;

public class controllerTambah {
    
    viewTambah frame;
    interfaceFilm infcFilm;
    
    public controllerTambah(viewTambah frame) {
        this.frame = frame;
        infcFilm = new daoFilm();
    }
    
    public void tambahData(){
        Film film_baru = new Film();
        film_baru.setJudul(frame.getTxtJudul().getText());
        film_baru.setSinopsis(frame.getTxtSinopsis().getText());
        film_baru.setTahun(Integer.parseInt(frame.getTxtTahun().getText()));

        infcFilm.insert(film_baru);
        JOptionPane.showMessageDialog(frame, "Berhasil menambahkan data baru");
        
        kembali();
    }
    
    public void kembali(){
        frame.dispose();
        new viewUtama().setVisible(true);
    }
    
    public void kosongkan_form(){
        frame.setTxtJudul("");
        frame.setTxtSinopsis("");
        frame.setTxtTahun("");
    }
}
