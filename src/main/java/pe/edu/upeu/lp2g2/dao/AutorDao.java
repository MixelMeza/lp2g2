package pe.edu.upeu.lp2g2.dao;

import java.util.List;



import pe.edu.upeu.lp2g2.entity.Autor;

public interface AutorDao {
      Autor create(Autor a);
      Autor update(Autor a);
      void delete(Long id);
      Autor read(Long id);
      List<Autor> readAll();
}
