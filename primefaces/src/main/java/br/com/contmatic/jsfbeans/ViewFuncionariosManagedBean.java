package br.com.contmatic.jsfbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.contmatic.data.Funcionario;

@ManagedBean
@ViewScoped
public class ViewFuncionariosManagedBean {

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ViewFuncionariosManagedBean() {
        
    }
    
    @PostConstruct
    public void listaPopulada() {
        for (int i = 0; i < 10; i++) {
            Funcionario f = new Funcionario();
            f.setId(i+1);
            f.setNome("Funcionário " + (i+1));
            this.funcionarios.add(f);
        }
    }
}
