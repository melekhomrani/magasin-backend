package tn.tuniprod.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.tuniprod.magasin.models.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}