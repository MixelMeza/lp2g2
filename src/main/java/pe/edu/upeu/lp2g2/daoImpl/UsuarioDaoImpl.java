package pe.edu.upeu.lp2g2.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.lp2g2.dao.UsuarioDao;
import pe.edu.upeu.lp2g2.entity.Usuario;
import pe.edu.upeu.lp2g2.repository.UsuarioRepository;
import org.springframework.stereotype.Component;
@Component
public class UsuarioDaoImpl  implements UsuarioDao{
    @Autowired
    private UsuarioRepository usuarioRepository;
	@Override
	public Usuario create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(u);
	}

	@Override
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(u);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	@Override
	public Usuario read(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).get();
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

}
