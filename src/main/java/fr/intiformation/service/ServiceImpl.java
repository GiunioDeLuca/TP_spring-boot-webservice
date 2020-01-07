package fr.intiformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.intiformation.dao.EtudiantDAO;
import fr.intiformation.dao.FormationDAO;
import fr.intiformation.dao.OrdinateurDAO;
import fr.intiformation.domain.Etudiant;
import fr.intiformation.domain.Formation;
import fr.intiformation.domain.Ordinateur;

@Service
public class ServiceImpl implements IService{

	@Autowired
	EtudiantDAO etudDAO;
	
	@Autowired
	FormationDAO formDAO;
	
	@Autowired
	OrdinateurDAO ordiDAO;
	
	@Override
	public Etudiant ajouterEtudiant(Etudiant etudiant) {
		etudDAO.save(etudiant);
		return etudiant;
	}

	@Override
	public Etudiant getEtudiant(Long id) {
		return etudDAO.findById(id).get();
	}

	@Override
	public boolean deleteEtudiant(Long id) {
		etudDAO.deleteById(id);
		return true;
	}

	@Override
	public List<Etudiant> findAll() {
		return etudDAO.findAll();
	}

	@Override
	public Etudiant updateEtudiant(Etudiant etudiant) {
		etudDAO.save(etudiant);
		return etudiant;
	}

	@Override
	public Formation ajouterFormation(Formation form) {
		formDAO.save(form);
		return form;
	}

	@Override
	public Formation getFormation(Long id) {
		return formDAO.findById(id).get();
	}

	@Override
	public boolean deleteFormation(Long id) {
		formDAO.deleteById(id);
		return true;
	}

	@Override
	public List<Formation> findAllFormation() {
		return formDAO.findAll();
	}

	@Override
	public Formation updateFormation(Formation form) {
		formDAO.save(form);
		return form;
	}

	@Override
	public boolean ajouterEtudiantFormation(Long idEt, Long idForm) {
		etudDAO.ajouterEtudiantFormation(idEt, idForm);
		return true;
	}

	@Override
	public List<Etudiant> findEtudiantFormation(Long idForm) {
		return formDAO.findById(idForm).get().getEtudiants();
	}

	@Override
	public Ordinateur ajouterOrdinateur(Ordinateur ordi) {
		ordiDAO.save(ordi);
		return ordi;
	}

	@Override
	public Ordinateur getOrdinateur(Long id) {
		return ordiDAO.findById(id).get();
	}

	@Override
	public boolean deleteOrdinateur(Long id) {
		ordiDAO.deleteById(id);
		return true;
	}

	@Override
	public List<Ordinateur> findAllOrdinateur() {
		return ordiDAO.findAll();
	}

	@Override
	public Ordinateur updateOrdinateur(Ordinateur ordi) {
		ordiDAO.save(ordi);
		return ordi;
	}

	@Override
	public boolean assignerOrdinateurEtudiant(Long idEtudiant, Long idOrdinateur) {
		etudDAO.assignerOrdinateurEtudiant(idEtudiant, idOrdinateur);
		return true;
	}
		
	
}
