package models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import play.db.jpa.Model;

@Entity
public class Pessoa extends Model {

	@OneToMany
	public List<Pet> pets;
	public String nome;
	public String email;
	public String senha;
	public String telefone;
	public String endereco;
	
}