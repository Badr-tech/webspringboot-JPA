package ma.jit.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.springboot.entities.Personne;

public interface IPersonneDaoJpa extends JpaRepository<Personne, Integer> {
	public List<Personne> findByFirstName(String firstName);
	public List<Personne> findByFirstNameAndLastName(String firstName, String lastName);
}
