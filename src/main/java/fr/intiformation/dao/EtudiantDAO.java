package fr.intiformation.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.intiformation.domain.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;



@Transactional
@Repository
public interface EtudiantDAO extends JpaRepository<Etudiant, Long>{
}
