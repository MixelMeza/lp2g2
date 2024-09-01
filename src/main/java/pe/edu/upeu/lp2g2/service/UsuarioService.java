package pe.edu.upeu.lp2g2.service;

import java.util.List;



import pe.edu.upeu.lp2g2.entity.Usuario;

public interface UsuarioService {
      Usuario create(Usuario u);
      Usuario update(Usuario u);
      void delete(Long id);
      Usuario read(Long id);
      List<Usuario> readAll();
}
