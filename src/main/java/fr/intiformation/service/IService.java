package fr.intiformation.service;

import java.util.List;

import fr.intiformation.domain.Etudiant;


public interface IService {

	public void ajouterProduit(Etudiant etudiant);
	
	public Etudiant getEtudiant(Long id);
	
	public void deleteEtudiant(Long id);
	
	public List<Etudiant> findAll();
	
	public void updateProduit(Etudiant etudiant);

}
