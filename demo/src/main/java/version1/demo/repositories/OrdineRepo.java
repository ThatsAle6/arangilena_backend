package version1.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import version1.demo.models.ordine.Ordine;

public interface OrdineRepo extends JpaRepository<Ordine,Long>{
    
}
