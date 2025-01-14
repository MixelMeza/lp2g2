package pe.edu.upeu.lp2g2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.lp2g2.entity.Usuario;
import pe.edu.upeu.lp2g2.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController{
	
  
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping
	public ResponseEntity<List<Usuario>> readAll(){
		try {
			List<Usuario> usuarios = usuarioService.readAll();
			if(usuarios.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(usuarios, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping
	public ResponseEntity<Usuario> crear(@Valid @RequestBody Usuario usu){
		try {
			Usuario u = usuarioService.create(usu);
			return new ResponseEntity<>(u, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getUsuarioId(@PathVariable("id") Long id){
		try {
			Usuario u = usuarioService.read(id);
			return new ResponseEntity<>(u, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Usuario> delUsuario(@PathVariable("id") Long id){
		try {
			usuarioService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUsuario(@PathVariable("id") Long id, @Valid @RequestBody Usuario usu){

		Usuario u = usuarioService.read(id);
			if (u.getId()>0) {
				return new ResponseEntity<>(usuarioService.update(usu), HttpStatus.OK);

			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		
	}
}
