package pe.edu.upeu.lp2g2.dao;

import java.util.List;



import pe.edu.upeu.lp2g2.entity.Rol;

public interface RolDao {
      Rol create(Rol r);
      Rol update(Rol r);
      void delete(Long id);
      Rol read(Long id);
      List<Rol> readAll();
}