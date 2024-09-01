package pe.edu.upeu.lp2g2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import pe.edu.upeu.lp2g2.dao.UsuarioDao;
import pe.edu.upeu.lp2g2.entity.Usuario;
import pe.edu.upeu.lp2g2.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioDao usuarioDao;
	@Override
	@Transactional
	public Usuario create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.create(u);
	}

	@Override
	@Transactional
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.update(u);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		usuarioDao.delete(id);
		
	}

	@Override
	public Usuario read(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}

}
