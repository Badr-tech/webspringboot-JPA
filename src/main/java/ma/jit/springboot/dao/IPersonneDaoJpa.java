package ma.jit.springboot.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import ma.jit.springboot.entities.Personne;

public interface IPersonneDaoJpa extends JpaRepository<Personne, Integer>, PagingAndSortingRepository<Personne, Integer> {
	public List<Personne> findByFirstName(String firstName);
	public List<Personne> findByFirstNameAndLastName(String firstName, String lastName);
	public Page<Personne> findAll(Pageable page);
}
