package sn.youdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.youdev.model.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
