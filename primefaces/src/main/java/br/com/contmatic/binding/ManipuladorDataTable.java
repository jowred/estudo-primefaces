package br.com.contmatic.binding;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.SelectEvent;

@ViewScoped
@ManagedBean(name = "manipuladorDataTable")
public class ManipuladorDataTable {
    
    private DataTable dataTable;
    
    private List<Livro> livros;
    
    private Livro livroSelecionado;
    
    public Livro getLivroSelecionado() {
        return livroSelecionado;
    }

    public void setLivroSelecionado(Livro livroSelecionado) {
        this.livroSelecionado = livroSelecionado;
    }

    public ManipuladorDataTable() {
        livros = new ArrayList<Livro>();
        livros.add(new Livro(1, "A Máquina do Tempo", "H. G. Wells", "Ficção Científica", "1880"));
        livros.add(new Livro(2, "Harry Potter e a Pedra Filosofal", "J. K. Rowling", "Fantasia", "2000"));
        livros.add(new Livro(3, "ABC", "A. B. Cardoso", "Ficção Científica", "2019"));
        livros.add(new Livro(4, "O Grande Infortúnio", "L. K. Brooks", "Drama", "2007"));
        livros.add(new Livro(5, "Fogo Invisível", "M. J. J. Harries", "Fantasia", "1994"));
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public DataTable getDataTable() {
        return dataTable;
    }

    public void setDataTable(DataTable dataTable) {
        this.dataTable = dataTable;
    }
    
    public void exibirDadosLinha() {
            System.out.println("Livro selecionado:\n" +
                livroSelecionado.getId() + " | "
                    + livroSelecionado.getTitulo() + " | "
                    + livroSelecionado.getAutor() +  " | "
                    + livroSelecionado.getGenero() + " | "
                    + livroSelecionado.getAnoLancamento());
    }
    
    public void onRowSelected(SelectEvent event) {
        
    }

}
