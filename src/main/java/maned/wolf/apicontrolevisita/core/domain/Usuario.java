package maned.wolf.apicontrolevisita.core.domain;

public class Usuario {

    private Long id;
    private String email;
    private String senha;
    private Boolean admistrador;
    private Long idPessoa;

    public Usuario() {
    }

    public Usuario(Long id, String email, String senha, Boolean admistrador) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.admistrador = admistrador;
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

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
