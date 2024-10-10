package br.com.itb.miniprojetospring.control;

import br.com.itb.miniprojetospring.model.CadProfessor;
import br.com.itb.miniprojetospring.service.CadProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "false")
@RequestMapping("/cadProfessor")
public class CadProfessorController {

    final CadProfessorService cadProfessorService;

    public CadProfessorController(CadProfessorService _cadProfessorService) {
        this.cadProfessorService = _cadProfessorService;
    }
    @PostMapping
    public ResponseEntity<Object> saveCadProfessor(@RequestBody CadProfessor cadProfessor) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cadProfessorService.save(cadProfessor));
    }
    @GetMapping
    public ResponseEntity<Object> getCadProfessor() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(cadProfessorService.findAll());
    }
    @PutMapping
    public ResponseEntity<Object> upadateCadProfessor(@RequestBody CadProfessor cadProfessor) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cadProfessorService.update(cadProfessor));
    }
@DeleteMapping
    public ResponseEntity<Object> deleteCadProfessor(@RequestBody CadProfessor cadProfessor) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cadProfessorService.delete(cadProfessor));
}
}
