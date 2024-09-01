package pe.edu.upeu.lp2g2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2g2.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

}

