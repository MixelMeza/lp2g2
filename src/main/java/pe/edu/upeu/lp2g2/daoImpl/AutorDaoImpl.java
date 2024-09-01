package pe.edu.upeu.lp2g2.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.lp2g2.dao.AutorDao;
import pe.edu.upeu.lp2g2.entity.Autor;
import pe.edu.upeu.lp2g2.repository.AutorRepository;
import org.springframework.stereotype.Component;
@Component
public class AutorDaoImpl  implements AutorDao{
    @Autowired
    private AutorRepository autorRepository;
	@Override
	public Autor create(Autor a) {
		// TODO Auto-generated method stub
		return autorRepository.save(a);
	}

	@Override
	public Autor update(Autor a) {
		// TODO Auto-generated method stub
		return autorRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		autorRepository.deleteById(id);
	}

	@Override
	public Autor read(Long id) {
		// TODO Auto-generated method stub
		return autorRepository.findById(id).get();
	}

	@Override
	public List<Autor> readAll() {
		// TODO Auto-generated method stub
		return autorRepository.findAll();
	}

}
