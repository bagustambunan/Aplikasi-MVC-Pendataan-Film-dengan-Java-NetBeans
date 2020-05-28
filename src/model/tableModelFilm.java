package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tableModelFilm extends AbstractTableModel {
    List<Film> list_film;

    public tableModelFilm(List<Film> list_film) {
        this.list_film = list_film;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public int getRowCount() {
        return list_film.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Judul";
            case 1:
                return "Tahun";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return list_film.get(row).getJudul();
            case 1:
                return list_film.get(row).getTahun();
            default:
                return null;
        }
    }
}
