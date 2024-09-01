package pe.edu.upeu.lp2g2.service;

import java.util.List;

import pe.edu.upeu.lp2g2.entity.Autor;

public interface AutorService {
	Autor create(Autor a);
    Autor update(Autor a);
    void delete(Long id);
    Autor read(Long id);
    List<Autor> readAll();
}
