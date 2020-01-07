package fr.intiformation.service;

import java.util.List;

import fr.intiformation.domain.Etudiant;
import fr.intiformation.domain.Formation;
import fr.intiformation.domain.Ordinateur;


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
	
	public boolean ajouterEtudiantFormation(Long idEt, Long idForm);
	public List<Etudiant> findEtudiantFormation(Long idForm);
	public boolean assignerOrdinateurEtudiant(Long idEtudiant,Long idOrdinateur);
	
	// crud pour ordinateur
	public Ordinateur ajouterOrdinateur(Ordinateur ordi);	
	public Ordinateur getOrdinateur(Long id);	
	public boolean deleteOrdinateur(Long id);	
	public List<Ordinateur> findAllOrdinateur();	
	public Ordinateur updateOrdinateur(Ordinateur ordi);
	
	
	
}
