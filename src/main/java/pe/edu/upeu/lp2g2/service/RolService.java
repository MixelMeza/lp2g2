package pe.edu.upeu.lp2g2.service;

import java.util.List;



import pe.edu.upeu.lp2g2.entity.Rol;

public interface RolService {
      Rol create(Rol r);
      Rol update(Rol r);
      void delete(Long id);
      Rol read(Long id);
      List<Rol> readAll();
}