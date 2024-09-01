package pe.edu.upeu.lp2g2.dao;

import java.util.List;



import pe.edu.upeu.lp2g2.entity.Usuario;

public interface UsuarioDao {
      Usuario create(Usuario u);
      Usuario update(Usuario u);
      void delete(Long id);
      Usuario read(Long id);
      List<Usuario> readAll();
}