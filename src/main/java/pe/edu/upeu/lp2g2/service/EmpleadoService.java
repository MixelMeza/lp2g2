package pe.edu.upeu.lp2g2.service;

import java.util.List;



import pe.edu.upeu.lp2g2.entity.Empleado;

public interface EmpleadoService {
      Empleado create(Empleado e);
      Empleado update(Empleado e);
      void delete(Long id);
      Empleado read(Long id);
      List<Empleado> readAll();
}