package fr.intiformation.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.intiformation.domain.Etudiant;
import fr.intiformation.domain.Formation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
@Repository
public interface EtudiantDAO extends JpaRepository<Etudiant, Long> {

	@Modifying
	@Query("update Etudiant e set e.formation.idFormation=:idFormation where e.idEtudiant = :idEtudiant ")
	public void ajouterEtudiantFormation(@Param("idEtudiant") Long idEtudiant, @Param("idFormation") Long idFormation);
}
