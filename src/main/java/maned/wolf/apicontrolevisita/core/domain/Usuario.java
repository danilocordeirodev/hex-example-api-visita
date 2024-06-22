package maned.wolf.apicontrolevisita.core.domain;

import maned.wolf.apicontrolevisita.adapter.repository.entity.PessoaEntity;

public class Usuario {

    private Long id;
    private String email;
    private String senha;
    private Boolean admistrador;
    private Pessoa pessoa;

    public Usuario() {
    }

    public Usuario(Long id, String email, String senha, Boolean admistrador, Pessoa pessoa) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.admistrador = admistrador;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getAdmistrador() {
        return admistrador;
    }

    public void setAdmistrador(Boolean admistrador) {
        this.admistrador = admistrador;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
