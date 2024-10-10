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
    CadProfessor() {
    }
        public CadProfessor(long id, String Nome){
            this.id = id;
            this.Nome = Nome;
        }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String Nome;
        private String Email;
        private String Senha;
        private byte[] Certificado;
        private String Endereco;
        private String CPF;
        private String statusProf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getStatusProf() {
        return statusProf;
    }

    public void setStatusProf(String statusProf) {
        this.statusProf = statusProf;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public byte[] getCertificado() {
        return Certificado;
    }

    public void setCertificado(byte[] certificado) {
        Certificado = certificado;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
