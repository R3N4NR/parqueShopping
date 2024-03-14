package mapa_prgiii_ads;

public class Crianca {

    private String nome;
    private int idade;
    private Responsavel resp;

    //verifica se a criança tem idade para usar o brinquedo
    public boolean validarIdadeCrianca(){
        //se estiver dentro das condições retorno um true
        return idade <= 10;
    }

    public String imprimirDadosCrianca(){
        String msg = "Dados da Crianca\n";
        msg += "Nome: " + this.nome + "\n";
        msg += "Idade: " + this.idade + "\n";
        msg += resp.imprimirDadosResp();
        resp.imprimirDadosResp();

        return msg;
    }

    public void cadastrarCrianca(String nome, int idade, Responsavel resp){
        this.nome = nome;
        this.idade = idade;
        this.resp = resp;
    }

}
