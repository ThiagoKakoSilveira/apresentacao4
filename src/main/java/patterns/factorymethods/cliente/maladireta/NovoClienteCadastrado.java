package patterns.factorymethods.cliente.maladireta;

import patterns.factorymethods.cliente.maladireta.csv.MalaDiretaCSV;
import patterns.factorymethods.cliente.maladireta.xml.MalaDiretaXML;
import patterns.factorymethods.maladireta.lib.MalaDireta;

import javax.swing.*;

public class NovoClienteCadastrado {
    public static void main(String[] args) {
        MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
        String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem de novo cliente:");

        malaDireta.enviarEmail(mensagem);
    }
}
