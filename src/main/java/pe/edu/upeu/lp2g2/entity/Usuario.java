package pe.edu.upeu.lp2g2.entity;



import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="documento")
	private String documento;
	@Column(name="estado")
	private char estado;

	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_empleado", referencedColumnName = "id")
    private Empleado empleado;
	
	@ManyToMany(targetEntity = Rol.class, fetch = FetchType.EAGER)
	@JoinTable(
			name = "usuario_rol",
			joinColumns = @JoinColumn(name ="usuario_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name ="rol_id",referencedColumnName = "id")
			)

	private Set<Rol> rol;
}
