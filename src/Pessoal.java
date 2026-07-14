//@ADM_15MAY2026 Exercicio Módulo 1: JAVA. Tema 7 - Tarefa2: Universidade
public abstract class Pessoal {
    private String cc;
    private String nome;


    //Construtor

    public Pessoal(String cc, String nome) {
        this.cc = cc;
        this.nome = nome;

    }

    //metodos abstractos
    public abstract int salarioBase();

    public abstract int salarioTotal();

    //getters and setters

    public String getCc() {

        return cc;
    }

    public void setCc(String cc) {

        this.cc = cc;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }


}
