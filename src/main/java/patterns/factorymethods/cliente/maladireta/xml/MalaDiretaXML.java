package patterns.factorymethods.cliente.maladireta.xml;

import patterns.factorymethods.maladireta.lib.MalaDireta;
import patterns.factorymethods.maladireta.models.interfaces.Contatos;

public class MalaDiretaXML extends MalaDireta {

    private String nomeArquivo;

    public MalaDiretaXML(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosXML(nomeArquivo);
    }
}
