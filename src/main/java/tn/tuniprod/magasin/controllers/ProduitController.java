package tn.tuniprod.magasin.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.tuniprod.magasin.models.Produit;
import tn.tuniprod.magasin.services.ProduitService;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
@AllArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @GetMapping("")
    public List<Produit> getProduits() {
        return List.of(
                Produit.builder().id(1).labelle("Produit 1").marque("Marque 1").build(),
                Produit.builder().id(2).labelle("Produit 2").marque("Marque 2").build(),
                Produit.builder().id(3).labelle("Produit 3").marque("Marque 3").build()
        );
//        return produitService.getProduits();
    }

    @GetMapping("/{id}")
    public Produit getProduitById(long id) {
        return produitService.getProduitById(id);
    }

    @PostMapping("")
    public Produit addProduit(Produit produit) {
        return produitService.saveProduit(produit);
    }

    @PostMapping("/{id}")
    public Produit updateProduit(Produit produit) {
        return produitService.updateProduit(produit);
    }

    @PostMapping("/delete")
    public boolean deleteProduit(long id) {
        return produitService.deleteProduit(id);
    }


}
