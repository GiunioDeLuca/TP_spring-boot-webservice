package fr.intiformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.intiformation.dao.EtudiantDAO;
import fr.intiformation.dao.FormationDAO;
import fr.intiformation.domain.Etudiant;
import fr.intiformation.domain.Formation;

@Service
public class ServiceImpl implements IService{

	@Autowired
	EtudiantDAO etudDAO;
	
	@Autowired
	FormationDAO formDAO;
	
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

	
}
