package dao;

import model.Film;
import java.util.List;

public interface interfaceFilm {
    
    public void insert(Film film1);

    public void update(Film film1);

    public void delete(int id);

    public List<Film> getData();
    
}