package ma.jit.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ma.jit.springboot.entities.Personne;

public interface IServiceJpa {
	
	public void create(Personne personne);
	public void deleteById(int id);
	public void update(Personne personne);
	public List<Personne> getAllPersonne();
	public Personne getPersonneById(int id);
	public List<Personne> findByFirstName(String firstName);
	public List<Personne> findByFirstNameAndLastName(String firstName, String lastName); 
	public Page<Personne> findAll(int page, int size);


}