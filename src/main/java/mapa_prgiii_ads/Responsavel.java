package mapa_prgiii_ads;

public class Responsavel {
    
    private String nome;
    private String telefone;
    private int idade;
    //verifica se o responsável tem 18 anos ou mais
    public boolean validarIdadeResp(){

        //retorna um booleano se é true que é maior de 18 ou false se for menor.
        return idade >= 18;
    }

    public String imprimirDadosResp(){
        String msg = "Dados do Responsável\n";
        msg += "Nome: " + this.nome + "\n";
        msg+= "Telefone: " + this.telefone + "\n";
        msg += "Idade: " + this.idade + "\n";

        return msg;
    }

    public void cadastrarResp(String nome, String telefone, int idade){
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }
}
