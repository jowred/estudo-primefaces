package br.com.contmatic.binding;

public class Livro {

    private Integer id;
    
    private String titulo;
    
    private String autor;
    
    private String genero;
    
    private String anoLancamento;
    
    public Livro(Integer id, String titulo, String autor, String genero, String anoLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return this.getId() + " | "
         + this.getTitulo() + " | "
         + this.getAutor() +  " | "
         + this.getGenero() + " | "
         + this.getAnoLancamento();
    }
}
