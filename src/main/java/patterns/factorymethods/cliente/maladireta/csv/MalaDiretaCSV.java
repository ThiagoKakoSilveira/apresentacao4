package patterns.factorymethods.cliente.maladireta.csv;

import patterns.factorymethods.maladireta.lib.MalaDireta;
import patterns.factorymethods.maladireta.models.interfaces.Contatos;

public class MalaDiretaCSV extends MalaDireta {

    private String nomeArquivo;

    public MalaDiretaCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosCSV(nomeArquivo);
    }
}
