package fr.intiformation.service;

import java.util.List;

import fr.intiformation.domain.Etudiant;
import fr.intiformation.domain.Formation;


public interface IService {

	public Etudiant ajouterEtudiant(Etudiant etudiant);	
	public Etudiant getEtudiant(Long id);	
	public boolean deleteEtudiant(Long id);	
	public List<Etudiant> findAll();	
	public Etudiant updateEtudiant(Etudiant etudiant);

	// crud pour formation
	public Formation ajouterFormation(Formation form);	
	public Formation getFormation(Long id);	
	public boolean deleteFormation(Long id);	
	public List<Formation> findAllFormation();	
	public Formation updateFormation(Formation form);
	
	
}
