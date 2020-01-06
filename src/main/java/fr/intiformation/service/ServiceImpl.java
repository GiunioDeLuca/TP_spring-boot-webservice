package fr.intiformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.intiformation.dao.EtudiantDAO;
import fr.intiformation.domain.Etudiant;

@Service
public class ServiceImpl implements IService{

	@Autowired
	EtudiantDAO etudDAO;
	
	@Override
	public void ajouterProduit(Etudiant etudiant) {
		etudDAO.save(etudiant);
	}

	@Override
	public Etudiant getEtudiant(Long id) {
		return etudDAO.findById(id).get();
	}

	@Override
	public void deleteEtudiant(Long id) {
		etudDAO.deleteById(id);
	}

	@Override
	public List<Etudiant> findAll() {
		return etudDAO.findAll();
	}

	@Override
	public void updateProduit(Etudiant etudiant) {
		etudDAO.save(etudiant);
	}

	
}
