package maned.wolf.apicontrolevisita.core.domain;

public class Visitante {
    private Long id;
    private String rg;
    private Long idPessoa;

    public Visitante() {
    }

    public Visitante(Long idPessoa, String rg, Long id) {
        this.idPessoa = idPessoa;
        this.rg = rg;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
