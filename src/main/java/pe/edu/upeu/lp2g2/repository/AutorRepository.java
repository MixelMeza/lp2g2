package pe.edu.upeu.lp2g2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2g2.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

}
