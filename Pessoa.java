public class Pessoa{
    //Atributos
    String complete_name;
    String email;
    String data;
    int idade;
    double altura;
    
    //sobrecarga caso entrada nula
    public Pessoa(){
    }

    //Método Consturtor
    public Pessoa(String nome, String aniversario, int idade, double altura){
        this.complete_name = nome;
        this.idade = idade;
        this.altura = altura;
        this.data = aniversario;
        this.email = emailPesoal();
    }
    
    private String emailPesoal(){
        String emailPessoal;
        
        //Criando email
        String nomes[] = this.complete_name.split(" ");
        emailPessoal = nomes[0].toLowerCase() + "." + nomes[nomes.length - 1].toLowerCase() + "@email.com";

        return emailPessoal;
    }
}
