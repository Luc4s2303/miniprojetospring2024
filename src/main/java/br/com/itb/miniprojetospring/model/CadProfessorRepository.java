package br.com.itb.miniprojetospring.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadProfessorRepository
        extends JpaRepository<CadProfessor, Long> {
    CadProfessor findAllById(long id);
}
