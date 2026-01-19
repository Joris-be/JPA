package pharmacie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pharmacie.entity.Commande;


public interface CommandeRepository extends JpaRepository<Commande, Integer>{
List<Commande> findBySaisieLeAfter(java.time.LocalDate date);
}
