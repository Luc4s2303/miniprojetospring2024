package br.com.itb.miniprojetospring.model;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CadProfessor")
public class CadProfessor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String email;
        private String senha;
        private byte[] certificado;
        private String endereco;
        private String cpf;
        private String statusProf;

    public CadProfessor(Long id, String nome, String email, String senha, byte[] certificado, String endereco, String cpf, String statusProf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.certificado = certificado;
        this.endereco = endereco;
        this.cpf = cpf;
        this.statusProf = statusProf;
    }

    public CadProfessor(String nome, String email, String senha, byte[] certificado, String endereco, String cpf, String statusProf) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.certificado = certificado;
        this.endereco = endereco;
        this.cpf = cpf;
        this.statusProf = statusProf;
    }

    public CadProfessor() {

    }

    public CadProfessor(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public byte[] getCertificado() {
        return certificado;
    }

    public void setCertificado(byte[] certificado) {
        this.certificado = certificado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getStatusProf() {
        return statusProf;
    }

    public void setStatusProf(String statusProf) {
        this.statusProf = statusProf;
    }
}
