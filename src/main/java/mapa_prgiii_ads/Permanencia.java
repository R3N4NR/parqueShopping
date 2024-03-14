package mapa_prgiii_ads;

import javax.swing.JOptionPane;

public class Permanencia {
    private Crianca crianca;
    private int qtdMinutos;
    private double valorCobranca;

    public void cadastrarPermanencia() {
        String nomeResp = JOptionPane.showInputDialog("Nome do Responsável");
        String telefoneResp = JOptionPane.showInputDialog("Telefone do Responsável");
        int idadeResp = 0;
        boolean idadeValida = false;

        while (!idadeValida) {
            try {
                idadeResp = Integer.parseInt(JOptionPane.showInputDialog("Idade do Responsável"));
                idadeValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite uma idade válida.");
            }
        }
        
        Responsavel resp = new Responsavel();

        resp.cadastrarResp(nomeResp, telefoneResp, idadeResp);

        if (resp.validarIdadeResp()) {
            String nomeCrianca = JOptionPane.showInputDialog("Nome da Criança");
            int idadeCrianca = Integer.parseInt(JOptionPane.showInputDialog("Idade da Crianca"));
            Crianca c = new Crianca();
            c.cadastrarCrianca(nomeCrianca, idadeCrianca, resp);

            this.crianca = c;

            // verifica se a criança é permitida para o brinquedo
            if (c.validarIdadeCrianca()) {
                // insere a quantidade de minutos
                this.qtdMinutos = Integer.parseInt((JOptionPane.showInputDialog(("Quantidade de Minutos"))));
                // o valor do minuto será o dobro da minutagem
                this.valorCobranca = qtdMinutos * 2;
            } else {
                JOptionPane.showMessageDialog(null, "Idade da criança excede o permitido !");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Não é possível continuar, responsável com idade inferior e permitida .");
        }
    }

    public void mostrarDadosPermanencia() {
        String msg = crianca.imprimirDadosCrianca();
        msg += "Tempo de permanencia " + qtdMinutos + "\n";
        msg += "Valor cobrança " + valorCobranca;
        JOptionPane.showMessageDialog(null, msg);
    }
}
