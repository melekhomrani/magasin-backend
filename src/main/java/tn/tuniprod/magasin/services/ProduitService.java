package tn.tuniprod.magasin.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.tuniprod.magasin.models.Produit;
import tn.tuniprod.magasin.repositories.ProduitRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProduitService {

    private final ProduitRepository produitRepository;

    public List<Produit> getProduits() {
        return produitRepository.findAll();
    }

    public Produit getProduitById(long id) {
        return produitRepository.findById(id).orElse(null);
    }

    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public boolean deleteProduit(long id) {
        produitRepository.deleteById(id);
        return true;
    }

    public Produit updateProduit(Produit produit) {
        Produit existingProduit = produitRepository.findById(produit.getId()).orElse(null);
        assert existingProduit != null;
        existingProduit.setLabelle(produit.getLabelle());
        existingProduit.setMarque(produit.getMarque());
        return produitRepository.save(existingProduit);
    }

}