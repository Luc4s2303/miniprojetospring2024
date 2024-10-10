package br.com.itb.miniprojetospring.service;

import br.com.itb.miniprojetospring.model.CadProfessor;
import br.com.itb.miniprojetospring.model.CadProfessorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadProfessorService {

   final CadProfessorRepository cadProfessorRepository;

   public CadProfessorService(CadProfessorRepository _cadProfessorRepository) {
       this. cadProfessorRepository = _cadProfessorRepository;}

    @Transactional
    public CadProfessor save(CadProfessor _cadProfessor) {
       return cadProfessorRepository.save(_cadProfessor);
    }

    public List<CadProfessor> findAll() {
       List<CadProfessor> lista = cadProfessorRepository.findAll();
       return lista;
    }
    public CadProfessor findAllById(long id){
        CadProfessor cadProfessorEncontrado = cadProfessorRepository.findAllById(id);
        return cadProfessorEncontrado;
    }

    @Transactional
    public CadProfessor update(CadProfessor _cadProfessor) {
        CadProfessor cadProfessorEncontrado = cadProfessorRepository.findAllById (_cadProfessor.getId());
        if(cadProfessorEncontrado.getId() > 0)
            return cadProfessorRepository.save(cadProfessorEncontrado);
        else
            return new CadProfessor(0, "Cadastro não encontrado");
    }

    @Transactional
    public boolean delete(CadProfessor _cadProfessor) {
        boolean sucesso = false;
       CadProfessor cadProfessorEncontrado = cadProfessorRepository.findAllById(_cadProfessor.getId());
        if(cadProfessorEncontrado.getId() > 0) {
            cadProfessorRepository.deleteById(cadProfessorEncontrado.getId());
            sucesso = true;
        }

        return sucesso;
    }

}


