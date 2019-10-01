package ma.jit.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.jit.springboot.dao.IPersonneDaoJpa;
import ma.jit.springboot.entities.Personne;

@Service
public class ServiceJpa implements IServiceJpa {
	@Autowired
	IPersonneDaoJpa personneJpa;

	public void create(Personne personne) {
		// TODO Auto-generated method stub
		personneJpa.save(personne);
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		personneJpa.deleteById(id);
	}

	public void update(Personne personne) {
		// TODO Auto-generated method stub
		personneJpa.save(personne);
	}

	public List<Personne> getAllPersonne() {

		return personneJpa.findAll();
	}

	public Personne getPersonneById(int id) {

		return personneJpa.findById(id).get();
	}

	public List<Personne> findByFirstName(String firstName) {

		return personneJpa.findByFirstName(firstName);
	}

	public List<Personne> findByFirstNameAndLastName(String firstName, String lastName) {

		return personneJpa.findByFirstNameAndLastName(firstName, lastName);
	}

	public void setPersonneJpa(IPersonneDaoJpa personneJpa) {
		this.personneJpa = personneJpa;
	}

}
