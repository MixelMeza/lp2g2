package pe.edu.upeu.lp2g2.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.lp2g2.dao.EmpleadoDao;
import pe.edu.upeu.lp2g2.entity.Empleado;
import pe.edu.upeu.lp2g2.repository.EmpleadoRepository;
import org.springframework.stereotype.Component;
@Component
public class EmpleadoDaoImpl  implements EmpleadoDao{
    @Autowired
    private EmpleadoRepository empleadoRepository;
	@Override
	public Empleado create(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(e);
	}

	@Override
	public Empleado update(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(id);
	}

	@Override
	public Empleado read(Long id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id).get();
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

}
